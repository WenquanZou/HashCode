package Ride;

public class Coordinate {
	private int x;
	private int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int findDistance(Coordinate c) {
		return this.x - c.getX() + this.y - c.getY();
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}
}
