import java.util.Scanner;

class pr4{
    public static void main(String[] args) {
        //for loop

        // for(int i=0; i <= 100; i=i+4){
        //    System.out.println(i);
        // }

        //using while loop
        // int i=0;
        // while(i <=100){
        //     System.out.println(i);
        //     i=i+4;
        // }

        //using do while loop
        int i=0;
        do{
            
            i=i+4;
            System.out.println(i);
        }
        while(i <=100);
        System.out.println("do while loop is used");
    }
}