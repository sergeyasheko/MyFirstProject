import java.util.Scanner;
public class fifthTask {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scan = new Scanner(System.in);
        int x = 0; int y = 0;
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
        for (int i = 0; i < mas.length; i++) {
            for (int j = i+1; j < mas[i].length; j++) {
                int temp = mas[i][j];
                mas[i][j] = mas[j][i];
                mas[j][i] = temp;
        }
    }
        System.out.println();
        System.out.println("Транспонированная матрица");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j]+"  ");
            }
            System.out.println();
    }}}
