/**
 * The Circle class models a circle with a radius and color.
 */
public class Circle { 
    // private instance variable
    private double radius;
    private String color; // Modifikasi: Menambahkan variabel color 

    // Constructors (overloaded)
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { 
        radius = 1.0;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and default color */
    public Circle(double r) { 
        radius = r;
        color = "red";
    }

    // Modifikasi: Menambahkan constructor Circle(radius, color) 
    /** Constructs a Circle instance with the given radius and color */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    // Modifikasi: Menambahkan setter untuk radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Modifikasi: Menambahkan Getter and setter untuk color 
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** * Return a self-descriptive string of this instance
     */
    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}