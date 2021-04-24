package com.practice.problems;

class GrandParent {
	void print() {
		System.out.println("GrandParent");
	}
	void gpm1() {
		System.out.println("GrandParent m1()");
	}
}

class Parent extends GrandParent {
	void print() {
		System.out.println("Parent");
	}
	void pm1() {
		System.out.println("Parent m1()");
	}
}

class Child extends Parent {
	void print() {
		System.out.println("Child");
	}
}

public class InheritanceTest {

	public static void main(String[] args) {
		GrandParent grandParent = new Parent();
		Parent parent = new Parent();
		Parent p = new Child();
		Child c = new Child();
		
		grandParent.print();
		parent.print();
		c.print(); c.pm1(); c.gpm1();
		p.print();
	}

}
