package main;

import static org.junit.Assert.*;
import org.junit.*;

public class RomanTest {
	private Roman roman1;

	// TODO add test cases here!
	@Before
	public void setup() {
		roman1 = new Roman();
	}
	@Test
	public void testI() {
		assertEquals(roman1.toRoman(1),"I");
	}
	@Ignore
	public void testII() {
		assertEquals(roman1.toRoman(2),"II");
	}
	@Ignore
	public void testIII() {
		assertEquals(roman1.toRoman(3),"III");
	}
	@Ignore
	public void testIV() {
		assertEquals(roman1.toRoman(4),"IV");
	}
	@Ignore
	public void testV() {
		assertEquals(roman1.toRoman(5),"V");
	}
	@Ignore
	public void testVI() {
		assertEquals(roman1.toRoman(6),"VI");
	}
	@Ignore
	public void testVII() {
		assertEquals(roman1.toRoman(7),"VII");
	}
	@Ignore
	public void testVIII() {
		assertEquals(roman1.toRoman(8),"VIII");
	}
	@Ignore
	public void testIX() {
		assertEquals(roman1.toRoman(9),"IX");
	}

}
 