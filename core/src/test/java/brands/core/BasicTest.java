package brands.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.brands.core.models.Basic;

public class BasicTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetTitle() {
		Basic basic = new Basic();
		basic.getTitle();
	}

	@Test
	public void testSetTitle() {
		Basic basic = new Basic();
		basic.setTitle("Hello");
	}

}
