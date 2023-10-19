class Point{
	private int x;
	private int y;


	//constructor with two parameters
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}


	//getter methods for x and y
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}

	//setter method for x and y
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}

	//a method print x and y
	public void print(){
		System.out.println("(" + x + ", " + y + ")");
	}
}
public class Constructor{
	public static void main(String[] args){
		Point point1=new Point(10, 20);

	}
}