package com.design.factory.abs;

import com.design.factory.share.Sender;

/**
 * 抽象接口,用于工厂实现.
 * 
 * 采用不同的工厂类,产生不同的对象,如需增加一个对象类型只需创建一个工厂类即可,无须改动原有代码,提高了应用程序的扩展性.
 * @author think
 *
 */
public interface ProviderFactoryInterf {
	Sender produce();
}
