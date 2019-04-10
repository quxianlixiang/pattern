package com.pb.entity;

import java.io.Serializable;

/**
 * @Description ¼òÀúÀà
 * @author Administrator
 *
 */
public class Resume implements Serializable{

	private String name;
	private String addr;
	private int age;
	
	public Resume() {
	}
	
	public Resume(String name, String addr, int age) {
		super();
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public int getAge() {
		return age;
	}
}
