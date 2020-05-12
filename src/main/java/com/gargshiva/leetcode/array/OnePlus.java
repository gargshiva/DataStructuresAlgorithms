package com.gargshiva.leetcode.array;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class OnePlus {

    public int[] plusOne(int[] digits) {
        int end = digits.length -1;
        int numberToAdd = 1;
        do{
            int sum = digits[end] + numberToAdd;
            if(sum >=10){
                digits[end] = sum % 10;
                numberToAdd = sum/10;
                end--;
            }else{
                digits[end] = sum;
                numberToAdd=0;
            }
        }while(numberToAdd!=0 && end >=0);

        if(numberToAdd !=0){
            int[] newArr = new int[digits.length+1];
            newArr[0] = numberToAdd;
            for(int i=0 ;i < digits.length;++i){
                newArr[i+1] = digits[i];
            }
            digits = newArr;
        }
        return digits;

    }
}
