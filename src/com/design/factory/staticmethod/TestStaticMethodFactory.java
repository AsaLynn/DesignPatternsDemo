package com.design.factory.staticmethod;

import com.design.factory.share.Sender;

public class TestStaticMethodFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.3采用静态方法,产生对象的工厂类.
		test3();

	}
	
	private static void test3() {
		// TODO Auto-generated method stub
		Sender sender = StaticMethodFactory.produceSmsSender();
		sender.send();
		
	}

}
