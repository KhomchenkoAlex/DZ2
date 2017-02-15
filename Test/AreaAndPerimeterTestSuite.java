import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import shapetests.CircleTest;
import shapetests.RectangleTest;
import shapetests.SquareTest;
import shapetests.TriangleTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CircleTest.class,
        RectangleTest.class,
        SquareTest.class,
        TriangleTest.class
})

public class AreaAndPerimeterTestSuite {

}