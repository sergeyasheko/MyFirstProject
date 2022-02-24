public class four {
    public static void main (String[]args){
        int[]mass = new int[20];
        for(int i=0;i<20;i++){
            mass[i] = (int) (0 + Math.random() * 20);
            System.out.print(mass[i] + "  ");
        }
        System.out.print("\n");
        for(int j =0;j<20;j++){
            if(j%2==1){
                mass[j]=0;
            }
            System.out.print(mass[j] + "  ");
        }

    }
}
