package edu.ds101.state.car;

public interface ICar {
	public void start();
	public void accelerate(double throttle, double time);
	public void brake(double force, double time);
	public void stop();	
	public void honk();
	void restoreState();
}
