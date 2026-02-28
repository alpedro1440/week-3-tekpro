public class Cylinder extends Circle { 
    private double height; 

    // Constructor with default color, radius and height
    public Cylinder() {
        super(); // call superclass no-arg constructor Circle() 
        this.height = 1.0;
    }

    // Constructor with default radius, color but given height
    public Cylinder(double height) {
        super(); // call superclass no-arg constructor Circle() 
        this.height = height;
    }

    // Constructor with default color, but given radius, height
    public Cylinder(double radius, double height) {
        super(radius); // call superclass constructor Circle(radius) 
        this.height = height;
    }

    // A public method for retrieving the height
    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    // Modifikasi: Overriding method getArea() untuk menghitung luas permukaan 
    @Override
    public double getArea() {
        // Luas permukaan = (2π × radius × tinggi + 2 × luas alas) 
        return (2 * Math.PI * getRadius() * height) + (2 * super.getArea());
    }

    // Modifikasi: Memperbaiki getVolume() agar menggunakan super.getArea() 
    public double getVolume() {
        return super.getArea() * height; // Memanggil getArea() dari superclass Circle 
    }

    // Modifikasi: Overriding method toString() 
    @Override
    public String toString() { 
        return "Cylinder: subclass of " + super.toString() + " height=" + height; // Menggunakan toString() milik Circle 
    }
}