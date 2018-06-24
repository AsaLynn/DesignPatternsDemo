package com.design.factory.staticmethod;

import com.design.factory.share.MailSender;
import com.design.factory.share.Sender;
import com.design.factory.share.SmsSender;
/*
 * 
 * ���þ�̬����,��������Ĺ�����
 * 
 */
public class StaticMethodFactory {
	
	public static Sender produceMailSender(){
		return new MailSender();
	}
	
	public static Sender produceSmsSender(){
		return new SmsSender();
	}


}
