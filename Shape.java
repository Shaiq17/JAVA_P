package P1;

import java.io.IOException;

public abstract class Shape {
    protected abstract void getData() throws IOException;
    public abstract double area() throws IOException;
}
