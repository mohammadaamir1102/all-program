package com.exporter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.pojo.EmployeePojo;
import com.services.Services;
import com.utils.ConnectionToDb;

public class DataExporter {
	static int skip=0,batchSize=100;
	private static Connection con=null;
	static {
		System.out.println("getting connection-------------------");
		con=ConnectionToDb.get_Connection();
		System.out.println("got connection-----------------------"+con);
	}
	public static void main(String args[]) {
		//insertData();
		String query=null;
		Statement s=null;
		ResultSet rs=null;
		try {
			int totalCount=getTotalCounts();
			int totalPage=totalCount/batchSize;
			if(totalCount % batchSize!=0) {

				totalPage++;	
			}
			for(int startPage=1;startPage<=totalPage;startPage++) {
				System.out.println("PageNo--------------------------"+startPage);
				query=" select * from Employee order by id limit " +batchSize+  " offset " +skip;
				s=con.createStatement();
				rs=s.executeQuery(query);
				EmployeePojo employeePojo=null;
				while(rs.next()) {
					employeePojo=new EmployeePojo();
					employeePojo.setId(rs.getInt("id"));
					employeePojo.setName(rs.getString("name"));
					employeePojo.setCity(rs.getString("city"));
					employeePojo.setSalary(rs.getInt("salary"));
					employeePojo.setDesignation(rs.getString("designation"));
                    Services.convertInCsv(employeePojo);
				}
				skip=skip+batchSize;
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	static void insertData() {
		String query=null;
		PreparedStatement ps=null;
		try {
			for(int i=1;i<100000;i++) {
				query="insert into Employee(name,city,salary,designation) values('ubaid" +i
						+" ' ,'num','5000','SE')";
				System.out.println(query);
				ps=con.prepareStatement(query);
				ps.executeUpdate();
				System.out.println("count------------------------------"+i);		
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
	static int getTotalCounts() {
		Connection con=null;
		Statement ps=null;
		ResultSet rs=null;
		int totalCount=0;
		try {
			String sql="select count(*) as count from Employee";
				con=ConnectionToDb.get_Connection();
				ps=con.createStatement();
				rs=ps.executeQuery(sql);
				
				while(rs.next()) {
					totalCount=rs.getInt("count");
					System.out.println("totalCount---------------"+rs.getInt("count"));
				}
			
		} catch (Exception e) {
         e.printStackTrace();
		}
		return totalCount;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
