package com.pintu.dipractice.dipractice;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class PriceCalculateUtil {
	
	
	@Autowired
	//@Qualifier("employee")
	private EmployeeImpl emp;
	
	/*public void setEmployee(EmployeeImpl emp){
		this.emp = emp;
	}*/
	public int totalPrice(ApplicationContext ctx) throws IOException{
		//EmployeeImpl emp = ctx.getBean(EmployeeImpl.class)
		EmailUtil emailUtil = ctx.getBean(EmailUtil.class);
		emailUtil.sendMail(ctx);
		System.out.println(emp.getName());
		Pizza superPizza = ctx.getBean(Pizza.class);
		Dosa dosa = ctx.getBean(Dosa.class);
		int pizzaPrice = superPizza.price(2,"red",4);
		int dosaPrice = dosa.price(2, "cheese");
		return pizzaPrice + dosaPrice;
	}
	
}
