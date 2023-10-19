
public class Pr7{
	public static void main(String[] args) {
		//Switch statement in java
		int day=15;
		// if(day == 1){
		// 	System.out.println("that day is saturday");
		// }
		// else if(day == 2){
		// 	System.out.println(" that day is sunday");
		// }
		// else if(day == 3){
		// 	System.out.println("that day is monday");
		// }
		// else if(day == 4){
		// 	System.out.println("that day is tuesday");
		// }
		// else if (day == 5){
        //     System.out.println("that day is wednesday");
		// }
		// else if(day == 6){
		// 	System.out.println("that day is thursday");
		// }
		// else if(day== 7){
		// 	System.out.println("that day is friday");
		// }
		//in switch statement
		switch(day){
		case 1:
			System.out.println("that day is saturday");
			break;
		case 2:
			System.out.println("that day is sunday");
			break;
		case 3:
			System.out.println("that day is monday");
			break;
		case 4:
			System.out.println("that day is tuesday");
			break;
		case 5:
			System.out.println("that day is wednesday");
			break;
		case 6:
			System.out.println("that day is thursday");
		case 7:
			System.out.println("that day is friday");
		default:
			System.out.println("looking forward to weekend");
		}
	}
}