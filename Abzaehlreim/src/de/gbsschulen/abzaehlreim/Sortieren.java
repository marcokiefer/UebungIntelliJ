package de.gbsschulen.abzaehlreim;

public class Sortieren {
    // Selection Sort
    public static void selectionSort(int[] a){
        for(int i = 0; i < a.length -1; i++) {
            int min = a[i];
            int pos = i;
            for(int j = i+1; j < a.length; j ++) {
                if(a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            }
            a[pos] = a[i];
            a[i] = min;
        }
    }

    // BubbleSort (gibt mehrere Möglickeiten zur Umsetzung´)
    public static void bubbleSort(int []a){
        boolean getauscht;
        do {
            getauscht = false;
            for (int i = 0; i < a.length-1; i ++) {
                if (a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    getauscht = true;
                }
            }
        } while (getauscht);
    }
}
