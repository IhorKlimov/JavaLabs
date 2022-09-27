package com.company.lab3.controller;

import com.company.lab3.model.Circle;
import com.company.lab3.model.Rectangle;
import com.company.lab3.model.Shape;
import com.company.lab3.model.Triangle;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Controller {
    private Random random = new Random();

    private static final String[] colors = new String[]{
            "Red", "Orange", "Blue", "Green", "Teal", "Cyan", "Purple", "Aqua", "Lime", "Silver"
    };
    private static final double[] sizes = new double[]{
            10, 5, 15, 20, 7, 15, 8, 9, 10, 30, 35, 31, 32
    };


    private List<Shape> shapes = new ArrayList<>();

    public Controller() {
        shapes.add(createRectangle());
        shapes.add(createRectangle());
        shapes.add(createRectangle());
        shapes.add(createRectangle());
        shapes.add(createRectangle());
        shapes.add(new Circle(getRandomColor(), getRandomSize()));
        shapes.add(new Circle(getRandomColor(), getRandomSize()));
        shapes.add(new Circle(getRandomColor(), getRandomSize()));
        shapes.add(new Circle(getRandomColor(), getRandomSize()));
        shapes.add(new Circle(getRandomColor(), getRandomSize()));
        shapes.add(new Circle(getRandomColor(), getRandomSize()));
        shapes.add(new Triangle(getRandomColor(), getRandomSize(), getRandomSize()));
        shapes.add(new Triangle(getRandomColor(), getRandomSize(), getRandomSize()));
        shapes.add(new Triangle(getRandomColor(), getRandomSize(), getRandomSize()));
        shapes.add(new Triangle(getRandomColor(), getRandomSize(), getRandomSize()));
        shapes.add(new Triangle(getRandomColor(), getRandomSize(), getRandomSize()));
        shapes.add(new Triangle(getRandomColor(), getRandomSize(), getRandomSize()));
        shapes.add(new Triangle(getRandomColor(), getRandomSize(), getRandomSize()));
    }

    public void displayData() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public double getTotalAreaOfAllShapes() {
        double total = 0;

        for (Shape shape : shapes) {
            total += shape.calcArea();
        }

        return total;
    }

    public double getTotalAreaOfShapes(Class<? extends Shape> clazz) {
        double total = 0;

        for (Shape shape : shapes) {
            if (shape.getClass() == clazz) {
                total += shape.calcArea();
            }
        }

        return total;
    }

    public void sortShapes(Comparator<Shape> comparator) {
        shapes.sort(comparator);
    }

    private Rectangle createRectangle() {
        double width;
        double height;

        while (true) {
            width = getRandomSize();
            height = getRandomSize();
            if (width != height) {
                break;
            }
        }

        return new Rectangle(getRandomColor(), width, height);
    }

    private double getRandomSize() {
        return sizes[random.nextInt(sizes.length)];
    }

    private String getRandomColor() {
        return colors[random.nextInt(colors.length)];
    }
}
