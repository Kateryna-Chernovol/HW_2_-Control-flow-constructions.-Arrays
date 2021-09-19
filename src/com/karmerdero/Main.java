package com.karmerdero;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        Integer [] array = {2,3,1,7,11};
        System.out.println
                ("Array before sorting: "
                        + "\n"
                        +  Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println
                ("Array sorted in descending order: "
                        + "\n"
                        +  Arrays.toString(array) + "\n");

        int sumPositiveValues = 0;
        Integer []otherArray = {-15,3,18,5,12,-3,-10,1};
        for (int i = 0; i < otherArray.length; i++){
            if (otherArray[i] > 0){
                sumPositiveValues += otherArray[i];
            }
        }
        System.out.println("We have a new array: " + "\n" + Arrays.toString(otherArray));
        System.out.println("Sum of all the positive values: " + sumPositiveValues);

        double avarage = 0;
        int count = 0;
        for (int i = 0; i < otherArray.length; i++){
            avarage += otherArray[i];
            count ++;
        }
        avarage = avarage / count;
        System.out.println("Avavage of all values: " + avarage + "\n");

        int [] thirdArray = {3,2,3,1,4,2,8,3};
        System.out.println("The third array: " + Arrays.toString(thirdArray));
        for (int i = 0; i <thirdArray.length; i++){
            for (int j = 0; j < thirdArray.length; j++){
                if (i == j) {
                    continue;
                } else if (thirdArray[i] == thirdArray[j]){
                    thirdArray[j] = 0;
                }
            }
        }
        System.out.println("Replace all duplicated values by 0: ");
        System.out.println(Arrays.toString(thirdArray));
        System.out.println();
//        System.out.println("Why arrays in java initialize with fixed size and can’t be dynamic?");
//        System.out.println("Array memory is allocated on creation. " +
//                "\n"+"When array initialized, it allocates the " +
//                "\n"+"memory according to the it's size and type. ");
    }
}
