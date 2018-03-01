import Ride.Car;
import Ride.Ride;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader(args[0]);
		BufferedReader buffer = new BufferedReader(file);
		String s;
		int i = 1;
		int timer = 0;
		StringTokenizer st = new StringTokenizer(buffer.readLine());
		st.nextToken();
		st.nextToken();
		int numOfCar = Integer.valueOf(st.nextToken()) ;
		int numOfRide = Integer.valueOf(st.nextToken());
		Queue<Ride> allRides = new PriorityQueue<>(numOfRide, (o1, o2) -> {
			Integer startTime = o1.getStartTime();
			return startTime.compareTo(o2.getStartTime());
		});


		List<Car> allCars = new LinkedList<>();

		while ((s = buffer.readLine()) != null){
			Ride ride = new Ride(i, s);
			if (!ride.isImpossible()) {
				allRides.add(ride);
			}
			i++;
		}

		for (int j = 0; j < numOfCar; j++) {
			allCars.add(new Car());
		}

	}
}
