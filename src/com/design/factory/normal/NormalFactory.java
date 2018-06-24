package com.design.factory.normal;

import com.design.factory.share.MailSender;
import com.design.factory.share.Sender;
import com.design.factory.share.SmsSender;


/**
 * ��ͨ������.
 * �����ࡣ
 * ���ݲ�ͬ����,������ͬ����Ĺ�����.
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
			System.out.println("��������ȷ�����ͣ�");
			return null;
		}
	}
}
