package shapetests;

import edu.alex.Shape.Triangle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TriangleTest {
    @Test
    public void testCalculateArea() {
        assertNotEquals(5, (int) new Triangle(2, 2, 2).calculateArea());
        assertEquals("!!!", 1, (int) new Triangle(1.52f, 1.52f, 1.52f).calculateArea());
    }

    @Test
    public void testCalculatePerimeter() {
        assertNotEquals(7, (int) new Triangle(2, 2, 2).calculatePerimeter());
        assertEquals("!!!", 6, (int) new Triangle(2, 2, 2).calculatePerimeter());
    }
}
