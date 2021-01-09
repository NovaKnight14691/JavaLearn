package shared.oop2;

public class DcMotor {

    private int encodingTick;
    private String brand;
    private int numberOfTicks;
    private float power;
    private static int distance = 0;

    //Constructors
    public DcMotor() {

        this(0, "AndyMark", 2048, 0.0f);

    }

    public DcMotor(int startingEncodingValue, String givenBrandName, int numberOfTicks, float power) {

        if(startingEncodingValue >= 0 && startingEncodingValue <= numberOfTicks) {
            encodingTick = startingEncodingValue;
        } else {
            encodingTick = 0;
        }

        //AndyMark and Rev
        if(givenBrandName.equals("AndyMark") || givenBrandName.equals("Rev")) {
            brand = givenBrandName;
        } else {
            brand = "AndyMark";
        }

        if(power >= 0 && power <= 1.0f) {
            this.power = power;
        } else {
            this.power = 0;
        }

    }

    //Getters and Setters
    public int getEncodingTick() {
        return encodingTick;
    }

    public int getNumberOfTicks() {
        return numberOfTicks;
    }

    public String getBrand() {
        return brand;
    }

    public void setEncodingTick(int encodingTick) {

        if(encodingTick >= 0 && encodingTick <= numberOfTicks) {
            this.encodingTick = encodingTick;
        }
    }

    public void setNumberOfTicks(int givenNumberOfTicks) {

        if(numberOfTicks > 0) {
            numberOfTicks = givenNumberOfTicks;
        }
    }

    public void setBrand(String brand) {

        if(brand.equals("AndyMark") || brand.equals("Rev")) {
            this.brand = brand;
        }
    }

    //Behavior
    public void move(float power) {
        if(distance >= 0 && power >= -1.0f && power <= 1.0f) {
            distance += 10 * power;
        }

        if(distance < 0) {
            distance = 0;
        }
    }

    public int getDistance() {
        return distance;
    }
}
