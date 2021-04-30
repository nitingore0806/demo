import org.testng.annotations.Test;

public class MavenTest {

//Nitin Gore

	@Test(groups="bbb")
	public void m1() {
		int i = 12;
		System.out.println("inside m1");
	}
	@Test
	public void m2() {
		System.out.println("inside m2");
		int i=10/0;
	}@Test
	public void m3() {
		System.out.println("inside m3");
	}
	@Test(groups="bbb")
	public void m4() {
		System.out.println("inside m4");
	}

}
@Test
class B{
	@Test
	public void m5() {
		System.out.println("inside m5");
	}
	@Test
	public void m6() {
		System.out.println("inside m6");
	}
	@Test(groups="bbb")
	public void m7() {
		System.out.println("inside m7");
	}
	@Test(groups="bbb")
	public void m8() {
		System.out.println("inside m8");
	}
	@Test(groups="bbb")
	public void m9() {
		System.out.println("inside m9");
	}
	@Test
	public void m10() {
		System.out.println("inside m10");
	}
}
