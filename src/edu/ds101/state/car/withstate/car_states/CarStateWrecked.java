package edu.ds101.state.car.withstate.car_states;

import edu.ds101.state.car.withstate.Car;

public class CarStateWrecked implements CarState {

	@Override
	public void start(Car car) {
		System.out.println("Car is wrecked.");
	}

	@Override
	public void accelerate(Car car, double throttle, double time) {
		System.out.println("Car is wrecked.");
	}

	@Override
	public void brake(Car car, double force, double time) {
		System.out.println("Car is wrecked.");
	}

	@Override
	public void stop(Car car) {
		System.out.println("Car is wrecked.");
	}

	@Override
	public void honk(Car car) {
		System.out.println("HOOOOOOOOOOONK!!!!!");
	}

	public String toString() { return this.getClass().getSimpleName(); }

}
