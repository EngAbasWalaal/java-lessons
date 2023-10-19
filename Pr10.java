public class Pr10{
    public void message(String notice, String name){
        System.out.println(notice+" "+name);
    }
    public static void main(String[] args) {
        Pr10 pr10=new Pr10();
        pr10.message("Go to your work please ","Abas");
        pr10.message("Go to your work please ","Anas abas");
        pr10.message("Go to your work please ","Amran Abas");
        pr10.message("Go to your work please ","fadima saleman");
        pr10.message("Go to your work please ","halima Haji Cismaan");
    }
}