package com.design.factory.abs;

import com.design.factory.share.Sender;
import com.design.factory.share.SmsSender;
/**
 * 实现抽象方法的工厂类
 * @author think
 *
 */
public class SendSmsFactory implements ProviderFactoryInterf {

	public Sender produce() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
