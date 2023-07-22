package com.zretc.ElectronicBusinessBoot;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {8, 4, 6, 77, 1, 9};
        System.out.print("未排序前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        int temp = 0;//临时变量
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length-1 -j ; i++) {
                if (arr[i] > arr[i+1]){
                    //temp
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        System.out.println(" ");
        System.out.print("排序后：");
        for(int a:arr) {
            System.out.print(a+"\t");

        }

    }



}
