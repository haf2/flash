package basic;

import java.util.Scanner;
class AreaTriangleDemo {
	public static void main (String args[]) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the width of the triangle:");
		double base = scanner.nextDouble();
		System.out.println("Enter the height of the triangle:");
		scanner.close();
		double height = scanner.nextDouble();
		double area=(base * height)/2;
		System.out.println("Area of Triangle is:"+area);
	}

}
