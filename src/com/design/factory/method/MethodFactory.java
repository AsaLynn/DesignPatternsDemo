package com.design.factory.method;

import com.design.factory.share.MailSender;
import com.design.factory.share.Sender;
import com.design.factory.share.SmsSender;

/**
 * 
 * ����������,��ò�ͬ����Ĺ�����.
 * ��ͬ����������ͬ����Ĺ�����.
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
