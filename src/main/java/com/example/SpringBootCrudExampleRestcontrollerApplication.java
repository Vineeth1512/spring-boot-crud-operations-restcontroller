package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.model.Car;

@SpringBootApplication
public class SpringBootCrudExampleRestcontrollerApplication {

	public static void main(String[] args) {
		//ConfigurableApplicationContext context = SpringApplication
			//	.run(SpringBootCrudExampleRestcontrollerApplication.class, args);
		
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Car car = context.getBean(Car.class);
		System.out.println(car.getEngineData());
	}

}
