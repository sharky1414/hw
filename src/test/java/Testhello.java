import org.junit.Test;

/**
 * Created by Ignore on 05.06.2016.
 */
public class Testhello {
    @Test
    public void test1(){
      Hello h = new Hello();
        assert h.st.equals("Hello");
    }
    @Test
    public void test2(){
        Hello h = new Hello();
        assert h.getStr().equals("Helloworld");
    }
}
