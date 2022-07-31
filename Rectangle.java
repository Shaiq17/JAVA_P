package P2;
import P1.Shape;

import java.io.IOException;
import java.util.Scanner;


public class Rectangle extends Shape {
    private double length;
    private double breadth;

    @Override
    protected void getData() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rect: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rect: ");
        double breadth = sc.nextDouble();
    }
    public double area() throws IOException {
        getData();
        return length*breadth;
    }
}
