public class eight {
    public static void main (String[]args){
        int[]one=new int[10];
        int[]two=new int[10];
        double[]three=new double[10];
        int j =0;
        for(int i=0;i<one.length;i++) {
            one[i] = (int) (Math.random() * 9+1);
            two[i] = (int)(Math.random()*9+1);
            three[i]=(one[i]/(double)two[i]);
            System.out.print(one[i] + " ");
        }
        System.out.println();
            for(int i=0;i<two.length;i++){
                System.out.print(two[i]+ " ");
            }
        System.out.println();
            for(int i=0;i<three.length;i++){
                System.out.print(three[i]+ " ");
                if(three[i]%1==0){
                    j++;
                }
            }
        System.out.println("\nКоличество целых элементов = "+j);
        }
   }

