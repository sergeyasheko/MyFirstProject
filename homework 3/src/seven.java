public class seven {
    public static void main (String[]args){
        int[] mass = new int[12];
        for(int i=0;i<mass.length;i++){
            mass[i]=(int)(0+Math.random()*15);
            System.out.print(mass[i]+" ");
        }
        int max=mass[0];
        for(int i=1;i<mass.length;i++){
         if(mass[i]>max){
             max=mass[i];}
        }
        System.out.print("\nmax "+max );
        int j = 0;
        for(int i=0;i<mass.length;i++){
            if(mass[i]>=mass[j]){
                j=i;
            }
        }
        System.out.println("\nИндекс последнего вхождения в массив = " + j);


}}
