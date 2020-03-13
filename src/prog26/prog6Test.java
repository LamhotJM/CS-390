package prog26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class prog6Test {

	@Test
	void test() {
		prog6 obj = new prog6();
		String[] x = {"horse", "dog", "dog", "horse", "dog","horse","dog","cat","dog","horse"};
		String[] res = obj.removeAllDuplicates(x); 
		String[] exp = {"cat", "dog", "horse"};
		assertEquals(exp.toString(),res.toString());
	}

}
