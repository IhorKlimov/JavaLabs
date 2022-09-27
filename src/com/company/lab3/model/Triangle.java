package com.company.lab3.model;

public class Triangle extends Shape {
    private double baseLength;
    private double baseHeight;

    public Triangle(String shareColor, double baseLength, double baseHeight) {
        super(shareColor);
        this.baseLength = baseLength;
        this.baseHeight = baseHeight;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle with base length: " + baseLength + ", base height: " + baseHeight + ", color: " + getShareColor() + " and area: " + calcArea());
    }

    @Override
    public double calcArea() {
        return baseHeight * baseLength / 2;
    }

    @Override
    public String toString() {
        return "Triangle{}";
    }

    public double getBaseLength() {
        return baseLength;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getBaseHeight() {
        return baseHeight;
    }

    public void setBaseHeight(double baseHeight) {
        this.baseHeight = baseHeight;
    }
}
