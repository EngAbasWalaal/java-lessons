//create a class named animals 
class Animal{
    public void eat(){
        for (int i=0; i < 100; i++){
            System.out.println("The square of "+i+" is "+i*i);
        }
    }

}
public class Pr37{
    public static void main(String[] args){
        //create an object of the class animals
        Animal a = new Animal();
        a.eat();
    }
    //create students function
    public static void students(){
        System.out.println("I am a student");
    }
    
}