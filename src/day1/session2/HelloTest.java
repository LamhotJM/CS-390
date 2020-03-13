package day1.session2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HelloTest {

	@Test
	public void testHello() {
		Hello x = new Hello();
		assertEquals("hello", x.hello());

	}

}
