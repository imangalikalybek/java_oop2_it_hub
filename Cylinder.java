package com.company.oop2;

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea()*height;
    }

    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }

}
