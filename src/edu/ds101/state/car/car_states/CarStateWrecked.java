package edu.ds101.state.car.car_states;

import edu.ds101.state.car.Car;
import edu.ds101.state.car.CarState;

public class CarStateWrecked implements CarState {

	@Override
	public void start(Car car) {
		System.err.println("Car is wrecked.");
	}

	@Override
	public void accelerate(Car car, double throttle, double time) {
		System.err.println("Car is wrecked.");
	}

	@Override
	public void brake(Car car, double force, double time) {
		System.err.println("Car is wrecked.");
	}

	@Override
	public void stop(Car car) {
		System.err.println("Car is wrecked.");
	}

	@Override
	public void honk(Car car) {
		System.out.println("HOOOOOOOOOOONK!!!!!");
	}

	public String toString() { return this.getClass().getSimpleName(); }

}
