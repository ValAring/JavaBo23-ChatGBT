package org.example;
/*
Erstelle eine Methode, die eine gegebene Zeichenkette umkehrt (z.B. "Hallo" -> "ollaH")
Implementiere eine Funktion, die überprüft, ob eine gegebene Zeichenkette ein Palindrom ist (z.B. "anna" ist ein Palindrom)
Nutze AI-aided-coding, um eine Methode zu schreiben, die die ersten n Primzahlen generiert.
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(reverseString("Ghost"));

        System.out.println("\nCheck for Palindromes: Ghost");
        System.out.println(isPalindrome("Ghost"));
        System.out.println("Check for Palindromes: Tacocat");
        System.out.println(isPalindrome("Tacocat"));

        int n = 10; // Anzahl der gewünschten Primzahlen
        int[] primeNumbers = generatePrimeNumbers(n);

        System.out.println("\nDie ersten " + n + " Primzahlen sind:");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }

    // Methode zum Umkehren einer Zeichenkette
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }

    public static boolean isPalindrome(String str) {
        // Entferne Leerzeichen und mache die Zeichenkette kleingeschrieben
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Zeichen stimmen nicht überein, keine Palindrom
            }
            left++;
            right--;
        }
        return true; // Zeichen stimmen überein, es ist ein Palindrom
    }

    //Diese Methode verwendet das Sieb des Eratosthenes, um die ersten n Primzahlen zu generieren
    // Methode zur Generierung der ersten n Primzahlen
    public static int[] generatePrimeNumbers(int n) {
        int[] primeNumbers = new int[n];
        int count = 0;
        int number = 2; // Beginne mit der Prüfung ab der Zahl 2

        while (count < n) {
            if (isPrime(number)) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
        return primeNumbers;
    }
    // Methode zur Überprüfung, ob eine Zahl eine Primzahl ist
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        if (num <= 3)
            return true;

        if (num % 2 == 0 || num % 3 == 0)
            return false;

        // Überprüfe alle Zahlen von 5 bis zur Quadratwurzel von num
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}