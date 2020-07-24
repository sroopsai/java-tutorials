package org.roopsai.javatutorial.classesandobjects.objects;

public class Square {
    private Point origin;
    private int sideLength = 0;

    public Square()
    {
        origin = new Point(0,0);
        sideLength = 0;
    }

    public Square(int sideLength, Point origin)
    {
        this.origin = origin;
        this.sideLength = sideLength;
    }

    public Square(int sideLength)
    {
        this.sideLength = sideLength;
        this.origin = new Point(0, 0);
    }
    public Square(Point origin)
    {
        this.sideLength = 0;
        this.origin = origin;
    }

    public void move(int x, int y)
    {
        this.origin.setOrigin(x, y);
        System.out.println("x and y setted");
    }
    public int getArea()
    {
        return sideLength*sideLength;
    }
    public String getOrigin()
    {
        return this.origin.getOrigin();
    }

    public int getSideLength()
    {
        return sideLength;
    }

    public void setSideLength(int sideLength)
    {
        this.sideLength = sideLength;
    }

}
