package com.company.lab3.view;

import com.company.lab3.controller.Controller;
import com.company.lab3.model.Circle;
import com.company.lab3.model.Rectangle;
import com.company.lab3.model.Shape;
import com.company.lab3.model.Triangle;

import java.util.Comparator;

public class Lab3 {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.displayData();
        System.out.println("Total area of all shapes: " + controller.getTotalAreaOfAllShapes());
        System.out.println("Total area of rectangles: " + controller.getTotalAreaOfShapes(Rectangle.class));
        System.out.println("Total area of circles: " + controller.getTotalAreaOfShapes(Circle.class));
        System.out.println("Total area of triangles: " + controller.getTotalAreaOfShapes(Triangle.class));

        controller.sortShapes(Comparator.comparingDouble(Shape::calcArea));
        controller.displayData();
        controller.sortShapes(Comparator.comparing(Shape::getShareColor));
        controller.displayData();
    }
}
