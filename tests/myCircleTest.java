import org.junit.Test;

import static org.junit.Assert.*;
/**
 * The myCircleTest class is used to test the functionality of the myCircle class.
 *
 * @author Levi Schanding
 * @version 1.2
 */
public class myCircleTest {
    /**
     * Used to set the acceptable variation between the expected and actual outcomes for the myCircle unit tests.
     */
    private final double ACCEPTABLE_VARIATION = 0.00000001;
    /**
     * This test driver tests the area() method implemented by the parent class of myCircle, myOval, by creating a
     * myCircle object with a diameter of six. It then asserts whether or not the area() method is performing correctly
     * by comparing the outcome of the area() method with the expected outcome of 3^2 * PI. Given the infinite nature of
     * PI, and the finite nature of computer calculations, an allowance has been made for a slight variation between the
     * actual outcome and the expected outcome.
     */
    @Test (expected = IllegalArgumentException.class)
    public void constructor_zero_params(){
        myCircle circle = new myCircle(0);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_negative_params(){
        myCircle circle = new myCircle(-1);
    }

    @Test
    public void area() {
        myCircle circle = new myCircle(6.0);
        assertEquals((9.0 * Math.PI), circle.area(), ACCEPTABLE_VARIATION);
    }
    @Test
    public void perimeter(){
        myCircle circle = new myCircle(3.0);
        assertEquals((2 * Math.PI * 1.5), circle.perimeter(), ACCEPTABLE_VARIATION);
    }
    @Test
    public void circumference(){
        myCircle circle = new myCircle(3.0);
        assertEquals((2 * Math.PI * 1.5), circle.circumference(), ACCEPTABLE_VARIATION);
    }
    @Test
    public void getDiameter() {
        myCircle circle = new myCircle(12.0);
        assertEquals(12.0, circle.getDiameter(), 0);
    }
    @Test
    public void getRadius() {
        myCircle circle = new myCircle(12.0);
        assertEquals(6.0, circle.getRadius(), 0);
    }
}