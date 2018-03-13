package de.gbsschulen.abzaehlreim;

public class Uebungsblatt4Datenstrukturen {

    public static void bubbleSort(int[] testBubble) {
        druckeErgebnisBubble(testBubble);
        boolean getauscht;
        do {
            getauscht = false;
            for (int i = 0; i < testBubble.length-1; i++) {
                if (testBubble[i] > testBubble[i+1]) {
                    int temp = testBubble[i];
                    testBubble[i] = testBubble[i+1];
                    testBubble[i+1] = temp;
                    druckeErgebnisBubble(testBubble);
                    getauscht = true;
                }
            }
        } while (getauscht);
    }

    public static void selectionSort(int[] test){
        druckeErgebnis(test);
        for(int i = 0; i < test.length -1; i++) {
            int min = test[i];
            int pos = i;
            for(int j = i+1; j < test.length; j ++) {
                if(test[j] < min) {
                    min = test[j];
                    pos = j;
                }
            }
            test[pos] = test[i];
            test[i] = min;
            druckeErgebnis(test);
        }
    }

    public static void druckeErgebnis(int [] test){
        for (int i = 0; i < test.length; i++) {
            System.out.printf("%3d ", test[i]);
        }
        System.out.println();
        for (int i = 0; i < test.length; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println("\n---------------------------------------");
    }

    public static void druckeErgebnisBubble (int [] testBubble){
        for (int i = 0; i < testBubble.length; i++) {
            System.out.printf("%3d ", testBubble[i]);
        }
        System.out.println();
        for (int i = 0; i < testBubble.length; i++) {
            System.out.printf("%3d ", i);
        }
        System.out.println("\n ------------------------------------------");

    }

    public static void main(String[] args) {
        System.out.println("SelectionSort: ");
        int[] test = new int[]{42,13,9,27,83,1};
        selectionSort(test);
        System.out.println("bestcase: *******************");
        int[] test2 = new int[]{1,9,13,27,42,83};
        selectionSort(test2);

        System.out.println("BubbleSort: ");
        int[] testBubble = new int[]{97,13,42,-1,45,-42};
        bubbleSort(testBubble);
        System.out.println("bestcase: *******************");
        int[] testBubble2 = new int[]{-42,-1,13,42,45,97};
        bubbleSort(testBubble2);

    }




}
