package com.design.factory.abs;

import com.design.factory.share.MailSender;
import com.design.factory.share.Sender;

/**
 * ʵ�ֳ��󷽷��Ĺ�����
 * @author think
 *
 */
public class SendMailFactory implements ProviderFactoryInterf{

	public Sender produce() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
