package st1920.automaton;

import static org.junit.Assert.*;

import org.junit.Test;

public class Task4 {

	@Test
	public void test1() {
		assertTrue(
				RegExpMatcher.matches(
				"\n",
				"$"
				));
	}
	@Test
	public void test2() {
		assertTrue(
				RegExpMatcher.matches(
				"aaa\n",
				"a+$"
				));
	}
	@Test
	public void test3() {
		assertTrue(
				RegExpMatcher.matches(
				"\r",
				"$"
				));
	}
	@Test
	public void test4() {
		assertTrue(
				RegExpMatcher.matches(
				"\r\n",
				"$$"
				));
	}
	@Test
	public void test5() {
		assertTrue(
				RegExpMatcher.matches(
				"\n\r",
				"$$"
				));
	}
	@Test
	public void test6() {
		assertTrue(
				RegExpMatcher.matches(
				"\r\n",
				"$"
				));
	}
	@Test
	public void test7() {
		assertTrue(
				RegExpMatcher.matches(
				"\r\r\n",
				"$$"
				));
	}
	@Test
	public void test8() {
		assertTrue(
				RegExpMatcher.matches(
				"\r\r\n",
				"$$$"
				));
	}
	@Test
	public void test9() {
		assertTrue(
				RegExpMatcher.matches(
				"\r\r\n",
				"$$$"
				));
	}
	@Test
	public void test10() {
		assertFalse(
				RegExpMatcher.matches(
				"$",
				"$"
				));
	}
	@Test
	public void test11() {
		assertFalse(
				RegExpMatcher.matches(
				"\n",
				"[$]"
				));
	}
	@Test
	public void test12() {
		assertTrue(
				RegExpMatcher.matches(
				"a\naaa\r\n",
				"(a+$)+"
				));
	}
	@Test
	public void test13() {
		assertTrue(
				RegExpMatcher.matches(
				"\n",
				"."
				));
	}
	@Test
	public void test14() {
		assertTrue(
				RegExpMatcher.matches(
				"\r",
				"."
				));
	}
	@Test
	public void test15() {
		assertTrue(
				RegExpMatcher.matches(
				"\r\n",
				".."
				));
	}
	@Test
	public void test16() {
		assertFalse(
				RegExpMatcher.matches(
				"\r\n",
				"."
				));
	}
	@Test
	public void test17() {
		assertTrue(
				RegExpMatcher.matches(
				"abab\n\r\n",
				"((ab)*$*)&((ab)+$+)"
				));
	}

	@Test
	public void test18() {
		assertTrue(
				RegExpMatcher.matches(
				"abab\n\r\n",
				"((ab)*$*)|((bb)+.+)"
				));
	}
	
	@Test
	public void test19() {
		assertTrue(
				RegExpMatcher.matches(
				"\n\n\r\r\n",
				"$*"
				));
	}
	@Test
	public void test20() {
		assertTrue(
				RegExpMatcher.matches(
				"\r\n",
				"$?"
				));
	}
	@Test
	public void test21() {
		assertTrue(
				RegExpMatcher.matches(
				"\r\n\n\n\r\n\n",
				"${3,5}"
				));
	}
	@Test
	public void test22() {
		assertTrue(
				RegExpMatcher.matches(
				"\r\n\n\n\r\n\n\r\n",
				"${6}"
				));
	}
	@Test
	public void test23() {
		assertTrue(
				RegExpMatcher.matches(
				"dbrf5",
				".*<3-10>~$"
				));
	}
	@Test
	public void test24() {
		assertTrue(
				RegExpMatcher.matches(
				"4523\n223\r\n\n",
				"(<1-5>*$){2,10}"
				));
	}
	
	@Test
	public void test25() {
		assertFalse(
				RegExpMatcher.matches(
				"aa\r\nrr\n",
				"#"
				));
	}
	
	@Test
	public void test26() {
		assertTrue(
				RegExpMatcher.matches(
				"a\r\n\n",
				"[^0-9]${3,}"
				));
	}
	
	@Test
	public void test27() {
		assertTrue(
				RegExpMatcher.matches(
				".@\r\n-=\n\n\r\r\n",
				"([^a-z0-9]*$){3,}"
				));
	}
	@Test
	public void test28() {
		assertTrue(
				RegExpMatcher.matches(
				".@\r\n-=\n\n\r\r\n",
				"@"
				));
	}

	
	

}