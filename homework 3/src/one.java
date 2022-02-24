public class one {
    public static void main(String[]args){
        int[] mass = new int[10];
        for (int i = 0, a = 2; i < mass.length; i++, a+=2) {
            mass[i] = a;
            System.out.print(mass[i] + " ");
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println("\n" + mass[i]);
        }
    }
}
