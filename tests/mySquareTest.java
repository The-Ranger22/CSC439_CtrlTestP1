import org.junit.Test;

import static org.junit.Assert.*;
/**
 * The mySquareTest class is designed to test the functionality of the mySquare class.
 *
 * @author  Levi Schanding
 * @version 1.2
 */
public class mySquareTest {

    /**
     * This test driver tests the area() method implemented by the parent class of mySquare, myRectangle, by creating a
     * mySquare object with a length of two. It then asserts whether or not the area() method is performing correctly
     * by comparing the outcome of the area() method with the expected outcome of four. No variance between the expected
     * outcome and the actual outcome is tolerated.
     */


    @Test (expected = IllegalArgumentException.class)
    public void constructor_zero_length(){
        mySquare square = new mySquare(0);
    }
    @Test (expected = IllegalArgumentException.class)
    public void constructor_negative_length(){
        mySquare square = new mySquare(-1);
    }

    @Test
    public void area() {
        mySquare square = new mySquare(2.0);
        assertEquals(4, square.area(), 0);
    }
    @Test
    public void perimeter(){
        mySquare square = new mySquare(6);
        assertEquals(24, square.perimeter(), 0);
    }
    @Test
    public void getLength(){
        mySquare square = new mySquare(4.0);
        assertEquals(4.0, square.getLength(), 0);
    }
}