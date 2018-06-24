package com.design.factory.method;

import com.design.factory.share.Sender;

public class TestMethodFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.2不同方法产生不同对象的工厂类.
		test2();
	}

	private static void test2() {
		MethodFactory factoryMethod = new MethodFactory();
		Sender sender = factoryMethod.produceSmsSender();
		sender.send();
	}

}
