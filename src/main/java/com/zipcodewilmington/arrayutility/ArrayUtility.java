package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
    T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }


    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate) {
        Integer count = 0;
        for(T t : arrayToMerge){
            if(t.equals(valueToEvaluate)){
                count++;
            }
        }
        for(T t : inputArray){
            if(t.equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public Integer getNumberOfOccurrences(T valueToEvaluate) {
        Integer count = 0;
        for(T t : inputArray){
            if(t.equals(valueToEvaluate)){
                count++;
            }
        }
        return count;
    }

    public T[] removeValue(T valueToRemove) {
        T[] newArr = Arrays.copyOf(inputArray,inputArray.length-getNumberOfOccurrences(valueToRemove));
        int index = 0;
        for(T t : inputArray){
            if(!t.equals(valueToRemove)){
                newArr[index] = t;
                index++;
            }
        }
        return newArr;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }
}
