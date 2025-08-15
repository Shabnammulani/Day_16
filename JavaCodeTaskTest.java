package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import main.java.JavaCodeTask;
import main.java.JavaCodeTask.OnesComplement;

public class JavaCodeTaskTest {

	JavaCodeTask code=new JavaCodeTask();
	
	@Test
	public void reverseTable() {
	String expected ="50 45 40 35 30 25 20 15 10 5";
	String actual = code.reverseTable(5);
	assertEquals(expected,actual);
	}
	
	@Test
	public void alphabetstest() {
		String expected="a b c d e f g h i j k l m n o p q r s t u v w x y z";
		String actual=code.alphabets();
		assertEquals(expected, actual);
	}
	/*@Test
	public void testAsciiValues() {
		String expected="97 98 99 100 101 102 103 104 105 106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 121 122";
		String actual = code.asciiValues();
		assertEquals(expected, actual);
	}*/
	@Test
	public void testFactorial() {
		int expected =24;
		int actual=code.factorial(4);
		assertEquals(expected, actual);
	}
	@Test
	public void testCountNumbers() {
		int[]input= {5,-3,0,7,-1,0,2};
		String expected="3 2 2";
		String actual=code.countNumbers(input);
		assertEquals(expected, actual);
	}
	@Test
    public void testOnesComplement() {
        assertEquals("0101", OnesComplement.onesComplement("1010"));
    }
	
	
	
	
}
