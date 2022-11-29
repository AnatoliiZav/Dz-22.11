// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n) 

import java.util.Scanner;
public class Program1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int x = iScanner.nextInt();
        int s = 0;
        int n = 1;
        for (int i = 1; i <= x; i++) {
            s += i;
            n *= i;
        }
        System.out.println(s);
        System.out.println(n);
    }
}