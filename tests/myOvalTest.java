import org.junit.Test;

import static org.junit.Assert.*;
/**
 * The myOvalTest class is used to test the functionality of the myOval class.
 *
 * @author  Levi Schanding
 * @version 1.2
 */
public class myOvalTest {
    /**
     * Used to set the acceptable variation between the expected and actual outcomes for the myOval unit tests.
     */
    private final double ACCEPTABLE_VARIATION = 0.00000001;
    /**
     * The area() test driver tests the area() method contained in myOval by creating a myOval object
     * with a major axis of two and a minor axis of four. It then asserts whether or not the area() method
     * is performing correctly by comparing the outcome of the area() method with the expected outcome of 2 * 4 * PI.
     * Given the infinite nature of PI, and the finite nature of computer calculations, an allowance has been made for
     * a slight variation between the actual outcome and the expected outcome.
     */

    @Test (expected = IllegalArgumentException.class)
    public void constructor_zero_majorRadius(){
        myOval oval = new myOval(0, 1);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_negative_majorRadius(){
        myOval oval = new myOval(-1, 1);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_zero_minorRadius(){
        myOval oval = new myOval(1, 0);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_negative_minorRadius(){
        myOval oval = new myOval(1, -1);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_zero_params(){
        myOval oval = new myOval(0, 0);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_negative_params(){
        myOval oval = new myOval(-1, -1);
    }


    @Test
    public void area() {
        myOval oval = new myOval(2.0, 4.0);
        assertEquals((8.0 * Math.PI), oval.area(), ACCEPTABLE_VARIATION);
    }

    @Test
    public void getMajorAxis() {
        myOval oval = new myOval(2.0, 4.0);
        assertEquals(2.0, oval.getMajorAxis(), 0);
    }

    @Test
    public void getMinorAxis() {
        myOval oval = new myOval(2.0, 4.0);
        assertEquals(4.0, oval.getMinorAxis(), 0);
    }

    @Test
    public void perimeter() {
        myOval oval = new myOval(2.0, 4.0);
        assertEquals(( 2 * Math.PI  * Math.sqrt((Math.pow(2, 2) + Math.pow(4, 2))/2)), oval.circumference(), ACCEPTABLE_VARIATION);
    }

    @Test
    public void circumference() {
        myOval oval = new myOval(2.0, 4.0);
        assertEquals(( 2 * Math.PI  * Math.sqrt((Math.pow(2, 2) + Math.pow(4, 2))/2)), oval.circumference(), ACCEPTABLE_VARIATION);
    }
}