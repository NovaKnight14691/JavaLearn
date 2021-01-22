package homeworks.tyler;

import java.util.ArrayList;

public class SeriesUpHomework {

    public static void main(String args[]) {

        int givenValue = 2; // [1, 1, 2, 1, 2, 3]
        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 1; i <= givenValue; i++) {

            for(int j = 1; j <= i; j++) {
                output.add(j);
            }
        }

        System.out.println(toString(output));
    }

    public static String toString(ArrayList<Integer> arr) {
        String output = "[";

        for(int i = 0; i < arr.size() - 1; i++) {
            output += (arr.get(i) + ", ");
        }

        output += (arr.get(arr.size() - 1) + "]");

        return output;
    }


}
