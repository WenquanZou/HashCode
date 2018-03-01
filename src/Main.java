import Ride.Ride;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader(args[0]);
		BufferedReader buffer = new BufferedReader(file);
		String s;
		Queue<Ride> allRides = new PriorityQueue<>();
		List<Ride.Car> allCars = new LinkedList<>();
		int i = 1;
		while ((s = buffer.readLine()) != null){
			allRides.add(new Ride(i, s));
			i++;
		}

	}
}
