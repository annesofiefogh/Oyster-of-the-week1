package com.company;

import java.util.Arrays;

public class RotateArray {

    public int[] rotate(int[] array, int k) {
        //Running the process k amount of times
        //Starting from 1 to starting at 0
        for (int i = 1; i <= k; i++) {
            int lastIndex = array[array.length - 1];
            //Moving the elements one at a time for k amount of times
            //starting at j = 5
            for (int j = array.length - 1; j > 0; j--) {
                //Moves one element to the right in the array
                array[j] = array[j - 1];
            }
            array[0] = lastIndex;
        }
        return array;
    }


    public static void main(String[] args) {

        RotateArray rotArr = new RotateArray();

        int[] array = {1,2,3,4,5,6};

        System.out.println("Before rotation: " + Arrays.toString(array));
        //Rotate to the right
        System.out.println("After rotation: " + Arrays.toString(rotArr.rotate(array, 2)));

        }
    }
