package PackageA;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassATest {
	
	@Test
	@Tag("Sanity")
	public void Test1() {
		System.out.println("Inside Test1");
	}

}
