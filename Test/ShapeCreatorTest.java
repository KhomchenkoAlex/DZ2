import edu.alex.Shape.Circle;
import edu.alex.Shape.Rectangle;
import edu.alex.Shape.Square;
import edu.alex.Shape.Triangle;
import edu.alex.ShapeCreator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by alex on 14.02.17.
 */
public class ShapeCreatorTest {
    Circle circle;
    Square square;
    Triangle triangle;
    Rectangle rectangle;

    @Before
    public void init() {
        circle = new Circle(1);
        square = new Square(1);
        triangle = new Triangle(1, 1, 1);
        rectangle = new Rectangle(1, 1);
    }

    @After
    public void destroy() {
        circle = null;
        square = null;
        triangle = null;
        rectangle = null;
    }

    @Test
    public void shapeCreatorTest() {
        ShapeCreator mockedsc = Mockito.mock(ShapeCreator.class);
        ShapeCreator sc = new ShapeCreator();
        when(mockedsc.createCircle()).thenReturn(circle);
        when(mockedsc.createSquare()).thenReturn(square);
        when(mockedsc.createTriangle()).thenReturn(triangle);
        when(mockedsc.createRectangle()).thenReturn(rectangle);
        assertTrue(mockedsc.createCircle().toString().equals(sc.createCircle(1).toString()));
        assertTrue(mockedsc.createSquare().toString().equals(sc.createSquare(1).toString()));
        assertTrue(mockedsc.createTriangle().toString().equals(sc.createTriangle(1, 1, 1).toString()));
        assertTrue(mockedsc.createRectangle().toString().equals(sc.createRectangle(1, 1).toString()));
    }

}