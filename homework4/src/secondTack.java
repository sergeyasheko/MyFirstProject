import java.util.Scanner;
public class secondTack {
    public static void main(String[] args) {
        System.out.println("Введите целое число ");
        Scanner scan = new Scanner(System.in);
        int x = 0;
        int y = 0;
        if (scan.hasNextInt()) {
            x = scan.nextInt();
            y = x;
        }
        int mas[][] = new int[x][y];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = (int) (0 + Math.random() * 50);
                System.out.print(mas[i][j] + "  ");
            }
            System.out.println();
        }
        for (int i = 1; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if(j==i-1){
                    if(mas[i][j]%2==1){
                        System.out.println("Нечетное число под главной диагональю  " + mas[i][j]);
                }
            }
        }
    }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i==j) {
                    if (mas[i][j] % 2 == 1) {
                        System.out.println("Нечетное число на главной диагональю  " + mas[i][j]);
                    }
                }
            }
        }}}
