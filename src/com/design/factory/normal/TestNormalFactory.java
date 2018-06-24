package com.design.factory.normal;

import com.design.factory.abs.SendSmsFactory;
import com.design.factory.method.MethodFactory;
import com.design.factory.share.Sender;

public class TestNormalFactory {

	/**
	 * ����:��ͨ�Ĺ�����.
	 * @param args
	 */
	public static void main(String[] args) {
		//1.1���ݲ�ͬ����,������ͬ����Ĺ�����.
		test1();
		
		
		
		
		
		
		
	}

	

	

	
	private static void test1() {
		NormalFactory factory = new NormalFactory();
		Sender sender = factory.produce("sms");
		sender.send();
	}

}
