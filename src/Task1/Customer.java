package Task1;

//  1.a
public class Customer {
    private String firstName;
    private String lastName;
    private String userName;
    private int id;
//    Hvis counter ikke er static, så bliver den sat til 0 hver gange
//    constructoren bliver kaldt, så alle ID ville blive sat til 1
    private static int counter;
    //  1.b
    // Constructor start
    Customer (String firstName, String lastName, String userName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        //  1.c
        counter += 1;
        this.id = counter;
    }   // Constructor end

    //  1.d
    @Override
    public String toString(){
        firstName = getFirstName();
        lastName = getLastName();
        userName = getUserName();
        id = getID();
        String result = "Name: " + firstName + " " + lastName + "\n" + "Username: " +  userName + "\n" + "ID: "+ id + "\n";
    return result;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getUserName(){
        return this.userName;
    }
    public int getID(){
        return this.id;
    }
}