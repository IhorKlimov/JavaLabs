package com.company.lab3.model;

public class Circle extends Shape {
    private double radius;

    public Circle(String shareColor, double radius) {
        super(shareColor);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle with radius: " + radius + ", color: " + getShareColor() + " and area: " + calcArea());
    }

    @Override
    public double calcArea() {
        return Math.PI * (radius * radius);
    }

    @Override
    public String toString() {
        return "Circle{}";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
