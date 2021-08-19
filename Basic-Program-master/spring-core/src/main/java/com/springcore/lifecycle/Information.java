package com.springcore.lifecycle;

//Configure technique by interfaces;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//here InitializingBean is an interface for using initializing 
//and contain a method name is afterPropertiesSet

//here DisposeableBean is an interface for using destroying 
//and contain one method destroy

public class Information implements InitializingBean, DisposableBean {
	private String information;

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public Information(String information) {
		super();
		this.information = information;
	}

	public Information() {
		super();
	}

	@Override
	public String toString() {
		return "Information [information=" + information + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init call of information class");

	}

	public void destroy() throws Exception {
		System.out.println("destory call of infromation class");

	}

}
