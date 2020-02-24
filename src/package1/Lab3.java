package package1;


import java.util.ArrayList;

public class Lab3 {
    public static ArrayList<Integer> myList = new ArrayList();

    public static int smallestNumber(int start){
        //now you have access to myList and min
        Integer[] array = new Integer[myList.size()];
        array = myList.toArray(array);

        //this is the base case
        if (start == array.length - 1) {
            return array[start];
        }

        //check against the rest of the array
        int value = smallestNumber(start + 1);

        //keep checking to see if you have found a lower value
        if (array[start] < value) {
            return array[start];
        }

        //eventually the call stack gets to here and bubbles back up
        else {
            return value;
        }
    }


}







