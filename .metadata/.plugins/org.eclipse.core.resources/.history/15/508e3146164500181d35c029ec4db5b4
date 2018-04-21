package com.pintu.dipractice.dipractice;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{	
	


    public static void main( String[] args ) throws IOException
    {
    	System.out.println("hello");
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(Javadiconfig.class);
    	ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	PriceCalculateUtil PriceCalculateUtil = (com.pintu.dipractice.dipractice.PriceCalculateUtil) context.getBean("priceCalculateUtil");//new PriceCalculateUtil();
    	int totalPrice = PriceCalculateUtil.totalPrice(ctx);
    	UserDao userDao = ctx.getBean(UserDao.class);
    	userDao.printDatabasevalues();
    	System.out.println("TotalPrice : "+totalPrice);
    }
}
