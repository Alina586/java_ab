package ru.stqa.ab.sandbox;

import java.sql.SQLOutput;

import static ru.stqa.ab.sandbox.Point.distance;

public class MyFirstProgram {

  public static void main(String[] args) {

    System.out.println("Hello, world");

    Point p1 = new Point(21, 44);
    Point p2 = new Point(22, 44);
    System.out.println("Расстояние между двумя точками" + " = " + distance(p1, p2));

    System.out.println("Расстояние между двумя точками" + "=" + Point.distance(p1, p2));
  }
}