class Students{
    private String name;
    private String classRoom;
    private int age;
    private boolean isPresent;

    //setter method
    public void setName(String name){
        this.name=name;
    }
    public void setClassRoom(String classRoom){
        this.classRoom=classRoom;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setIsPresent(boolean isPresent){
        this.isPresent=isPresent;
    }

    //getter method
    public String getName(){
        return name;
    }
    public String getClassRoom(){
        return classRoom;
    }
    public int getAge(){
        return age;
    }
    public boolean getIsPresent(){
        return isPresent;
    }
}
public class Pr7{
    public static void main(String[] args) {
        Students std1=new Students();
        std1.setName("Anas Abas Mohamed");
        std1.setClassRoom("Grade one");
        std1.setAge(3);
        std1.setIsPresent(true);
        System.out.println(std1.getName());
        System.out.println(std1.getClassRoom());
        System.out.println(std1.getAge());
        if(std1.getAge() < 4){
            System.out.println(std1.getName()+" is a little student");
        }
    }
}