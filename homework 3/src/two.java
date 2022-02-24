public class two {
    public static void main(String[]args){
        int[]mass = new int[50];
        int a=1;
      for(int i=0;i< mass.length;i++, a+=2){
          mass[i]=a;
          System.out.print( a + " ");
      }

      for(int i =mass.length-1;i>=0;i--){

          System.out.print(mass[i] + " ");
      }

    }
}
