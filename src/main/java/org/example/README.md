# Bubble Sort Algorithm

## Überblick

Der Bubble-Sort-Algorithmus ist ein einfacher Sortieralgorithmus, der verwendet wird, um ein Array von ganzen Zahlen in aufsteigender Reihenfolge zu sortieren. Dieses Dokument erklärt die Funktionsweise des Bubble-Sort-Algorithmus anhand eines Java-Beispiels.

## Anwendung

Um den Bubble-Sort-Algorithmus auf ein Array von ganzen Zahlen anzuwenden, folgen Sie diesen Schritten:

1. Erstellen Sie ein Array von ganzen Zahlen.
2. Rufen Sie die Methode `bubbleSort` auf und übergeben Sie das Array als Argument.
3. Das Array wird nun in aufsteigender Reihenfolge sortiert.

## Funktionsweise

Der Bubble-Sort-Algorithmus funktioniert, indem er benachbarte Elemente im Array vergleicht und sie vertauscht, wenn sie in der falschen Reihenfolge sind. Dieser Prozess wird so lange wiederholt, bis keine Tausche mehr erforderlich sind. Der Algorithmus ist einfach, aber nicht sehr effizient, insbesondere für große Datenmengen.

## Java-Code

```java
package org.example;

public class BubbleSort {

    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        System.out.println("Unsorted array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers); // Aufruf der Methode bubbleSort zur Sortierung des Arrays

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
                    swap(array, i - 1, i); // Aufruf der Methode swap zum Tauschen von Elementen
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

