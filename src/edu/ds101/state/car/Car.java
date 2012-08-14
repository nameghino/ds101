package edu.ds101.state.car;

import edu.ds101.state.car.car_states.CarStateOff;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private CarState state;
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.state = new CarStateOff();
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
		
	public void start() { state.start(this); }
	public void accelerate(double d, double e) { state.accelerate(this, d, e); }
	public void brake(double d, double e) { state.brake(this, d, e); }
	public void stop() { state.stop(this); }
	public void honk() { state.honk(this); }
	
}
