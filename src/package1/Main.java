package package1;

import package1.Lab3;

public class Main {

    public static void main(String[] args) {
      //  int[] numbers = {1, -4, 5, 6, -91, 11, 12, -16};
        int[] numbers = {-3, 5, 1, -9, 8, 16, 10, -4, 5, 2, -1};
        for(int i = 0; i < numbers.length; i++) {
            Lab3.myList.add(numbers[i]);
        }
        System.out.println(Lab3.smallestNumber(0));
    }
}
