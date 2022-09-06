/**
 *
 * The myCircle class is designed to represent a circle. The mySquare class extends the myOval class.
 *
 * @author  Levi Schanding
 * @version 1.1
 */
public class myCircle extends myOval {

    /**
     * The myCircle constructor takes the diameter of the circle a parameter. After being passed the diameter
     * of the new circle, the diameter is divided by two to obtain the radius and is then passed to the constructor
     * of its super class, myOval.
     *
     * @param diameter the diameter of the circle
     */
    myCircle(double diameter) {
        super(diameter/2, diameter/2);
    }

    /**
     * The getDiameter method calculates the diameter by multiplying the major axis of the circle by two.
     * @return returns the diameter of the circle.
     */
    public double getDiameter(){
        return this.getMajorAxis() * 2;
    }

    /**
     * The getRadius method is a wrapper class for the getMajorAxis method inherited from the myOval class
     * @return returns the radius of the circle.
     */
    public double getRadius(){
        return this.getMajorAxis();
    }

}
