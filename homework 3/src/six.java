public class six {
    public static void main (String[]args){
        int[]mass=new int[4];
        for(int i=0;i<mass.length;i++){
            mass[i]=(int)(0+Math.random()*10);
            System.out.print(mass[i] + "  ");
        }
        boolean a = true;
        for(int i=1;i<mass.length;i++){
             if(mass[i]<=mass[i-1]){
                 a=false;
                 break;
             }
        }
        if(a){
            System.out.println();
            System.out.println("Является ");
        }
        else{
            System.out.println();
            System.out.print("Не является ");
        }
    }}
