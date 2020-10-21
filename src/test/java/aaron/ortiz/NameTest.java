package aaron.ortiz;

import org.junit.Test;

import static org.junit.Assert.*;

public class NameTest {
    private Name name;
    @Test
    public void numberOfCharacters(){
        this.name=new Name("Hola",4);
        assertEquals(4,this.name.numberOfCharacters());
    }

    @Test
    public void capitalLetters(){
        this.name=new Name("carro");
        assertEquals("CARRO",this.name.capitalLetters());
    }



}