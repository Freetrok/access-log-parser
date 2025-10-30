import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int numOne = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int numTwo = new Scanner(System.in).nextInt();
        int sum = numOne + numTwo;
        System.out.println("Сумма: " +sum);
        int diff = numOne-numTwo;
        System.out.println("Разность: " +diff);
        int composition = numOne * numTwo;
        System.out.println("Произведение: " + composition);
        double quotient = (double) numOne / numTwo;
        System.out.println("Частное: " + quotient);
    }
}
