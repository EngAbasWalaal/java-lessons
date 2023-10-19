import java.util.Scanner;
public class Pr18{
    public static void main(String[] args) {
      Scanner myInput=new Scanner(System.in);

      //create an array to store names
      String[] names=new String[5];

      //create a loop to make name entered till 5
      for(int i=0; i < names.length; i++){
        System.out.println("Enter Student name: "+(i+1));
        names[i]=myInput.nextLine();
      }
      System.out.println("Names you entered: ");
      System.out.println("================================================================");
      for(String name:names){
         System.out.println(name);
      }
    }
}