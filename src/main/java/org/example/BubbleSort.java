package org.example;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Unsorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Aufruf der Methode bubbleSort zur Sortierung des Arrays
        bubbleSort(numbers);

        System.out.println("\nSorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
    // Methode zur Durchführung des Bubble-Sort-Algorithmus
    public static void bubbleSort(int[] array) {
        int length = array.length;
        boolean swapped;

        do {
            swapped = false;
            // Schleife, um benachbarte Elemente zu vergleichen und bei Bedarf zu tauschen
            for (int i = 1; i < length; i++) {
                if (array[i - 1] > array[i]) {
                    // Aufruf der Methode swap zum Tauschen von Elementen
                    swap(array, i - 1, i);
                    swapped = true;
                }
            }
            length--;
        } while (swapped); // Solange Tausche stattfinden, wird der Sortiervorgang wiederholt
    }
    // Methode zum Tauschen von Elementen in einem Array
    private static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

