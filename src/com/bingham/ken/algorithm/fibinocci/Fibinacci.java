package com.bingham.ken.algorithm.fibinocci;

public class Fibinacci {

    public static void main(String[] args){

        int maxNumber = 15;
        int previousNumber = 0;
        int nextNumber = 1;

        for(int i = 0; i < maxNumber; ++i){

            System.out.print(previousNumber + " ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
