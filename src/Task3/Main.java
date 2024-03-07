package Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //  3.g
        Room r1 = new Room(1, 2, 4);
        Room r2 = new Room(2, 8, 20);
        Room r3 = new Room(0, 100, 0);

        List<Room> rooms = new ArrayList<>();
        //  3.h
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        //  3.i
        Building b1 = new Building(rooms, 3, 4, false);
        System.out.println("The total number of lamps in this building "+"are: "+countLampsInBuilding(b1));
        if (isNormal(b1))
            System.out.println("This building is normal");
        else
            System.out.println("This building is not normal");
    }
    static int countLampsInBuilding(Building b){
        int sum = 0;
        for (Room room: b.getRooms()){
            sum += room.getNumberOfLamps();
        }
        return sum;
    }
    static boolean isNormal(Building b){
        if (b.getNumberOfFloors() > b.getRooms().size()) {
            return true;
        } else{
            return false;
        }
    }
}