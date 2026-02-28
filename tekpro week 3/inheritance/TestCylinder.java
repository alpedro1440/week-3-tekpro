public class TestCylinder { 
    public static void main(String[] args) {
        // Menguji Cylinder dengan default constructor
        Cylinder c1 = new Cylinder();
        System.out.println("--- Pengujian Silinder 1 ---");
        System.out.println("radius=" + c1.getRadius() + " height=" + c1.getHeight());
        System.out.println("surface area=" + c1.getArea() + " volume=" + c1.getVolume());
        System.out.println(c1.toString()); // Menguji toString() 
        
        // Menguji Cylinder dengan input radius dan height
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("\n--- Pengujian Silinder 2 ---");
        System.out.println("radius=" + c3.getRadius() + " height=" + c3.getHeight());
        System.out.println("surface area=" + c3.getArea() + " volume=" + c3.getVolume());
        System.out.println(c3.toString()); // Menguji toString() 
    }
}