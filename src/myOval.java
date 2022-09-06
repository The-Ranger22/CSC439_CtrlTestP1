/**
 * The myOval class extends the abstract class myShape, and is designed to represent
 * an oval.
 * @author  Levi Schanding
 * @version 1.1
 */
public class myOval extends myShape {




    /**
     * majorAxis - the major axis of the oval
     * minorAxis - the minor axis of the oval
     */
    private double majorAxis, minorAxis;

    /**
     * An object constructor for myOval that takes two doubles to
     * set the major axis and minor axis of the oval.
     *
     * @param majorAxis the new major axis of the oval
     * @param minorAxis the new minor axis of the oval
     */
    myOval(double majorAxis, double minorAxis){
        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    /**
     * @return returns the major axis of the oval
     */
    public double getMajorAxis() {
        return majorAxis;
    }

    /**
     * @return returns the minor axis of the oval
     */
    public double getMinorAxis() {
        return minorAxis;
    }

    /**
     * Inherited from myShape. The area method computes the area of an oval, returning the result as a double.
     * @return returns the computed area of the oval
     */
    @Override
    public double area() {
        return (this.minorAxis * this.majorAxis * Math.PI);
    }

    /**
     * @return returns the calculated perimeter of the oval.
     */
    @Override
    public double perimeter() {

        return (( 2 * Math.PI  * Math.sqrt((Math.pow((this.majorAxis), 2) + Math.pow((this.minorAxis), 2))/2)));
    }

    /**
     *
     * The circumference method is a wrapper method for the perimeter method.
     *
     * @return returns the circumference of the oval.
     */
    public double circumference(){
        return this.perimeter();
    }

}
