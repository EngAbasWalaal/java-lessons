
public class Pr8{
    public static void main(String[] args) {
      //create an array with for loop varibles size of 100 and whenever it reaches even number it says thisis even number
      int[] numbers=new int[900];
      for(int i=0; i < numbers.length; i++){
        numbers[i]=i+1;
          if(numbers[i]%2==0){
              System.out.println(numbers[i]+" this is even number");
              
              if(numbers[i]==100){
                break;
              }
            
          }
          else{
              System.out.println(numbers[i]+" this is odd number");
          }
      }
}
}