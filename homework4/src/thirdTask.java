import java.util.Scanner;
public class thirdTask {
    public static void main(String[]args) {
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
        int proizv1 = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 1; j < mas[i].length; j++) {
                if(i==j){
                    proizv1*=mas[i][j];
                }
            }
        }
        System.out.print("Произведение главной диагонали = " + proizv1 + "  ");
        System.out.println();
        int proizv2 = 1;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                if(j==mas.length-i-1)
                    proizv2*=mas[i][j];
            }
        }
        System.out.print("Произведение побочной диагонали = " + proizv2 + "  ");
        System.out.println();
         if(proizv1>proizv2){
             System.out.println("Произведение главной диагонали > произведения побочной диагонали");
    }else if(proizv1<proizv2){
            System.out.println("Произведение главной диагонали < произведения побочной диагонали");
        }else{
             System.out.println("Произведение главной диагонали = произведению побочной диагонали");
         }
}}
