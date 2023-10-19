class Cats{
    String name;
    String home;
    int age;

    //create constructor to initialize objects
    public Cats(String name, String home, int age){
        this.name=name;
        this.home=home;
        this.age=age;
    }

    //method of displaying info
    public void displayInfo(){
        System.out.println("cat name is :"+name);
        System.out.println("cat home is :"+home);
        System.out.println("cat age is :"+age);
    }
}

public class Pr15{
    public static void main(String[] args) {
        Cats cat1=new Cats("Luna","Mumbai",2);
        Cats cat2=new Cats("Tomas","Mogadishu", 4);

        cat1.displayInfo();
        cat2.displayInfo();
    }

}