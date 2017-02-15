package shapetests;

import edu.alex.Shape.Square;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class SquareTest {
    @Test
    public void testCalculateArea(){
        assertNotEquals(5, (int) new Square(2).calculateArea());
        assertEquals("!!!",4, (int) new Square(2).calculateArea());
    }

    @Test
    public void testCalculatePerimeter(){
        assertNotEquals(7, (int) new Square(2).calculatePerimeter());
        assertEquals("!!!",8, (int) new Square(2).calculatePerimeter());
    }
}
