package com.design.factory.normal;

import com.design.factory.abs.SendSmsFactory;
import com.design.factory.method.MethodFactory;
import com.design.factory.share.Sender;

public class TestNormalFactory {

	/**
	 * 测试:普通的工厂类.
	 * @param args
	 */
	public static void main(String[] args) {
		//1.1根据不同类型,产生不同对象的工厂类.
		test1();
		
		
		
		
		
		
		
	}

	

	

	
	private static void test1() {
		NormalFactory factory = new NormalFactory();
		Sender sender = factory.produce("sms");
		sender.send();
	}

}
