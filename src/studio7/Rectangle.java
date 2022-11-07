package studio7;

public class Rectangle {
	private int width;
	private int length;

	public Rectangle(int length1, int width1) {
		length = length1;
		width = width1;
		
	}
	public int area()
	{
		return length*width;
	}
	
	public int perimeter() {
		return 2*length+2*width;
	}
	
	public void square()
	{
		if (length==width)
		{
			System.out.println("It is a square");
		}
		else 
		{
			System.out.println("It is not a square");
		}
	}
		public static void compare(Rectangle r1, Rectangle r2)
	{
		if (r1.area() > r2.area())
		{
			System.out.println("Rectangle 1 is bigger than Rectangle 2");
		}
		else if (r1.area() < r2.area())
		{
			System.out.println("Rectangle 2 is bigger than Rectangle 1");
		}
		else
		{
			System.out.println("They are equal size");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle (2,2);
		Rectangle r2 = new Rectangle (6,1);
		compare (r1,r2);
		r1.square();
		r2.square();
		
		

	}

}
