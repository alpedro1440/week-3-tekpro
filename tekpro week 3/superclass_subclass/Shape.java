public class Shape {
    private String color;
    private boolean filled;

    // No-arg constructor menginisialisasi color ke "green" dan filled ke true
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    // Constructor dengan parameter
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Getter untuk boolean menggunakan isXXX() sesuai konvensi
    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Override toString()
    @Override
    public String toString() {
        String isItFilled = isFilled() ? "filled" : "Not filled";
        return "A Shape with color of " + color + " and " + isItFilled;
    }
}