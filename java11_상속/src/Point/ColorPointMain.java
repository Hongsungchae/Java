package Point;

public class ColorPointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}

}
