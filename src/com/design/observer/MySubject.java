package com.design.observer;

public class MySubject extends AbstractSubject {

	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("�Լ������仯!");
		notifyObservders();
	}
	
}
