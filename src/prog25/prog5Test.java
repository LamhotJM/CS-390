package prog25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class prog5Test {

	@Test
	void testReverse() {
		prog5 obj= new prog5();
		assertEquals("tohmal",obj.reverse("lamhot"));
	}

}
