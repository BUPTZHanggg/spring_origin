package com.bupt;

import com.bupt.bean.TestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Test {

    @org.junit.Test
    public void test(){
        BeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        TestBean testBean = (TestBean) xmlBeanFactory.getBean("testBean");
        System.out.println(testBean.getStr());
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
//        String p1 = "{0},你好!你于{1}在工商银上存入{2}元";
//        String p2 = "At {1,time,short} On{1,date,long} {0} paid {2,number,currency}";
//        Object[] params = {"John",new GregorianCalendar().getTime(),1.0E3};
//        String msg1 = MessageFormat.format(p1, params);
//        MessageFormat messageFormat = new MessageFormat(p2, Locale.US);
//        String format = messageFormat.format(params);
//        System.out.println(format);
//        System.out.println(msg1);
    }
}
