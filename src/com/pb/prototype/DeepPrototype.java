package com.pb.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.pb.entity.Resume;

public class DeepPrototype extends Resume implements Cloneable, Serializable{

	private static final long serialVersionUID = 1L;
	private Resume resume;
	
	public DeepPrototype(Resume resume) {
		this.resume = resume;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return deepClone();
	}

	/**
	 * @tip 串行化深度克隆
	 * @return
	 */
	public Object deepClone()
	{
		ByteArrayOutputStream  bo=new ByteArrayOutputStream();
		ObjectOutputStream oo;
		try {
			oo = new ObjectOutputStream(bo);
			oo.writeObject(this);
			ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
			ObjectInputStream oi=new ObjectInputStream(bi);
			return oi.readObject();
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Resume getResume() {
		return resume;
	}
}
