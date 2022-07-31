package P3;
import P1.Shape;
import P2.Rectangle;

import java.io.IOException;
import java.util.Scanner;

public class Circle extends Shape{
    private double radius;

    @Override
    protected void getData() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of the circle: ");
        double radius = sc.nextDouble();
    }
    public double area() throws IOException {
        getData();
        return Math.PI * radius * radius;
    }
}
