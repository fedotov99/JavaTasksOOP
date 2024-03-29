package com.company;

import java.util.Objects;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1.toString() +
                ", v2=" + v2.toString() +
                ", v3=" + v3.toString() +
                "]";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double a = v1.distance(v2);
        double b = v2.distance(v3);
        double c = v3.distance(v1);

        boolean isosceles = false;
        boolean equilateral = false;

        if (a == b || b == c || a == c) {
            isosceles = true;
        }

        if (a == b & b == c) {
            equilateral = true;
        }

        if (equilateral) {
            return "Triangle is " + TriangleType.EQUILATERAL;
        } else if (isosceles) {
            return "Triangle is " + TriangleType.ISOSCELES;
        }
        else {
            return "Triangle is " + TriangleType.SCALENE;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyTriangle that = (MyTriangle) o;
        return v1.equals(that.v1) &&
                v2.equals(that.v2) &&
                v3.equals(that.v3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(v1, v2, v3);
    }
}
