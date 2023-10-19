public class Pr1{
	public static void main(String[] args) {
		//create array with 900 size and make it square using for loop
		int[] numbers=new int[900];
		for(int i=0; i < numbers.length; i++){
			numbers[i]=i+1;
			System.out.println("The square of "+numbers[i]+" is "+numbers[i] * numbers[i]);
		}
		


	}
}