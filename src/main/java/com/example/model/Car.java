package com.example.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	@Autowired
	Engine engine;

	public Engine getEngine() {
		return engine;

	}

	public Car(Engine engine) {
		super();
		this.engine = engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getEngineData() {
		return engine.name;
	}
}
