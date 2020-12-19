package shared.oop;

public class Main {

    public static void main(String args[]) {
        Robot r1 = new Robot();  //For we now, we just set the robot to have the default parameters

        /**
         *  Below illustrates using the Robot class and testing the getters and setters.  Essentially, this part
         *  of the code illustrates the effects of getters and setters.  As evident when running the code, the robot
         *  starts with 0 wheels, 0 chassis, and owned by Nova Knight.  However, after running the setter methods, the
         *  robot now has 4 wheels, 1 chassis, and owned by Innovotics.  This is a simple illustration of Object
         *  Oriented Programming.
         */

        System.out.println("This robot has " + r1.getWheels() + " wheels, " + r1.getChassis() + " chassis, and owned by " + r1.getTeamName());

        //makes the changes
        r1.setWheels(4);
        r1.setChassis(1);
        r1.setTeamName("Innovotics");

        System.out.println("This robot has " + r1.getWheels() + " wheels, " + r1.getChassis() + " chassis, and owned by " + r1.getTeamName());

    }

}
