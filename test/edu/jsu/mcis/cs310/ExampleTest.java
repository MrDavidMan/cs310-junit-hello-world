package edu.jsu.mcis.cs310;
import org.junit.*;

import static org.junit.Assert.*;

public class ExampleTest {

    private Main main;
    private String expectedGreeting, expectedReverseGreeting;
    private String expectedReverse1, expectedReverse2, expectedReverse3;
    private String testReverse;
    
    @Before
    public void setUp() {
        main = new Main();
        expectedGreeting = "Hello, World!";
        expectedReverseGreeting = "!dlroW ,olleH";
        expectedReverse1 = "topaeT elttiL a m'I";
        expectedReverse2 = "elddiD elddiD yeH";
        expectedReverse3 = "kcoD yrokciD yrokciH";
        testReverse = "esaelp A na em evig III ,nellenS yaJ .rM";
    }
        
    @Test
    public void testGreeting() {
        String actual = main.getGreeting();
        assertEquals(expectedGreeting, actual);
    }
    
    @Test
    public void testReverseGreeting() {
        String actual = main.reverse(expectedGreeting);
        assertEquals(expectedReverseGreeting, actual);
    }
    
    @Test
    public void testReverseMessage1() {
        String actual = main.reverse("I'm a Little Teapot");
        assertEquals(expectedReverse1, actual);
    }
    
    @Test
    public void testReverseMessage2() {
        String actual = main.reverse("Hey Diddle Diddle");
        assertEquals(expectedReverse2, actual);
    }
    
    @Test
    public void testReverseMessage3() {
        String actual = main.reverse("Hickory Dickory Dock");
        assertEquals(expectedReverse3, actual);
    }
    
    @Test
    public void testString() {
        String actual = main.reverse("Mr. Jay Snellen, III give me an A please");
        assertEquals(testReverse, actual);
    }   
}