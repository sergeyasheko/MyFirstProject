public class one {
    public static void main (String[]args){
     double a = 10;
     double b = 0;
     double sum = 0;
     for(int i=1;i<8;i++){
        sum = sum + a;
        b=(a*0.1)+a;
        a=b;
     }
        System.out.println(sum);
    }
}