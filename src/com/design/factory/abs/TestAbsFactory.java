package com.design.factory.abs;

import com.design.factory.share.Sender;

public class TestAbsFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.���ò�ͬ�Ĺ�����,������ͬ�Ķ���,��������һ����������ֻ�贴��һ�������༴��,����Ķ�ԭ�д���,�����Ӧ�ó������չ��.
		test4();
	}
	
	
	private static void test4() {
		// TODO Auto-generated method stub
		SendSmsFactory factory = new SendSmsFactory();
		Sender sender = factory.produce();
		sender.send();
	}

}
