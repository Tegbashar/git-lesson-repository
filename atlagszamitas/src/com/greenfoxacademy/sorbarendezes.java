package com.greenfoxacademy;
public class sorbarendezes {
    public static void main(String[] args){
        int[] numbers = {121,-55,22365,88,-7,4545,4452224};

        int i, j;
        int lastSwap = numbers.length;
        do {
            int newN =0;
            for(j=0;j < lastSwap - 1;j++] {
                    if(numbers[j] > numbers[j+1]) {
                            int tmp = numbers[j];
                            numbers[j] =numbers[j+1];
                            numbers[j+1] = tmp;
                            newN=j;
                }
            }
        }
    }
}
