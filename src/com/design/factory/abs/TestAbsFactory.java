package com.design.factory.abs;

import com.design.factory.share.Sender;

public class TestAbsFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.采用不同的工厂类,产生不同的对象,如需增加一个对象类型只需创建一个工厂类即可,无须改动原有代码,提高了应用程序的扩展性.
		test4();
	}
	
	
	private static void test4() {
		// TODO Auto-generated method stub
		SendSmsFactory factory = new SendSmsFactory();
		Sender sender = factory.produce();
		sender.send();
	}

}
