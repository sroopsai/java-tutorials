package org.roopsai.javatutorial.classesandobjects.objects;

public class CreateObjectDemo {
    public static void main(String[] args) {

        Point originOne = new Point(0, 0);
        Square newSquare = new Square(78, originOne);
        System.out.println(newSquare.getArea());
        newSquare.move(25,67);
        String newOrigin = newSquare.getOrigin();
        System.out.println(newOrigin);
        System.out.println(newSquare.getSideLength());
        newSquare.setSideLength(199);
        System.out.println(newSquare.getSideLength());
    }
}
