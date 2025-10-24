package Miniproject;

public abstract class Room {
	protected double rate;
	public abstract double calculateCharge(int days);
	public abstract String getRoomType();
}

class StandardRoom extends Room {
public StandardRoom() { rate = 1000; }
public double calculateCharge(int days) { return rate * days; }
public String getRoomType() { return "Standard"; }
}

class DeluxeRoom extends Room {
public DeluxeRoom() { rate = 2000; }
public double calculateCharge(int days) { return rate * days; }
public String getRoomType() { return "Deluxe"; }
}

class SuiteRoom extends Room {
public SuiteRoom() { rate = 4000; }
public double calculateCharge(int days) { return rate * days; }
public String getRoomType() { return "Suite"; }
}
