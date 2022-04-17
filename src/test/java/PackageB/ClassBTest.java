package PackageB;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassBTest {
	
	@Test
	@Tag("Sanity")
	public void Test2() {
		System.out.println("Inside Test2");
	}

}
