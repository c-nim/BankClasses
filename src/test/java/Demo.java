import junit.framework.*;
import org.junit.Assert;
import org.junit.Test;

public class Demo{
    @Test
    public void Addition() {
        int a = 4;
        int b = 5;

        Assert.assertEquals(9, a+b);
    }

    @Test
    public void SayHello() {
        String greeting = "he" + "llo";

        Assert.assertEquals("hello", greeting);
    }
}
