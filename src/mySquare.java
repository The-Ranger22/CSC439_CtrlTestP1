/**
 *
 * The mySquare class is designed to represent a square. The mySquare class extends the myRectangle class.
 *
 * @author  Levi Schanding
 * @version 1.1
 */
public class mySquare extends myRectangle {
    /**
     *
     * The mySquare constructor takes the length of a side as a parameter before passing the length to the
     * constructor of its parent class, myRectangle.
     *
     * @param length the length of a single side of the square
     */
    mySquare(double length){
        super(length, length);
    }


}
