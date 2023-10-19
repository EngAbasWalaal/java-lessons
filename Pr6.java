public class Pr6{
    public static void main(String[] args){
        String[] maleStudents={"Abbas","Ali","Iise","Anas"};
        String[] femaleStudents={"Fadima","Amran","Muniira","Zamzam","Najma"};
        if(maleStudents.length < femaleStudents.length){
            System.out.println("male students are less than female students");
            System.out.println(maleStudents.length);
            for(String male:maleStudents){
                System.out.println(male);
            }
            System.out.println("------------------------");
            System.out.println(femaleStudents.length);
             for(String female:femaleStudents){
                System.out.println(female);
            }
        }
        else if(maleStudents.length > femaleStudents.length){
            System.out.println("female students are less than male students");
            for(String female:femaleStudents){
                System.out.println(female);
            }
        }
        else{
            System.out.println("they are same");
        }
    }
}