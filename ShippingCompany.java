import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class ShippingCompany {
	String name;
	String method;
	double cost;
	double speed;
	double weight = Double.POSITIVE_INFINITY;
	String city1;
	String city2;
	boolean isValid = false;
	boolean fastestSolution = false;
	boolean cheapestSolution = false;
	
	
	
	public static void main(String[] args) {
		
		ShippingCompany SC1A = new ShippingCompany();
		SC1A.name = "A";
		SC1A.method = "Air";
		SC1A.cost = 0.0105;
		SC1A.speed = 0.16;
		SC1A.weight = 500;
		SC1A.city1 = "MCO";
		SC1A.city2 = "FTW";
		SC1A.isValid = false;
		
		ShippingCompany SC1G = new ShippingCompany();
		SC1G.name = "A";
		SC1G.method = "Ground";
		SC1G.cost = 0.003;
		SC1G.speed = 1.1;
		SC1G.weight = 5000;
		SC1G.city1 = "MCO";
		SC1G.city2 = "FTW";
		SC1G.isValid = false;
		
		ShippingCompany SC2A = new ShippingCompany();
		SC2A.name = "B";
		SC2A.method = "Air";
		SC2A.cost = 0.012;
		SC2A.speed = 0.125;
		SC2A.weight = 1000;
		SC2A.city1 = "FTW";
		SC2A.city2 = "DEN";
		SC2A.isValid = false;
		
		ShippingCompany SC2G = new ShippingCompany();
		SC2G.name = "B";
		SC2G.method = "Ground";
		SC2G.cost = 0.0035;
		SC2G.speed = 1;
		SC2G.weight = 2000;
		SC2G.city1 = "FTW";
		SC2G.city2 = "DEN";
		SC2G.isValid = false;
		
		ShippingCompany SC3A = new ShippingCompany();
		SC3A.name = "C";
		SC3A.method = "Air";
		SC3A.cost = 0.095;
		SC3A.speed = 0.165;
		SC3A.weight = 100;
		SC3A.city1 = "FTW";
		SC3A.city2 = "DEN";
		SC3A.isValid = false;
		
		ShippingCompany SC3G = new ShippingCompany();
		SC3G.name = "C";
		SC3G.method = "Ground";
		SC3G.cost = 0.002;
		SC3G.speed = 1.05;
		SC3G.city1 = "FTW";
		SC3G.city2 = "DEN";
		SC3G.isValid = false;
		
		ShippingCompany SC4A = new ShippingCompany();
		SC4A.name = "D";
		SC4A.method = "Air";
		SC4A.cost = 0.025;
		SC4A.speed = 0.15;
		SC4A.city1 = "FTW";
		SC4A.city2 = "BWI";
		SC4A.isValid = false;
		
		ShippingCompany SC4G = new ShippingCompany();
		SC4G.name = "D";
		SC4G.method = "Ground";
		SC4G.cost = 0.0025;
		SC4G.speed = 0.125;
		SC4G.weight = 2500;
		SC4G.city1 = "FTW";
		SC4G.city2 = "BWI";
		SC4G.isValid = false;
		
		ShippingCompany SC5A = new ShippingCompany();
		SC5A.name = "E";
		SC5A.method = "Air";
		SC5A.cost = 0.04;
		SC5A.speed = 0.13;
		SC5A.weight = 750;
		SC5A.city1 = "DEN";
		SC5A.city2 = "BWI";
		SC5A.isValid = false;
		
		ShippingCompany SC5G = new ShippingCompany();
		SC5G.name = "E";
		SC5G.method = "Ground";
		SC5G.cost = 0.004;
		SC5G.speed = 0.15;
		SC5G.city1 = "DEN";
		SC5G.city2 = "BWI";
		SC5G.isValid = false;
		
		ShippingCompany SC6A = new ShippingCompany();
		SC6A.name = "F";
		SC6A.method = "Air";
		SC6A.cost = 0.067;
		SC6A.speed = 0.145;
		SC6A.city1 = "BWI";
		SC6A.city2 = "MCO";
		SC6A.isValid = false;
		
		ShippingCompany SC6G = new ShippingCompany();
		SC6G.name = "F";
		SC6G.method = "Ground";
		SC6G.cost = 0.0015;
		SC6G.speed = 0.95;
		SC6G.weight = 3000;
		SC6G.city1 = "BWI";
		SC6G.city2 = "MCO";
		SC6G.isValid = false;
		
		
		System.out.println("Please Enter Start City:");
		Scanner myObj = new Scanner(System.in);
		String startCity = myObj.nextLine().toUpperCase();
		
		System.out.println("Please Enter End City:");
		String endCity = myObj.nextLine().toUpperCase();
		
		System.out.println("Please Enter Cheapest or Fastest:");
		String shippingSpeed = myObj.nextLine().toUpperCase();
		
		System.out.println("Please Enter Weight of Package:");
		double weightLimit = myObj.nextDouble();
		
		
		
		if (SC1A.weight >= weightLimit) {
			if (shippingSpeed.equals("F")) {
			
				if (SC1A.city1.equals(startCity)) {
					if (SC1A.city2.equals(endCity)) {
						SC1A.isValid = true;
					}
				}
			
				if (SC1A.city2.equals(startCity)) {
					if (SC1A.city1.equals(endCity)) {
						SC1A.isValid = true;
					}
				}
			}
		}
		if (SC2A.weight >= weightLimit) {
			if (shippingSpeed.equals("F")) {
			
				if (SC2A.city1.equals(startCity)) {
					if (SC2A.city2.equals(endCity)) {
						SC2A.isValid = true;
					}
				}
			
				if (SC2A.city2.equals(startCity)) {
					if (SC2A.city1.equals(endCity)) {
						SC2A.isValid = true;
					}
				}
			}
		}
		if (SC3A.weight >= weightLimit) {
			if (shippingSpeed.equals("F")) {
			
				if (SC3A.city1.equals(startCity)) {
					if (SC3A.city2.equals(endCity)) {
						SC3A.isValid = true;
					}
				}
			
				if (SC3A.city2.equals(startCity)) {
					if (SC3A.city1.equals(endCity)) {
						SC3A.isValid = true;
					}
				}
			}
		}
		if (SC4A.weight >= weightLimit) {
			if (shippingSpeed.equals("F")) {
			
				if (SC4A.city1.equals(startCity)) {
					if (SC4A.city2.equals(endCity)) {
						SC4A.isValid = true;
					}
				}
			
				if (SC4A.city2.equals(startCity)) {
					if (SC4A.city1.equals(endCity)) {
						SC4A.isValid = true;
					}
				}
			}
		}
		if (SC5A.weight >= weightLimit) {
			if (shippingSpeed.equals("F")) {
			
				if (SC5A.city1.equals(startCity)) {
					if (SC5A.city2.equals(endCity)) {
						SC5A.isValid = true;
					}
				}
			
				if (SC5A.city2.equals(startCity)) {
					if (SC5A.city1.equals(endCity)) {
						SC5A.isValid = true;
					}
				}
			}
		}
		if (SC6A.weight >= weightLimit) {
			if (shippingSpeed.equals("F")) {
			
				if (SC6A.city1.equals(startCity)) {
					if (SC6A.city2.equals(endCity)) {
						SC6A.isValid = true;
					}
				}
			
				if (SC6A.city2.equals(startCity)) {
					if (SC6A.city1.equals(endCity)) {
						SC6A.isValid = true;
					}
				}
			}
		}
		if (SC1G.weight >= weightLimit) {
			if (shippingSpeed.equals("C")) {
			
				if (SC1G.city1.equals(startCity)) {
					if (SC1G.city2.equals(endCity)) {
						SC1G.isValid = true;
					}
				}
			
				if (SC1G.city2.equals(startCity)) {
					if (SC1G.city1.equals(endCity)) {
						SC1G.isValid = true;
					}
				}
			}
		}
		if (SC2G.weight >= weightLimit) {
			if (shippingSpeed.equals("C")) {
			
				if (SC2G.city1.equals(startCity)) {
					if (SC2G.city2.equals(endCity)) {
						SC2G.isValid = true;
					}
				}
			
				if (SC2G.city2.equals(startCity)) {
					if (SC2G.city1.equals(endCity)) {
						SC2G.isValid = true;
					}
				}
			}
		}
		if (SC3G.weight >= weightLimit) {
			if (shippingSpeed.equals("C")) {
			
				if (SC3G.city1.equals(startCity)) {
					if (SC3G.city2.equals(endCity)) {
						SC3G.isValid = true;
					}
				}
			
				if (SC3G.city2.equals(startCity)) {
					if (SC3G.city1.equals(endCity)) {
						SC3G.isValid = true;
					}
				}
			}
		}
		if (SC4G.weight >= weightLimit) {
			if (shippingSpeed.equals("C")) {
			
				if (SC4G.city1.equals(startCity)) {
					if (SC4G.city2.equals(endCity)) {
						SC4G.isValid = true;
					}
				}
			
				if (SC4G.city2.equals(startCity)) {
					if (SC4G.city1.equals(endCity)) {
						SC4G.isValid = true;
					}
				}
			}
		}
		if (SC4G.weight >= weightLimit) {
			if (shippingSpeed.equals("C")) {
			
				if (SC4G.city1.equals(startCity)) {
					if (SC4G.city2.equals(endCity)) {
						SC4G.isValid = true;
					}
				}
			
				if (SC4G.city2.equals(startCity)) {
					if (SC4G.city1.equals(endCity)) {
						SC4G.isValid = true;
					}
				}
			}
		}
		if (SC5G.weight >= weightLimit) {
			if (shippingSpeed.equals("C")) {
			
				if (SC5G.city1.equals(startCity)) {
					if (SC5G.city2.equals(endCity)) {
						SC5G.isValid = true;
					}
				}
			
				if (SC5G.city2.equals(startCity)) {
					if (SC5G.city1.equals(endCity)) {
						SC5G.isValid = true;
					}
				}
			}
		}
		
		List<Double> fastestSpeed = new ArrayList<Double>();

		if (SC1A.isValid == true) {
			fastestSpeed.add(SC1A.speed);
		}
		if (SC2A.isValid == true) {
			fastestSpeed.add(SC2A.speed);
		}
		if (SC3A.isValid == true) {
			fastestSpeed.add(SC3A.speed);
		}
		if (SC4A.isValid == true) {
			fastestSpeed.add(SC4A.speed);
		}
		if (SC5A.isValid == true) {
			fastestSpeed.add(SC5A.speed);
		}
		if (SC6A.isValid == true) {
			fastestSpeed.add(SC6A.speed);
		}
		
		Double fastestRoute = Collections.min(fastestSpeed);
		
		if (SC1A.isValid == true) {
			if (SC1A.speed == fastestRoute) {
				System.out.println("\n" + startCity + " to " + endCity + " by " + SC1A.method + " with company " + SC1A.name);
			}
		}
		if (SC2A.isValid == true) {
			if (SC2A.speed == fastestRoute) {
				System.out.println("\n" + startCity + " to " + endCity + " by " + SC2A.method + " with company " + SC2A.name);
			}
		}
		if (SC3A.isValid == true) {
			if (SC3A.speed == fastestRoute) {
				System.out.println(startCity + " to " + endCity + " by " + SC3A.method + " with company " + SC3A.name);
			}
		}
		if (SC4A.isValid == true) {
			if (SC4A.speed == fastestRoute) {
				System.out.println(startCity + " to " + endCity + " by " + SC4A.method + " with company " + SC4A.name);
			}
		}
		if (SC5A.isValid == true) {
			if (SC5A.speed == fastestRoute) {
				System.out.println(startCity + " to " + endCity + " by " + SC5A.method + " with company " + SC5A.name);
			}
		}
		if (SC6A.isValid == true) {
			if (SC6A.speed == fastestRoute) {
				System.out.println(startCity + " to " + endCity + " by " + SC6A.method + " with company " + SC6A.name);
			}
		}
		
		List<Double> cheapestCost = new ArrayList<Double>();
		
		if (SC1G.isValid == true) {
			cheapestCost.add(SC1G.speed);
		}
		if (SC2G.isValid == true) {
			cheapestCost.add(SC2G.speed);
		}
		if (SC3G.isValid == true) {
			cheapestCost.add(SC3G.speed);
		}
		if (SC4G.isValid == true) {
			cheapestCost.add(SC4G.speed);
		}
		if (SC5G.isValid == true) {
			cheapestCost.add(SC5G.speed);
		}
		if (SC6G.isValid == true) {
			cheapestCost.add(SC6G.speed);
		}
		
		Double cheapestOption = Collections.min(cheapestCost);
		
		if (SC1G.isValid == true) {
			if (SC1G.cost == cheapestOption) {
				System.out.println("\n" + startCity + " to " + endCity + " by " + SC1G.method + " with company " + SC1G.name);
			}
		}
		if (SC2G.isValid == true) {
			if (SC2G.cost == cheapestOption) {
				System.out.println("\n" + startCity + " to " + endCity + " by " + SC2G.method + " with company " + SC2G.name);
			}
		}
		if (SC3G.isValid == true) {
			if (SC3G.cost == cheapestOption) {
				System.out.println("\n" + startCity + " to " + endCity + " by " + SC3G.method + " with company " + SC3G.name);
			}
		}
		if (SC4G.isValid == true) {
			if (SC4G.cost == cheapestOption) {
				System.out.println("\n" + startCity + " to " + endCity + " by " + SC4G.method + " with company " + SC4G.name);
			}
		}
		if (SC5G.isValid == true) {
			if (SC5G.cost == cheapestOption) {
				System.out.println("\n" + startCity + " to " + endCity + " by " + SC5G.method + " with company " + SC5G.name);
			}
		}
		if (SC6G.isValid == true) {
			if (SC6G.cost == cheapestOption) {
				System.out.println("\n" + startCity + " to " + endCity + " by " + SC6G.method + " with company " + SC6G.name);
			}
		}
		else {
			System.out.println("\nNo Valid Routes");
		}
}
}