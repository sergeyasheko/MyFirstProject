public class five {
    public static void main (String[]args){
        int[]one = new int[5];
        int[]two = new int[5];
        for(int i=0;i<one.length;i++){
            one[i]=(int)(0+Math.random()*15);
            System.out.print(one[i]+ " ");
    }
        System.out.print("\n");
        for(int j=0;j<two.length;j++){
          two[j]=(int)(0+Math.random()*15);
            System.out.print(two[j] + " ");
        }
        double sum1 = 0;
        for(int i=0;i<one.length;i++){
            sum1=one[i]+sum1;
        }
        sum1=sum1/one.length;
        System.out.print("\n");
        System.out.print("Среднее арифметическое массива " + sum1);
        double sum2 = 0;
        for (int j=0;j<two.length;j++) {
            sum2 = two[j]+sum2;
        }
        sum2=sum2/two.length;
        System.out.print("\n");
        System.out.print("Среднее арифметическое массива " + sum2);
        if (sum1>sum2){
            System.out.print("\n");
            System.out.println("Среднее арифметическое массива 1 больше");
        }
        else if(sum1<sum2){
            System.out.print("\n");
            System.out.println("Среднее арифметическое массива 1 меньше");
        }
        else{
            System.out.print("\n");
            System.out.println("Средние арифметические равны");
            }
}}
