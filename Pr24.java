public class Pr24{
    public static void main(String[] args) {
        String name="halimo jumpskioyr halimo";
        System.out.println("The string is "+name);

        //first index
        
        int firstIndex=name.lastIndexOf("halimo");
        System.out.println("The first index is "+firstIndex);
     
        //last index
        int lastIndex=name.lastIndexOf("i");
        System.out.println("The last index is "+lastIndex);
    }
}