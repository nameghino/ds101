package edu.ds101.state.car;

public class Demo {
	public static void main(String[] args) {
		ICar c = new edu.ds101.state.car.withstate.Car("Ford", "Fiesta", 2010);
		c.accelerate(0.4, 90.0);
		c.brake(900.0, 0.4);
		c.start();
		c.accelerate(0.4, 20.0);
		c.brake(900.0, 0.4);
		c.stop();
		c.start();
		c.accelerate(0.4, 60.0);
		c.brake(900.0, 0.4);
		c.stop();
		
		Mechanic m = new Mechanic();
		m.fix(c);
		c.start();
		c.accelerate(0.4, 20.0);
		c.brake(900.0, 0.4);
		c.stop();
		
		System.out.println("Using non-state car:");
		c = new edu.ds101.state.car.nostate.Car("Ford", "Fiesta", 2010);
		c.accelerate(0.4, 90.0);
		c.brake(900.0, 0.4);
		c.start();
		c.accelerate(0.4, 20.0);
		c.brake(900.0, 0.4);
		c.stop();
		c.start();
		c.accelerate(0.4, 60.0);
		c.brake(900.0, 0.4);
		c.stop();
		
		m.fix(c);
		c.start();
		c.accelerate(0.4, 20.0);
		c.brake(900.0, 0.4);
		c.stop();
		
		System.out.flush();
		System.err.flush();
		
		
	}
}
