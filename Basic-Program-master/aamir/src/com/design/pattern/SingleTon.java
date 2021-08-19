package com.design.pattern;

public class SingleTon {

	private SingleTon() {
		
	}
	private static SingleTon objSingleTon;
	
	public static SingleTon getSingleTon() {
		if(objSingleTon==null) {
			objSingleTon=new SingleTon();
		}
		return objSingleTon;
	}
}
