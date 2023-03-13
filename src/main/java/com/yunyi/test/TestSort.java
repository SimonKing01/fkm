package com.yunyi.test;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
    public static void main(String[] args) {
        int [] arr  = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Random().nextInt(100);

        }
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int [] arr2={1,2,3,4,5,6};
        twoSort(arr2,3);

    }

    static void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    static void twoSort(int [] arr, int target){
        int index=-1;
        int head=0;
        int end = arr.length-1;
        while (head<=end){
            int middle = (head+end)/2;
            if(arr[middle]>target){
                end = middle-1;
            }else
            if(arr[middle]<target){
                head=middle+1;
            }else {
                index = middle;
                break;
            }

        }
        if(index==-1){
            System.out.println("没有找到");
        }else{
            System.out.println("位置在:"+index);
        }


    }
}
