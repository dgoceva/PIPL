package com.company;

public class Rectangle implements Figure {
    private double d1;
    private double d2;

    public Rectangle(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public double getD1() {
        return d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    @Override
    public boolean equal(Figure figure) {
        if (figure != null && figure instanceof Rectangle){
            return d1*d2 == ((Rectangle) figure).d1*((Rectangle) figure).d2;
        }
        return false;
    }

    @Override
    public void print() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "d1=" + d1 +
                ", d2=" + d2 +
                '}';
    }
}
