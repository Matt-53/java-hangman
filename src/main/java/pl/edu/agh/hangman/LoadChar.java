package pl.edu.agh.hangman;

import java.util.Scanner;

public class LoadChar {

    public static int Word() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj ilość liter w słowie do odgadnięcia");
        int wordlength = sc.nextInt();
        return wordlength;
    }


    public static char Letter() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj literę do sprawdzenia");
        char letter = sc.next().charAt(0);
        return letter;
    }

    public static int Asci (int letter) {
        int index = letter;
        return index;
    }

    public static int compare(int index) {
        int i = 0;
        if (index >= 129 && index <= 154) {
            i = 1;
        } else {
            System.out.println("Litera z poza zakresu (a-z)");
        }
        return i;
    }

    public static void main() {
        int Wordlength = Word();
        int check;
        int index;
        int letter;
        boolean end = false;

        do {
            letter = Letter();
            index = Asci(letter);
            check = compare(index);
        }
        while (check == 0);
        int letterOK = letter;
    }
}

