package com.design.observer;

public class TestObserver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject subject = new MySubject();
		Observer observer1 = new ObserverA();
		Observer observer2 = new ObserverB();
		subject.add(observer1);
		subject.add(observer2);
		subject.operation();
	}

}
