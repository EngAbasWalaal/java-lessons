class Cashiers{
	private String name;
	private String dept;
	private String shift;
	private boolean isPresent;

	//set the variables
	public void setName(String name){
		this.name=name;
	}
	public void setDept(String dept){
		this.dept=dept;
	}
	public void setShift(String shift){
		this.shift=shift;
	}
	public void seIsPresent(boolean isPresent){
		this.isPresent=isPresent;
	}

	//get the variables
	public String getName(){
		return name;
	}
	public String getDept(){
		return dept;
	}
	public String getShift(){
		return shift;
	}
	public boolean getIsPresent(){
		return isPresent;
	}
}

public class Pr5{
	public static void main(String[] args){
		Cashiers cashier1=new Cashiers();
		cashier1.setName("Abbas");
		cashier1.setDept("main cashiers");
		cashier1.setShift("day");
		cashier1.seIsPresent(true);

		System.out.println(cashier1.getName());
		System.out.println(cashier1.getDept());
		System.out.println(cashier1.getShift());
	}
}