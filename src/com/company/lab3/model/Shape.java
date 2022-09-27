package com.company.lab3.model;

public abstract class Shape implements Drawable {
    private String shareColor;

    public Shape(String shareColor) {
        this.shareColor = shareColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "Shape{" +
                "shareColor='" + shareColor + '\'' +
                '}';
    }

    public String getShareColor() {
        return shareColor;
    }

    public void setShareColor(String shareColor) {
        this.shareColor = shareColor;
    }
}
