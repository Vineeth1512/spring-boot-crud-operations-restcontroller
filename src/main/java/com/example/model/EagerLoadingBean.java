package com.example.model;

import org.springframework.stereotype.Component;

@Component

public class EagerLoadingBean {
	
	public EagerLoadingBean() {
		System.out.println("From Eager loading  object is created :");
	}

}
