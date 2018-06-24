package com.design.observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

	private Vector<Observer> vectors = new Vector<Observer>();

	public void add(Observer observer) {
		// TODO Auto-generated method stub
		vectors.add(observer);
	}

	public void del(Observer observer) {
		// TODO Auto-generated method stub
		vectors.remove(observer);
	}

	public void notifyObservders() {
		// TODO Auto-generated method stub
		Enumeration<Observer> elements = vectors.elements();
		while (elements.hasMoreElements()) {
			elements.nextElement().update();
		}

	}

}
