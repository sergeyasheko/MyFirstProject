import java.util.Scanner;
public class ten {
    public static void main(String[] args) {
        int n=0,a,sum1=0,sum2=0,j=0;
        do {
            System.out.print("Введите число ");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextInt()) {
                n = scan.nextInt();
                if(n>3) {
                    int[] mas1 = new int[n];
                    for(int i=0; i<mas1.length; i++) {
                        mas1[i] = (int)(Math.random()*(n+1));
                        System.out.print(mas1[i]+" ");
                        if(mas1[i]%2==0) {
                            j++;
                        }
                    }
                    System.out.println("\n");
                    if(j!=0) {
                        int[] mas2 = new int[j];
                        j = 0;
                        for(int i=0; i<mas1.length; i++) {
                            if(mas1[i]%2==0) {
                                mas2[j] = mas1[i];
                                System.out.print(mas2[j]+" ");
                                j++;
                            }
                        }
                    } else {
                        System.out.println("Четных элементов нет");
                    }
                }else{
                    System.out.println("Вы ввели неправильное число");
                }
            }
        }while(n<=3);
    }
}