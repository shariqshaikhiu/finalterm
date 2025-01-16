package com.finalterm.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExamApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);

		Car car = new Car();

		int fuel=4;
		car.setFuelLevel(fuel);
		System.out.println("Fuel Level: "+car.getFuelLevel());

		car.startEngine();
		car.stopEngine();

	}

	}

}
