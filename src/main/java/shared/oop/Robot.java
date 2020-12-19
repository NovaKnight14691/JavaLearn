package shared.oop;

public class Robot {
    /**
     * Below provides what we call the instance variables that determine the state of the function.
     * As a reminder, a state of a class is essentially the shared attributes that other types of
     * this class will inherit.  In convention, we use the "private" access modifier because we do
     * not other parts of a code to be able to change the variables directly.
     */

    private int wheels;
    private String teamName;
    private int chassis;
    private int distance;

    /**
     * Below are the constructors.  The constructors help us make instances of a class data type.
     * The first constructor listed is the default constructor because as the name suggests it sets
     * the default parameters, or configurations for a particular instance if we choose to do so.
     * Remember, you can have multiple constructors as long as either the number of parameters or data types
     * of the parameters are different.
     */

    public Robot() {

        this(0, 0, 0, "Nova Knight");
    }

    public Robot(int numberOfWheels, int currentChassis, int currentDistance, String currentTeamName) {
        wheels = numberOfWheels;
        teamName = currentTeamName;
        chassis = currentChassis;
        distance = currentDistance;
    }

    public Robot(int numberOfWheels, int currentChassis) {
        wheels = numberOfWheels;
        chassis = currentChassis;
    }

    /**
     * Below are the getters and setters.  Getters allow other parts of the program to get the values of
     * the instance variables of a particular instance.  Setters allow other parts of the program to modify
     * those instance variables.  You should have getters and setters methods for each instance variable you call.
     * It is important that those getters and setters are public because you need other parts of the program
     * to be able to access them.
     */

    public void setWheels(int x) {
        wheels = x;
    }

    public void setChassis(int x) {
        chassis = x;
    }

    public void setTeamName(String name) {
        teamName = name;
    }

    public void setDistance(int x) {
        distance = x;
    }

    public int getWheels() {
        return wheels;
    }

    public int getChassis() {
        return chassis;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getDistance() {
        return distance;
    }

    /**
     * Below are examples of the behavior of the method.  You know these are behaviors because they are
     * actions that a robot can actually do like moving forward and backwards.  Generally, they need to public
     * because you want other parts of the program to be able to access them.
     */

    public void moveForward() {
        distance += 1;
    }

    public void moveBackward() {
        distance -= 1;
    }
}
