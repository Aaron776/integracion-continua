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
    @Test
    public void subtractNumbers(){
        this.number=new Number(5,3);
        assertEquals(2,this.number.substractNumbers());
    }
}