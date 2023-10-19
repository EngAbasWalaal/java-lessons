import java.util.Scanner;

public class Pr17{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //create an array to store the names
        String[] names=new String[5];

        for(int i=0; i<names.length; i++) {
            System.out.println("Enter your name: "+(i+1));
            names[i]=input.nextLine();
        }

        System.out.println("Names you entered: ");
       
       for(String name:names){
           System.out.println(name);
       }
    }
}