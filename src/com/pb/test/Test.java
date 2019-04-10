package com.pb.test;

import com.pb.entity.Resume;
import com.pb.prototype.DeepPrototype;

public class Test {

	public static void main(String[] args) {
		Resume resume = new Resume("jone", "beijing", 11);
		
		DeepPrototype deep = new DeepPrototype(resume);
		DeepPrototype clone = (DeepPrototype) deep.deepClone();
		System.out.println(clone.getResume() == deep.getResume());
	}
}
