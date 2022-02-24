import java.util.Scanner;
public class nine {
    public static void main(String[] args) {
        int n = 0, a, sum1 = 0, sum2 = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите положительное число ");
            if (scan.hasNextInt()) {
                n = scan.nextInt();
                if (n > 0) {
                    int[] mass = new int[n];
                    for (int i = 0; i < mass.length; i++) {
                        mass[i] = (int) (0 + Math.random() * 15);
                        System.out.print(mass[i] + " ");
                    }
                    a = mass.length / 2;
                    for (int i = 0; i < a; i++) {
                        sum1 = sum1 + Math.abs(mass[i]);
                    }
                    for (int i = a; i < mass.length; i++) {
                        sum2 = sum2 + Math.abs(mass[i]);
                    }
                    System.out.println();
                    if (sum1 < sum2) {
                        System.out.println("Сумма первой половины меньше ");
                    } else if (sum1 > sum2) {
                        System.out.println("Сумма второй половины больше");
                    } else {
                        System.out.println("Сумма равна");
                    }
                }else {
                    System.out.println("Вы ввели недопустимое число");
                }
            }
        } while (n <= 0) ;
    }}

