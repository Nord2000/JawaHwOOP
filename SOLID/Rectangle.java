public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int area() {
        return this.width * this.height;
    }
}

public class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

public class LiskovSubstitutionPrincipleExample {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(4, 5);
        System.out.println(rect.area()); // Output: 20 rect.setWidth(6); System.out.println(rect.area()); // Output: 30

        Square square = new Square(5);
        System.out.println(square.area()); // Output: 25
        square.setWidth(6);
        System.out.println(square.area()); // Output: 36
    }
}