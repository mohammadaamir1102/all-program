package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationBase {
	private String annotation;

	public String getAnnotation() {
		return annotation;
	}

	public void setAnnotation(String annotation) {
		this.annotation = annotation;
	}

	public AnnotationBase() {
		super();
	}

	@Override
	public String toString() {
		return "AnnotationBase [annotation=" + annotation + "]";
	}
	/*
	 * Note = if we are using java 8 to java 11 then we do not need to provides the
	 * dependencies for @PostConstruct and @PreDestroy in xml file
	 * 
	 */

	// here PostConstuct is an annotation provides the configuration like init()
	// Method
	// here we can use any name at the place of init method
	@PostConstruct
	public void init() {
		System.out.println("inint call of annotationbase class");
	}

	// here PreDestroy is an annotation provides the configuration like destroy
	// method
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method call of annotation class");
	}

}
