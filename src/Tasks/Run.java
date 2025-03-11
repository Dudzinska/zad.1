package Tasks;

import java.util.Scanner;
import java.util.Random;

public class Run {
    Scanner input = new Scanner(System.in);

    public void RunMain() {
        Menu();
    }

    private void Menu() {
        System.out.println("Zadania lab 1");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Zadanie 6\n7. Zadanie 7\n8. Wyjście");
        System.out.println("Wybierz zadanie:");

        int wybor = InputInt();
        if (wybor == 8) {
            System.out.println("Zakonczono program.");
            return;
        }

        RunTask(wybor);
    }

    public void RunTask(int wybor) {
        Task task = new Task(wybor);

        switch (wybor) {
            case 1: // Zadanie 1
                System.out.println("imie i wiek: " + task.DataOutput());
                break;

            case 2: // Zadanie 2
                System.out.println("Podaj pierwsza liczbę:");
                int a = InputInt();
                System.out.println("Podaj druga liczbe:");
                int b = InputInt();
                task.wynik(a, b);
                break;

            case 3: // Zadanie 3
                System.out.println("Podaj liczbe:");
                int num = InputInt();
                System.out.println("Czy liczba jest parzysta? " + task.parzysta(num));
                break;

            case 4: // Zadanie 4
                System.out.println("Podaj liczbe:");
                int num2 = InputInt();
                System.out.println("Czy liczba jest podzielna przez 3 i 5? " + task.podzielnosc(num2));
                break;

            case 5: // Zadanie 5
                System.out.println("Podaj liczbe:");
                int num3 = InputInt();
                System.out.println("Liczba do potegi 3: " + task.trzeciapotega(num3));
                break;

            case 6: // Zadanie 6
                System.out.println("Podaj liczbe:");
                double num4 = input.nextDouble();
                System.out.println("Pierwiastek kwadratowy: " + task.pierwiastek(num4));
                break;

            case 7: // Zadanie 7
                System.out.println("Podaj dolny zakres:");
                int aMin = InputInt();
                System.out.println("Podaj gorny zakres:");
                int aMax = InputInt();

                Random rand = new Random();
                int x = rand.nextInt(aMax - aMin + 1) + aMin;
                int y = rand.nextInt(aMax - aMin + 1) + aMin;
                int z = rand.nextInt(aMax - aMin + 1) + aMin;

                System.out.println("Wygenerowane liczby: "+x + ", "+y +"," + z);
                System.out.println(task.czytrojkat(x, y, z));
                break;
        }
    }

    private int InputInt() {
        while (!input.hasNextInt()) {
            System.out.println("Niepoprawna wartość! Podaj liczbę:");
            input.next();
        }
        return input.nextInt();
    }

    public static void main(String[] args) {
        Run program = new Run();
        program.RunMain();
    }
}