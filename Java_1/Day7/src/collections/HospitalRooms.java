package collections;

import java.util.TreeSet;

public class HospitalRooms {

	public static void main(String[] args) {
		TreeSet<Integer> rooms=new TreeSet<>();
		
		rooms.add(101);
		rooms.add(302);
		rooms.add(503);
		rooms.add(9093);
		rooms.add(1);
		rooms.add(1);
		rooms.add(3);
		
		System.out.println("Avalabile Rooms Are:"+rooms);
		

	}

}
