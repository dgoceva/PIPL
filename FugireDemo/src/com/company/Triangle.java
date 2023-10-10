package com.company;

public class Triangle extends PlainFigure {
    public Triangle(double d1, double d2, double d3) throws TriangleException{
        super(d1, d2, d3);
        if (!(getD1()+getD2()>getD3() &&
                getD2()+getD3()>getD1() &&
                getD3()+getD1()>getD2())){
            throw new TriangleException("Bad data\n");
        }
    }

    @Override
    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-getD1())*(p-getD2())*(p-getD3()));
    }

    @Override
    public double getPerimeter() {
        return getD1()+getD2()+getD3();
    }

    public static boolean compare(Triangle t1, Triangle t2){
        return (t1.getD1()/t2.getD1() == t1.getD2()/t2.getD2()) &&
                (t1.getD1()/t2.getD1() == t1.getD3()/t2.getD3());
    }
}
