public class Pr27{
    public void stdInfo(String name, String classroom, int age){
        System.out.println("Name: " + name);
        System.out.println("Classroom: " + classroom);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Pr27 std1 = new Pr27();
        Pr27 std2=new Pr27();
        std1.stdInfo("John", "101", 25);
        std2.stdInfo("Anas","grade 2",3);
    }
    
}