package com.design.observer;

public interface Subject {

	// ���ӹ۲���.
	void add(Observer observer);

	// ɾ���۲���
	void del(Observer observer);

	// ֪ͨ���й۲���
	void notifyObservders();

	// ����Ĳ���.
	void operation();
}
