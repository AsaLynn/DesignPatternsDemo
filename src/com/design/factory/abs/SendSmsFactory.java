package com.design.factory.abs;

import com.design.factory.share.Sender;
import com.design.factory.share.SmsSender;
/**
 * ʵ�ֳ��󷽷��Ĺ�����
 * @author think
 *
 */
public class SendSmsFactory implements ProviderFactoryInterf {

	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
