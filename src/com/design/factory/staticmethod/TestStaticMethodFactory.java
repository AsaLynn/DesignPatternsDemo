package com.design.factory.staticmethod;

import com.design.factory.share.Sender;

public class TestStaticMethodFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.3���þ�̬����,��������Ĺ�����.
		test3();

	}
	
	private static void test3() {
		// TODO Auto-generated method stub
		Sender sender = StaticMethodFactory.produceSmsSender();
		sender.send();
		
	}

}
