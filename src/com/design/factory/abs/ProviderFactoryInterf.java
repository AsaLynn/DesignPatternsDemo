package com.design.factory.abs;

import com.design.factory.share.Sender;

/**
 * ����ӿ�,���ڹ���ʵ��.
 * 
 * ���ò�ͬ�Ĺ�����,������ͬ�Ķ���,��������һ����������ֻ�贴��һ�������༴��,����Ķ�ԭ�д���,�����Ӧ�ó������չ��.
 * @author think
 *
 */
public interface ProviderFactoryInterf {
	Sender produce();
}
