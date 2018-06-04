package com.sabel.array;

public class ArrayUebung {
    public static void main(String[] args) {
        int[] quadrat = new int [] {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144, 169, 196, 225, 256, 289, 324, 361};
        for (int i = 0; i < quadrat.length; i++) {
            int temp = quadrat[i];
            System.out.print(temp + ", ");
        }
        druckeArray(quadrat);
    }
    public static void druckeArray(int [] a){
        int index = 0;
        while (index <a.length){
            System.out.print(a[index] + ", ");
            index ++;
        }
    }

}
