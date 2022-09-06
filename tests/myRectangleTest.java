import org.junit.Test;

import static org.junit.Assert.*;
/**
 * The myRectangleTest class is used to test the functionality of the myRectangle class.
 *
 * @author  Levi Schanding
 * @version 1.2
 */
public class myRectangleTest {

    /**
     * This test driver tests the area() method contained in myRectangle by creating a myRectangle object
     * with a length of two and a width of four. It then asserts whether or not the area() method is performing
     * correctly by comparing the outcome of the area() method with the expected outcome of eight (2 * 4). No variance
     * between the expected outcome and the actual outcome is tolerated.
     */


    @Test (expected = IllegalArgumentException.class)
    public void constructor_zero_length(){
        myRectangle rect = new myRectangle(0, 1);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_zero_width(){
        myRectangle rect = new myRectangle(1, 0);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_zero_params(){
        myRectangle rect = new myRectangle(0, 0);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_negative_length(){
        myRectangle rect = new myRectangle(-1, 1);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_negative_width(){
        myRectangle rect = new myRectangle(1, -1);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_negative_params(){
        myRectangle rect = new myRectangle(-1, -1);
    }

    @Test
    public void area() {
        myRectangle rect = new myRectangle(2.0, 4.0);
        assertEquals(8, rect.area(), 0);
    }

    @Test
    public void getLength() {
        myRectangle rect = new myRectangle(3.0, 2.0);
        assertEquals(3.0, rect.getLength(), 0);
    }

    @Test
    public void getWidth() {
        myRectangle rect = new myRectangle(3.0, 2.0);
        assertEquals(2.0, rect.getWidth(), 0);
    }

    @Test
    public void perimeter() {
        myRectangle rect = new myRectangle(5.0, 2.5);
        assertEquals(15.0, rect.perimeter(), 0);
    }
}