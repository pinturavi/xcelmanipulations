package com.pintu.dipractice.dipractice;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@ComponentScan(basePackages={"com.pintu.dipractice.dipractice","org.springframework.mail.javamail"})
public class Javadiconfig {
	
	/*@Bean  
	public  Pizza pizza(){
		return new Pizza();
		
	}

	@Bean  
	public  Dosa dosa(){
		return new Dosa();
		
	}
	@Bean
	public UserDao userdao(){
		return new UserDao();
	}*/
	
	
	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/pintu");
	        dataSource.setUsername("root");
	        dataSource.setPassword("cvbnm");
		 	/*ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			 dataSource = (DriverManagerDataSource) context.getBean("dataSource");*/
	        return dataSource;
	    }
	 
	    @Bean
	    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
	        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	        jdbcTemplate.setResultsMapCaseInsensitive(true);
	        return jdbcTemplate;
	    }
	    @Bean
	    public JavaMailSenderImpl mailSender(){
	    	JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
	    	Properties javaMailProperties = new Properties();
	    	javaMailProperties.setProperty("mail.transport.protocol", "smtp");
	    	javaMailProperties.setProperty("mail.smtp.auth", "true");
	    	javaMailProperties.setProperty("mail.smtp.starttls.enable", "true");
	    	javaMailProperties.setProperty("mail.debug", "true");
	    	mailSender.setHost("smtp.gmail.com");
	    	mailSender.setPort(587);
	    	mailSender.setProtocol("smtp");
	    	mailSender.setUsername("pintu541796@gmail.com");
	    	mailSender.setPassword("sRs541796");
	    	mailSender.setJavaMailProperties(javaMailProperties);
	    	return mailSender;
	    }
}
