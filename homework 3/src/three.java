public class three {
    public static void main(String[]args){
        int[]mass =new int[15];
        for(int a = 0;a<15;a++){
            mass[a]=(int)(0 + Math.random()*99);
        }
    for(int i =0;i<mass.length;i++){
    System.out.print(mass[i] + " ");
}
    int sum = 0;
   for(int i =0;i<mass.length;i++){
       if(mass[i]%2==0){
           sum = sum+1;
    }
    }
        System.out.print("\n"+"Количество четных чисел равно "+sum);
}}
