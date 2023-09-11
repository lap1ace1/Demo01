package Project05;

import java.util.Objects;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        color = "white";
        weight = 1.0;
        radius = 1.0;
    }
    public Circle(double radius){
        color = "white";
        weight = 1.0;
        this.radius=radius;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double findArea(){
        return radius*radius*3.14;
    }

   //@Override
   //public boolean equals(Object o) {
   //    if (this == o) return true;
   //    if (o == null || getClass() != o.getClass()) return false;
   //    Circle circle = (Circle) o;
   //    return Double.compare(circle.radius, radius) == 0;
   //}


    @Override
    public boolean equals(Object obj) {
        if (this==obj){
            return true;
        }
        if (obj instanceof Circle){
            Circle circle = (Circle) obj;
            return this.radius==circle.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
