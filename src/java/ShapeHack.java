package java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
 * SuperClass implicit super constructor 
 *
 */
class Shape {
    int length;
    int breadth;
    private int test;
    
    public Shape(){}
    
    public Shape(int alength, int abreadth, int test) {
        this.length = alength;
        this.breadth= abreadth;
        this.test = test;
    }
    
    public void area() {
        System.out.println(length + " " + breadth);
    }

	public int getTest() {
		return test;
	}

	public void setTest(int test) {
		this.test = test;
	}
    
}

class Rectangle extends Shape {
    public Rectangle(int alength, int abreadth, int test){
        super(alength, abreadth, test);
    }
    
    public void area() {
        System.out.println(length*breadth);
    }
}

public class ShapeHack {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        Shape shape = new Shape(l,b,3);
        shape.area();
        System.out.println("Shape " + shape.getTest());

        Shape rectangle = new Rectangle(l,b,4);
        rectangle.area();
        System.out.println("Rectangle " + rectangle.getTest());
    }
}