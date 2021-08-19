package com.interview;

import java.util.List;

public class Student {
private Integer empId;
private String name;
private List<Integer>mark;
public Student(Integer empId, String name, List<Integer> mark) {
	super();
	this.empId = empId;
	this.name = name;
	this.mark = mark;
}
public Student() {
	super();
}
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Integer> getMark() {
	return mark;
}
public void setMark(List<Integer> mark) {
	this.mark = mark;
}
@Override
public String toString() {
	return "Student [empId=" + empId + ", name=" + name + ", mark=" + mark + "]";
}


}
