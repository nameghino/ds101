package edu.ds101.state.car;


public class Mechanic {
	public void fix(ICar car) { 
		car.restoreState();
		System.out.println("Mechanic fixed car " + car);
	}
}
