package homeworks.tyler;

import java.util.ArrayList;

public class SpanHomework {

    public static void main(String arg[]) {
        /* Consider the leftmost and righmost appearances of some value in an array.
         We'll say that the "span" is the number of elements between the two inclusive.
         A single value has a span of 1. Returns the largest span found in the given array.
         (Efficiency is not a priority.)

         [1, 2, 1, 1, 3] --> 4
         [1, 4, 2, 1, 4, 1, 4] --> 6
         */

        //1, 4, 2, 1, 4, 4 ----> unique arr method ----> 1, 4, 2

        //arr vs array lists --> <datatype>[] <arbritrary name> = new <datatype>[<length>] // {1, 2, 3, 4, 5};
        // ArrayList<*Class version of data type> *arbritrary name = new ArrayList<>();

        int[] input = {1, 2, 3, 4, 5, 6};

        ArrayList<Integer> uniqueValue = uniqueValues(input);

        if(uniqueValue.size() == input.length) {
            System.out.println(0);
        } else {
            System.out.println(getMax(findListOfDistances(input, uniqueValue)));
        }


    }

    public static ArrayList<Integer> findListOfDistances(int[] input, ArrayList<Integer> uniqueValue) {

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> uniqueArr = uniqueValues(input);

        for(int i = 0; i < uniqueArr.size(); i++) {
            int[] minAndMax = firstAndLastIndex(input, uniqueArr.get(i));

            arr.add(minAndMax[1] - minAndMax[0] + 1);
        }

        return arr;
    }


    //Supplemental Methods
    //<access modifier> <static or no static> <return type> <arbitrary name>(<datatype> <arbitrary name>)
    public static ArrayList<Integer> uniqueValues(int[] input) {

        ArrayList<Integer> finalArr = new ArrayList<>();
        finalArr.add(input[0]);

        for(int i = 0; i < input.length; i++) {
            boolean foundDuplicate = false;  //Flag Variable

            for(int j = 0; j < finalArr.size(); j++) {

                if(input[i] == finalArr.get(j)) {
                    foundDuplicate = true;
                }

            }

            if(!foundDuplicate) {
                finalArr.add(input[i]);
            }
        }

        return finalArr;

    }

    public static int getMax(ArrayList<Integer> arr) {
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
        }

        return max;

    }

    public static int[] firstAndLastIndex(int[] input, int uniqueValue) {
        int[] output = new int[2];

        for(int i = 0; i < input.length; i++) {
            if(input[i] == uniqueValue) {
                output[0] = i;
                break;
            }
        }

        for(int i = input.length - 1; i >= 0; i--) {
            if(input[i] == uniqueValue) {
                output[1] = i;
                break;
            }
        }

        return output;
    }



}
