package com.design.factory.method;

import com.design.factory.share.MailSender;
import com.design.factory.share.Sender;
import com.design.factory.share.SmsSender;

/**
 * 
 * 定义多个方法,获得不同对象的工厂类.
 * 不同方法产生不同对象的工厂类.
 * @author think
 *
 */
public class MethodFactory {

	public Sender produceMailSender(){
		return new MailSender();
	}
	
	public Sender produceSmsSender(){
		return new SmsSender();
	}

}
