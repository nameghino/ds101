package edu.ds101.state.car;

public class Demo {
	public static void main(String[] args) {
		Car c = new Car("Ford", "Fiesta", 2010);
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
		
		System.out.flush();
		System.err.flush();
		
		
	}
}
