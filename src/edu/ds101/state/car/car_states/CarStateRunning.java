package edu.ds101.state.car.car_states;

import edu.ds101.state.car.Car;
import edu.ds101.state.car.CarState;

public class CarStateRunning implements CarState {

	@Override
	public void start(Car car) {
		System.err.println("Car is already running. Cannot start.");
	}

	@Override
	public void accelerate(Car car, double throttle, double time) {
		System.out.println("Car applied " + throttle * 100.0 + " percent throttle for " + time + " seconds");
		if (time > 30.0) {
			System.out.println("WARNING: Car crashed into wall.");
			car.setState(new CarStateWrecked());
		}
	}

	@Override
	public void brake(Car car, double force, double time) {
		System.out.println("Car applied " + force + " N brakfing foce for " + time + " seconds");
	}

	@Override
	public void stop(Car car) {
		System.out.println("Car turned off.");
		car.setState(new CarStateOff());
	}

	@Override
	public void honk(Car car) {
		System.out.println("HOOOOOOOOOOONK!!!!!");
	}

	public String toString() { return this.getClass().getSimpleName(); }

}
