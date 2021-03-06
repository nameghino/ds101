package edu.ds101.state.car.withstate.car_states;

import edu.ds101.state.car.withstate.Car;

public interface CarState {
	public void start(Car car);
	public void accelerate(Car car, double d, double e);
	public void brake(Car car, double force, double time);
	public void stop(Car car);
	public void honk(Car car);
}
