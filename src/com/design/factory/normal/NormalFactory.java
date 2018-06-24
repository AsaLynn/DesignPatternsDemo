package com.design.factory.normal;

import com.design.factory.share.MailSender;
import com.design.factory.share.Sender;
import com.design.factory.share.SmsSender;


/**
 * 普通工厂类.
 * 工厂类。
 * 根据不同类型,产生不同对象的工厂类.
 * @author think
 *
 */
public class NormalFactory {
	public Sender produce(String type){
		if ("mail".equals(type)) {
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else {
			System.out.println("请输入正确的类型！");
			return null;
		}
	}
}
