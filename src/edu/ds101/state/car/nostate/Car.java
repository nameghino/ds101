package edu.ds101.state.car.nostate;

import edu.ds101.state.car.ICar;


enum CarState {
	CarStateOff,
	CarStateRunning,
	CarStateWrecked
}

public class Car implements ICar{
	
	private String make;
	private String model;
	private int year;
	private CarState state;
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.state = CarState.CarStateOff;
	}
	
	public String toString() { return "[ " + make + " " + model + " (" + year + ") ]"; }
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public CarState getState() {
		return state;
	}
	public void setState(CarState state) {
		System.out.println("Car " + this + " state changed to \"" + state + "\"");
		this.state = state;
	}
		
	public void start() {
		if (state == CarState.CarStateOff) {
			System.out.println("Car started");
			state = CarState.CarStateRunning;
		} else if (state == CarState.CarStateRunning) {
			System.out.println("Car is already running. Cannot start.");
		} else {
			System.out.println("Car is wrecked.");
		}
	}
	
	public void accelerate(double throttle, double time) {
		if (state == CarState.CarStateOff) {
			System.out.println("Car is off. Cannot accelerate.");
		} else if (state == CarState.CarStateRunning) {
			System.out.println("Car applied " + throttle * 100.0 + " percent throttle for " + time + " seconds");
			if (time > 30.0) {
				System.out.println("WARNING: Car crashed into wall.");
				state = CarState.CarStateWrecked;
			}
		} else {
			System.out.println("Car is wrecked.");
		}
	}
	
	public void brake(double force, double time) {
		if (state == CarState.CarStateOff) {
			System.out.println("Car is off. No hydraulic pressure.");
		} else if (state == CarState.CarStateRunning) {
			System.out.println("Car applied " + force + " N brakfing foce for " + time + " seconds");
		} else {
			System.out.println("Car is wrecked.");
		}
	}
	
	public void stop() {
		if (state == CarState.CarStateOff) {
			System.out.println("Car is off. Cannot stop.");
		} else if (state == CarState.CarStateRunning) {
			System.out.println("Car turned off.");
			state = CarState.CarStateOff;
		} else {
			System.out.println("Car is wrecked.");
		}
	}
	
	public void honk() {
		System.out.println("HOOOOOOOOOOONK!!!!!");
	}

	@Override
	public void restoreState() {
		state = CarState.CarStateOff;
	}
	
}
