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
		Queue<Ride> allRides = new PriorityQueue<>();
		List<Ride.Car> allCars = new LinkedList<>();
		int i = 1;
		int timer = 0;
		StringTokenizer st = new StringTokenizer(buffer.readLine());
		st.nextToken();
		st.nextToken();
		int numOfCar = Integer.valueOf(st.nextToken()) ;
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
