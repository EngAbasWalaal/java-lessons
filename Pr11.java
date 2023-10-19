
class Students{
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phone;

    public Students(String name, int age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhone(){
        return this.phone;
    }
}
public class Pr11{
    public static void main(String[] args) {
        Students std1=new Students("anas",3,"Male","Mogadishu","0615909090");
    
        System.out.println(std1.getName());
        System.out.println(std1.getAge());
        System.out.println(std1.getGender());
        System.out.println(std1.getAddress());
        System.out.println(std1.getPhone());
    }
}