public class classs{
	public static void main(String[] args){
		Rectangle rect = new Rectangle();
		rect.width = 100;
		System.out.println(rect.width);
		rect.height = 200;
		System.out.println(rect.height);

		Rectangle rect2 = new Rectangle();
		rect2.width = 10;
		System.out.println(rect2.width);
		rect2.height = 20;
		System.out.println(rect2.height);

		Point p = new Point();
		p.x = 4;
		System.out.println(p.x);
		p.y = 5;
		System.out.println(p.y);

		rect2.position = p;
		System.out.println(rect2.position.x);
		System.out.println(rect2.position.y);
	}
}
class Rectangle{
	int width;
	int height;
	Point position;
}
class Point{
	int x;
	int y;
}
