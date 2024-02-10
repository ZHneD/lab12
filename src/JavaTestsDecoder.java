import org.junit.Test;
import java.lang.Integer;
import static org.junit.Assert.*;

public class JavaTestsDecoder
{
    @Test(expected = NumberFormatException.class)
    public void checkZeroLenght()
    {
        Integer.decode("");
    }

    @Test
    public void testPositiveNumber()
    {
        assertEquals(Integer.decode("54"),
                new Integer(54));
    }

    @Test
    public void checkNegative()
    {
        assertEquals(Integer.decode("-2"),
                new Integer(-2));
    }

    @Test(expected = NumberFormatException.class)
    public void checkUnCorrectEightBase(){
        Integer.decode("008");
    }

    @Test
    public void checkEightBase(){
        assertEquals(Integer.decode("0171"), (Integer) 121);
    }

    @Test
    public void checkNegativeEightBase(){
        assertEquals(Integer.decode("-0354"),
                new Integer(-236));
    }

    @Test(expected = NullPointerException.class)
    public void testNull()
    {
        Integer.decode(null);
    }

    @Test(expected = NumberFormatException.class)
    public void testNotANumber()
    {
        Integer.decode("lsd");
    }
}