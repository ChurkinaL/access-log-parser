import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("Введите первое число:");
       int number= new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();

        System.out.println("Сумма чисел:");
        System.out.println(number+number2);

        System.out.println("Разность чисел:");
        System.out.println(number-number2);

        System.out.println("Произведение чисел:");
        System.out.println(number*number2);

        System.out.println("Частное чисел:");
        System.out.println((double)number/number2);
    }
}
