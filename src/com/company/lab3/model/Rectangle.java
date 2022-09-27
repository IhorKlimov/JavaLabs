package com.company.lab3.model;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String shareColor, double width, double height) {
        super(shareColor);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with width: " + width + ", height: " + height + ", color: " + getShareColor() + " and area: " + calcArea());
    }

    @Override
    public double calcArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{}";
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
