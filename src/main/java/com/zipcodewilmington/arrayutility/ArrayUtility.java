package com.zipcodewilmington.arrayutility;

import java.util.ArrayList;

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
        return null;
    }

    public T[] removeValue(T valueToRemove) {
        return null;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
        return null;
    }
}
