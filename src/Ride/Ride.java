package Ride;

import java.util.StringTokenizer;

public class Ride {
	private final int index;
	private Coordinate start;
	private Coordinate end;
	private int startTime;
	private int endTime;
	private int distance;


	public Ride(int index, String s) {
		this.index = index;
		StringTokenizer st = new StringTokenizer(s);
		this.start = new Coordinate(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
		this.end = new Coordinate(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()));
		this.startTime = Integer.valueOf(st.nextToken());
		this.endTime = Integer.valueOf(st.nextToken());
		this.distance = this.start.findDistance(this.end);
	}

	public boolean isImpossible() {
		return distance < endTime - startTime;
	}
}
