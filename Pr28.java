class Workers{
    String name;
    String depts;
    int salary;

    public Workers(String name, String depts, int salary) {
        this.name = name;
        this.depts = depts;
        this.salary = salary;
    
    }

    public void setName(String name) {
        this.name=name;
    }
    public void setDepts(String depts){
        this.depts=depts;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
   

    public String getName(){
        return name;
    }
    public String getDepts(){
        return depts;
    }
    public int getSalary(){
        return salary;
    }
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Department: " + depts);
        System.out.println("Salary: " + salary);
    }
}
    public class Pr28{
   public static void main(String[] args) {
    Workers worker1=new Workers("Anas","Cashier",500);
    worker1.displayInfo();
    System.out.println("================================================================");
    worker1.setName("Fadima");
    
    worker1.displayInfo();
     System.out.println("****************************************************************");
    System.out.println(worker1.getName());
   }
    }