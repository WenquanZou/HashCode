package Ride;

import java.util.LinkedList;
import java.util.List;

public class Car {
	private List<Ride> assigned_ride;
	private Ride current;
	private Coordinate currentPosition;
	private int finishTime;

	public Car() {
		this.assigned_ride = new LinkedList<>();
		this.current = null;
		this.currentPosition = new Coordinate(0, 0);
		finishTime = 0;
	}
}
