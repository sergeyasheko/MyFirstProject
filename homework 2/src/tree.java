public class tree{
    public static void main (String[]args){
        int i = 1;
        int sum = 0;
        while(i<257){
            sum = sum + i;
            i*=2;
        }
        System.out.println(sum);
    }
}