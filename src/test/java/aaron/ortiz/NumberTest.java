package aaron.ortiz;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberTest {
    private Number number;

    @Test
    public void addNumbers() {
        this.number=new Number(2,3);
        assertEquals(5,this.number.addNumbers());


    }
}