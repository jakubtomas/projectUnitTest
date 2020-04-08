package com.company;

import java.util.ArrayList;

public class MyMath {

    // input number  isPrimeNumber

    public   boolean isPrimeNumber(int number ) {

        int temp;
        boolean isPrime = true;
        for(int i = 2; i<= number /2; i++)
        {
            temp= number %i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;

    }

    // input array return the minimum value

    public   int  min(int[] arr) {

        ArrayList<Integer> numberArray = new ArrayList<Integer>();


        for (int i = 0; i < arr.length ;i++) {
            numberArray.add(arr[i]);
        }

        int min = numberArray.get(0);
        for (int i : arr){
            min = min < i ? min : i;
        }

        return  min;
    }

    // trojuholnikova nerovnost  is possible

        ///
    public boolean existTriangle(int a, int b, int c) {



        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;

    }



}
