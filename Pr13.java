class Girls{
    private String name;
    private int age;
    private String Country;
    private String city;

    public Girls(String name,int age,String country,String city){
       this.name=name;
       this.age=age;
       this.Country=country;
       this.city=city;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setCountry(String country){
        this.Country = country;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getCountry(){
        return this.Country;
    }
    public String getCity(){
        return this.city;
    }
}
public class Pr13{
    public static void main(String[] args){
      Girls girl1=new Girls("halima",20,"Somalia","Mogadishu");
      
      System.out.println(girl1.getName());

      Girls girl2=new Girls("halima",20,"Somalia","Mogadishu");
      girl2.setName("Amran abbas");
      System.out.println(girl2.getName());
    }
}