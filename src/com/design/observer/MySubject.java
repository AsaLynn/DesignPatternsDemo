package com.design.observer;

public class MySubject extends AbstractSubject {

	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("自己发生变化!");
		notifyObservders();
	}
	
}
