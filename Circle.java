package gr.aueb.cf.ch17.homework;

import gr.aueb.cf.ch16.homework.p1.AbstractShape;
import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ITwoDimensional, Serializable, Cloneable {
    @Serial
    private static final long serialVersionUID = 1L;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Copy constructor
    public Circle(Circle other) {
        this.radius = other.radius;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Circle circle = (Circle) obj;
        return Double.compare(circle.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    protected Circle clone() throws CloneNotSupportedException {
        return (Circle) super.clone();
    }
}
