package org.roopsai.javatutorial.classesandobjects.objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void setOrigin(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public String getOrigin()
    {
        return "x: " + x + "y: " + y;
    }
}
