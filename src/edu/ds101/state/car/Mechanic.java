package edu.ds101.state.car;

import edu.ds101.state.car.car_states.CarStateOff;

public class Mechanic {
	public void fix(Car car) { 
		car.setState(new CarStateOff());
		System.out.println("Mechanic fixed car " + car);
	}
}
