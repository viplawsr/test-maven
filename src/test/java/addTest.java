
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class addTest {

    add sub = new add();

    @Test

    public void check()
    {
        assertEquals(7, sub.add(5, 2));
        assertEquals(9, sub.add(4, 5));
    }

}
