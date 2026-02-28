public class TestShape {
    public static void main(String[] args) {
        // Menguji kelas Shape
        System.out.println("--- Pengujian Shape ---");
        Shape s1 = new Shape();
        System.out.println(s1.toString());
        Shape s2 = new Shape("blue", false);
        System.out.println(s2.toString());

        // Menguji kelas Circle
        System.out.println("\n--- Pengujian Circle ---");
        Circle c1 = new Circle(5.0, "red", true);
        System.out.println(c1.toString());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        // Menguji kelas Rectangle
        System.out.println("\n--- Pengujian Rectangle ---");
        Rectangle r1 = new Rectangle(2.0, 4.0, "yellow", false);
        System.out.println(r1.toString());
        System.out.println("Area: " + r1.getArea());

        // Menguji kelas Square
        System.out.println("\n--- Pengujian Square ---");
        Square sq1 = new Square(3.0, "purple", true);
        System.out.println(sq1.toString());
        System.out.println("Area: " + sq1.getArea()); // Menggunakan getArea warisan dari Rectangle
        
        // Menguji override setter Square
        sq1.setWidth(5.0); 
        System.out.println("Setelah setWidth(5.0) -> " + sq1.toString());
    }
}