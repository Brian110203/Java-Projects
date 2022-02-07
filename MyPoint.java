public class MyPoint {

	private double x;
	private double y;
	private String name;

	public MyPoint() {

	}

	public MyPoint(double newX, double newY, String newName) {
		x = newX;
		y = newY;
		name = newName;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String getName() {
		return name;
	}

	public void setX(double newX) {
		x = newX;
	}

	public void setY(double newY) {
		y = newY;
	}

	public void setName(String newName) {
		name = newName;
	}

	public double distance(double x2, double y2) {
		double xDelta = Math.pow(x2 - this.x, 2);
		double yDelta = Math.pow(y2 - this.y, 2);
		return Math.sqrt(xDelta + yDelta);
	}

	public double distance(MyPoint p1) {
		double xDelta = Math.pow(p1.getX() - this.x, 2);
		double yDelta = Math.pow(p1.getY() - this.y, 2);
		return Math.sqrt(xDelta + yDelta);
	}

	public static double distance(MyPoint p1, MyPoint p2) {
		double xDelta = Math.pow(p1.getX() - p2.getX(), 2);
		double yDelta = Math.pow(p1.getY() - p2.getY(), 2);
		return Math.sqrt(xDelta + yDelta);
	}

	@Override
	public String toString() {
		return ("x: " + this.x + "\ny: " + this.y);
	}
}