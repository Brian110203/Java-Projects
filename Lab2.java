import java.util.ArrayList;
import java.lang.Math;

public class Lab2 {
	public static void main(String[] args) {

    final int POINT = 5;
    double min = -25;
    double max = 25;

		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint();
		MyPoint p3 = new MyPoint();
		
		ArrayList<Double> pointList = new ArrayList<Double>();
    ArrayList<Integer> set = new ArrayList<Integer>();

    for (int i = 0-POINT; i<POINT; i++) {
      pointList.add((Math.random()*((max-min)+1)) + min);
    }

    p1.setX(pointList.get(0));
    p1.setY(pointList.get(1));
    p2.setX(pointList.get(2));
    p2.setY(pointList.get(3));
    p3.setX(pointList.get(4));
    p3.setX(pointList.get(5));

		
		double dis1 = Math.round(MyPoint.distance(p1, p2));
		
		double dis2 = Math.round(MyPoint.distance(p1, p3));
		
		double dis3 = Math.round(MyPoint.distance(p2, p3));
		
		System.out.println("-----------------------------");
		System.out.println("Number of Points: " + POINT);
		System.out.println("\np1 to p2: " + dis1);
		System.out.println("p1 to p3: " + dis2);
		System.out.println("p2 to p3: " + dis3);
		System.out.println("-----------------------------");
}
}