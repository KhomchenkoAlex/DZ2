package shapetests;

import edu.alex.Shape.Circle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CircleTest {
    @Test
    public void testCalculateArea(){
        assertNotEquals(214, (int) new Circle(10).calculateArea());
        assertEquals("!!!",314, (int) new Circle(10).calculateArea());
    }

    @Test
    public void testCalculatePerimeter(){
        assertNotEquals(700, (int) new Circle(100).calculatePerimeter());
        assertEquals("!!!",628, (int) new Circle(100).calculatePerimeter());
    }
}
