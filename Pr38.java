import java.util.ArrayList;
public class Pr38{
    public static void main(String[] args){
        ArrayList<String> studentsList = new ArrayList<String>();
        studentsList.add("Anas");
        studentsList.add("Halima");
        studentsList.add("Bisharo");
        studentsList.remove(1);
        System.out.println(studentsList);
    }
}