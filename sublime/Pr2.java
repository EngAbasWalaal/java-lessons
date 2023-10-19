public class Pr2{
	public void greetings(String name){
		System.out.println("Welcome "+name);
	}
	public static void main(String[] args) {
		//create instance of class in order to call a function
		Pr2 pr2=new Pr2();
		pr2.greetings("Abas Mohamed Walaal");
		pr2.greetings("Anas Abbas Mohamed");
		pr2.greetings("Fadima Saleman Mohamed");
		pr2.greetings("Amran Abbas Mohamed");
	}
}