package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Triangle t1 = new Triangle(2, 3, 4);
            t1.print();
            Triangle t2 = new Triangle(3, 4, 5);
            t2.print();
            System.out.println(t1.equal(t2));
        }catch(TriangleException e)
        {

        }
        Rectangle r1 = new Rectangle(3,4);
        r1.print();
        Rectangle r2 = new Rectangle(2,6);
        r2.print();
        System.out.println(r1.equals(r2));
    }
}
