public class Pr3{
	public static void main(String[] args) {
		String phone="0615989090";
		System.out.println(phone);
		System.out.println(phone.getClass().getSimpleName());
         
         for(int i=0; i < 2; i++){
         	System.out.println("==========================");
         }
		//changing to int
		int myphone=Integer.parseInt(phone);
		System.out.println(myphone);
		
	}
}