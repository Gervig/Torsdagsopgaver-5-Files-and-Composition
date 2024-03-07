package Task3;

public class Room {
    //  3.a
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    //  3.b
    //  Constructor start
    Room(int numberOfDoors, int numberOfLamps, int numberOfWindows){
        this.numberOfDoors = numberOfDoors;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }   //  Constructor end
    //  3.c
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }
    public int getNumberOfLamps(){
        return this.numberOfLamps;
    }
    public int getNumberOfWindows(){
        return this.numberOfWindows;
    }
}
