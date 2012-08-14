package edu.ds101.state.car.car_states;

import edu.ds101.state.car.Car;
import edu.ds101.state.car.CarState;

public class CarStateOff implements CarState {

	@Override
	public void start(Car car) {
		System.out.println("Car started");
		car.setState(new CarStateRunning());
	}

	@Override
	public void accelerate(Car car, double throttle, double time) {
		System.err.println("Car is off. Cannot accelerate.");
	}

	@Override
	public void brake(Car car, double force, double time) {
		System.err.println("Car is off. Cannot brake.");
	}

	@Override
	public void stop(Car car) {
		System.err.println("Car is off. No hydraulic pressure.");
	}

	@Override
	public void honk(Car car) {
		System.out.println("HOOOOOOOOOOONK!!!!!");
	}
	
	public String toString() { return this.getClass().getSimpleName(); }

}
