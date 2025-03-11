package Tasks;

public class Task {
    public Task(int wybor) {}

    public String DataOutput() {
        return "Klaudia, 20";
    }

    public void wynik(int a, int b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Roznica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }
    public boolean parzysta(int num) {
        return num % 2 == 0;
    }
    public boolean podzielnosc(int num) {
        return num % 3 == 0 && num % 5 == 0;
    }
    public int trzeciapotega(int num) {
        return num * num * num;
    }

    public double pierwiastek(double num) {
        return Math.sqrt(num);
    }

    public String czytrojkat(int a, int b, int c) {
        if (a * a + b * b == c * c) {
            return "Można utworzyć trójkąt prostokątny.";
        }else{
            return "Nie można utworzyć trójkąta prostokątnego.";
        }
    }
}