import org.junit.Assert;
import org.junit.Test;

public class TestReverse {

    /**
     *
     */
    @Test
    public void test1(){
        String string = new ReverseString()
                .reverseOfAString(null);
        Assert.assertEquals(null, string);
    }

    /**
     *
     */
    @Test
    public void test2(){
        String string = new ReverseString()
                .reverseOfAString("");
        Assert.assertEquals("", string);
    }


    /**
     *
     */
    @Test
    public void test3(){
        String string = new ReverseString()
                .reverseOfAString("Hello");
        Assert.assertEquals("olleH", string);
    }
    
        /**
     *
     */
    @Test
    public void test4(){
        String string = new ReverseString()
                .reverseOfAString("WORLD");
        Assert.assertEquals("dlrow", string);
    }

}
