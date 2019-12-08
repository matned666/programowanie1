package zestaw;

import java.util.Arrays;

public class Recursion { //REKURENCJA


    public Recursion() {
    }

    public boolean findRecursion (int[] values, int valueToSearch, int startIndex){
        if(startIndex == values.length || startIndex < 0 ){
            return false;
        }
        if (valueToSearch == values[startIndex]){
            return true;
        }else{
            return findRecursion(values,valueToSearch,++startIndex);
        }
    }


    public boolean findItercion (int[] values, int valueToSearch){
        for(int el: values) {
            if (el == valueToSearch) {
                return true;
            }
        }
        return false;
    }

    public boolean findPredicate (int[] values, int valueToSearch){
        return Arrays.stream(values).anyMatch(x -> x == valueToSearch);
    }

    public int fib(int value){
        if (value == 0 ) return 0;
        if (value == 1 ) return 1;
        return fib(value - 1) + fib(value -2);

    }


//    public int findNFibonacci (int firstNumber,int seccondNumber,int currentIndex, int endIndex) {
//        if (endIndex == 0) return 0;
//        else if (endIndex == 1) return 1;
//        else if (currentIndex == endIndex) return seccondNumber;
//        else return findNFibonacci(seccondNumber, (firstNumber+seccondNumber),++currentIndex,endIndex);
//    }  //ŻLE

    public int factorial (int value){
        if (value == 0 || value == 1) return value;
        return value * factorial(value - 1);
    }


}
