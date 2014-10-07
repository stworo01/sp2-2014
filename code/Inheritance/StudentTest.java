import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    Student s1, s2;
    /**
     * Default constructor for test class StudentTest
     */
    public StudentTest(){}

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp(){
        s1 = new Student("abc123","fred",32);
        s2 = new Student("abc123","fred",32);
    }

    @Test
    public void studentEquals(){
        assertEquals(s1,s2);
    }
    
    @Test
    public void studentNotEquals(){
        s2.setName("dodgy");
        assertFalse(s1.equals(s2));
    }
    
    
    @Test
    public void testSetName(){
        String name1 = s1.getName();
        s1.setName("Dodgy");
        String name2 = s1.getName();
        assertFalse(name1.equals(name2));
    }
    
    @After
    public void tearDown(){
        s1 = null;
        s2 = null;
    }
}
