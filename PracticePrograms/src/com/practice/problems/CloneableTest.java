package com.practice.problems;

public class CloneableTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		DoClone dc = new DoClone();
		System.out.println(dc.hashCode());
		System.out.println(dc.clone().hashCode());
	}

}

class DoClone implements Cloneable {
	private int a;
	
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}

