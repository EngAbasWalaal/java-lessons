class Boys{
    private String name;
    private String address;
    private int age;
    private String country;

    public Boys(String name, String address, int age, String country){
        this.name=name;
        
        this.address=address;
        this.age=age;
        this.country=country;
    }

    public String getName() {
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }
}

public class Pr12{
    public static void main(String[] args) {
        Boys boy1=new Boys("Anas abbas ", "howlwadaag", 5, "Somalia");
        System.out.println("I am "+boy1.getName()+" and i live in "+boy1.getAddress()+" and i am from "+boy1.getCountry());
        Boys boy2=new Boys("Fadima saleman ", "howlwadaag", 23, "Somalia");
        System.out.println("I am "+boy2.getName()+" and i live in "+boy2.getAddress()+" and i am from "+boy2.getCountry());
        Boys boy3=new Boys("Halima omar ", "Jeddah", 30, "Saudi");
        System.out.println("I am "+boy1.getName()+" and i live in "+boy1.getAddress()+" and i am from "+boy1.getCountry());
        Boys boy4=new Boys("Anas abbas ", "howlwadaag", 5, "Somalia");
        System.out.println("I am "+boy1.getName()+" and i live in "+boy1.getAddress()+" and i am from "+boy1.getCountry());
    }
}