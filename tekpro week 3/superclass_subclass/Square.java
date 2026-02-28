public class Square extends Rectangle {

    // No-arg constructor
    public Square() {
        super(); // Memanggil Rectangle()
    }

    // Constructor dengan side
    public Square(double side) {
        super(side, side); // Memanggil Rectangle(width, length)
    }

    // Constructor dengan side, color, dan filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.getWidth(); // length atau width sama saja untuk persegi
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setWidth dan setLength untuk menjaga geometri persegi
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    // Override toString()
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}