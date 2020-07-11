package com.bingham.ken.algorithm.fibinocci;

public class FibinacciRecursive {

    private int max;
    private int previous;
    private int[] fibArray;
    private int index = 0;


    public FibinacciRecursive(int max){

        this.max = max;
        fibArray = new int[max];
    }

    public int getFib(int num) {

        if(index == max){
           
            return 1;
        }

        int sum = previous + num ;
        previous = num;

        return getFib(sum);
    }
    public void display(){

        getFib(1);

        for(int fib : fibArray){

            System.out.println(fib);
        }
    }

    public static void main(String[] args){

        new FibinacciRecursive(15).display();


    }
}
