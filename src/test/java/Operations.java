
import com.mycompany.pruebasunitarias.MetodosPrueba;
import org.junit.Test;
import static org.junit.Assert.*;


public class Operations {

    MetodosPrueba m = new MetodosPrueba();

    @Test
    public void lessThanOrEqualToZeroAssertTrue() {
        assertFalse(m.lessThanOrEqualToZero(5));
    }

    @Test
    public void lessThanOrEqualToZeroAssertFalse() {
        assertTrue(m.lessThanOrEqualToZero(0));
    }

    @Test
    public void lessThanOrEqualToZeroAssertTrue2() {
        assertTrue(m.lessThanOrEqualToZero(-2));
    }
    

    @Test
    public void stutter1() {
        assertEquals("in.. in.. increible?", m.stutter("increible"));
    }

    @Test
    public void stutter2() {
        assertEquals("en.. en.. entusiasmado?", m.stutter("entusiasmado"));
    }

    @Test
    public void stutter3() {
        assertEquals("ac.. ac.. actividades?", m.stutter("actividades"));
    }
    

    @Test
    public void totalCups1() {
        assertEquals(7, m.totalCups(6));
    }

    @Test
    public void totalCups2() {
        assertEquals(14, m.totalCups(12));
    }

    @Test
    public void totalCups3() {
        assertEquals(248, m.totalCups(213));
    }
    
    @Test
    public void countWords1(){
         assertEquals(6, m.countWords("El ejemplo hace movernos hacia adelante"));
    }
    
    @Test
    public void countWords2(){
         assertEquals(4, m.countWords("Esto es un test"));
    }
    
    @Test
    public void countWords3(){
         assertEquals(5, m.countWords("Ersto es facil de aprender"));
    }

}
