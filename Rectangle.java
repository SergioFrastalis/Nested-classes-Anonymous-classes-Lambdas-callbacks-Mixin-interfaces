package gr.aueb.cf.ch17.homework;

import gr.aueb.cf.ch16.homework.p1.AbstractShape;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements ITwoDimensional, Serializable, Cloneable {
    @Serial
    private static final long serialVersionUID = 1L;
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Copy constructor
    public Rectangle(Rectangle other) {
        this.width = other.width;
        this.height = other.height;
    }

    public double getArea() {
        return width * height;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    protected Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
