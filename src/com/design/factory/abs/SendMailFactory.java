package com.design.factory.abs;

import com.design.factory.share.MailSender;
import com.design.factory.share.Sender;

/**
 * 实现抽象方法的工厂类
 * @author think
 *
 */
public class SendMailFactory implements ProviderFactoryInterf{

	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
