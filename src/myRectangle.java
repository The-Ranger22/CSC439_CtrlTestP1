/**
 *
 * The myRectangle class extends the abstract class myShape, and is designed to represent
 * a rectangle.
 *
 * @author  Levi Schanding
 * @version 1.1
 */
public class myRectangle extends myShape {

    /**
     * the length of the rectangle
     */
    private double length;
    /**
     * the width of the rectangle
     */
    private double width;


    /**
     * @param length the length of the rectangle
     * @param width the length of the rectangle
     */
    myRectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /**
     * @return returns the length of the rectangle.
     */
    public double getLength(){return this.length;}

    /**
     * @return returns the width of the rectangle
     */
    public double getWidth(){return this.width;}

    /**
     * Inherited from myShape. The area method computes the area of the rectangle.
     *
     * @return returns the area of the rectangle
     */
    @Override
    public double area() {
        return this.length * this.width;
    }

    /**
     * The perimeter method calculates the perimeter of the rectangle by
     * multiplying the sum of the length and width by two.
     *
     * perimeter = (2 * (length + width))
     *
     * @return returns the perimeter of the rectangle.
     */
    @Override
    public double perimeter() {
        return (2 * (this.width + this.length));
    }
}

