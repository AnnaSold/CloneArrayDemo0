import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] massiv0 = new int[5]; //объявление переменной и выделение памяти для 5 целых чисел
        //массив уже заполнен 0
        int[] massiv1 = {12, 16, 13, -8, 7, 9};

        int[] massiv2 = inputArray();

       // printArray("массив0 содержит ", massiv0);
       // printArray("массив1 содержит ", massiv1);
        printArray("массив2 содержит ", massiv2);
       // fillArray(massiv0, 193);
       // printArray("массив0 содержит ", massiv0);
        //calculeteSummaElementov(massiv2);
        //calculeteMinElement(massiv2);
        System.out.println(calculeteIndMaxElement(massiv2));

//        printArray("массив2 содержит ", massiv2);

    }

    private static void printArray(String message, int[] massiv) {
        System.out.println(message + massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }

    public static void fillArray(int[] m, int filler)
    {
        for (int i = 0; i < m.length; i++) {
            m[i] = filler;
        }
    }

    public static void readArray(int[] m)
    {
        Scanner scanner = new Scanner(System.in);
        int value;
        System.out.println("введите "+m.length+" элементов массива");
        for (int i = 0; i < m.length; i++) {
            value = scanner.nextInt();
            m[i] = value;
        }
    }

    public static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер массива 2");
        int size = scanner.nextInt();
        int[] m = new int[size];
        readArray(m);
        return m;
    }
    public static int calculeteSummaElementov(int[] massiv){
        int summa = 0;

        for (int i = 0; i < massiv.length; i++) {
            summa += massiv[i];

        }
        return summa;
    }

    public static int calculeteMinElement(int[] massiv){
        int minimum = 0;

        for (int i = 0; i < massiv.length; i++) {
            if (i==0) {
                {
                    minimum = massiv[0];
                }
                if (minimum > massiv[i]){
                minimum = massiv[i];
                }
            }

            }
        return minimum;

        }

    public static int calculeteIndMaxElement(int[] massiv){
        int maximum = massiv[0]; // проверку сделать, чтобы проверять, что массив не пустой
        int index = 0;

        for (int i = 0; i < massiv.length; i++) {

                if (maximum < massiv[i]){
                    index = i;
                }
        }
        return index;

    }

}