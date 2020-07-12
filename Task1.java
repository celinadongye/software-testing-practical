import static org.junit.Assert.*;

import org.junit.Test;

import st1920.automaton.RegExpMatcher;

public class Task1 {
	
	@Test
	public void test3() {
//		FOUND BUG 3 - EASY
		RegExpMatcher reg = new RegExpMatcher();
		String s = "irodotos@gmail.com";
		String re = "([a-zA-Z0-9])+\\@([a-zA-Z0-9])+\\.([a-z]){2,3}";
		assertTrue(reg.matches(s, re));
		
	}
	
	@Test
	public void test1() {
//		FOUND BUG 1 - EASY
		RegExpMatcher reg = new RegExpMatcher();
		String s = "";
		String re = "";
		assertTrue(reg.matches(s, re));
		
	}
	
	@Test
	public void test12() {
//		FOUND BUG  12 - HARD
		RegExpMatcher reg = new RegExpMatcher();
		String s = "23";
		String re = "(([0-9])) | (([a-z]))";
		assertTrue(reg.matches(s, re));
		
	}
	
	@Test
	public void test11() {
//		FOUND BUG  11 - EASY
		RegExpMatcher reg = new RegExpMatcher();
		String s = "23ab";
		String re = "([0-9]?)";
		assertTrue(reg.matches(s, re));
		
	}
	@Test
	public void test15() {
//		FOUND BUG 15 - MEDIUM 
		RegExpMatcher reg = new RegExpMatcher();
		String s = "c";
		String re = "c"; //(~[0-9]{3,8})
		assertTrue(reg.matches(s, re));
		
	}
	@Test
	public void test5() {
//		FOUND BUG 5 - HARD
		RegExpMatcher reg = new RegExpMatcher();
		String s = "**-";
		String re = "[+-*]+";
		assertTrue(reg.matches(s, re));
		
	}
	@Test
	public void test4() {
//		FOUND BUG 4 - EASY
		RegExpMatcher reg = new RegExpMatcher();
		String s = "-1";//ab\45
		String re = "-1";//[a-f]*\\[2-6]*
		assertTrue(reg.matches(s, re));
		
	}
	@Test
	public void test14() {
//		FOUND BUG 14 - MEDIUM
		RegExpMatcher reg = new RegExpMatcher();
		String s = "";
		String re = "[]";
		assertTrue(reg.matches(s, re));
		
	}
	
	@Test
	public void test7() {
//		FOUND BUG 7 - MEDIUM
		RegExpMatcher reg = new RegExpMatcher();
		String s = "hello{}";
		String re = "hello{}";
		assertTrue(reg.matches(s, re));
		
	}
	@Test
	public void test2() {
//		FOUND BUG 2 - EASY
		RegExpMatcher reg = new RegExpMatcher();
		String s = "1";
		String re = "";
		assertTrue(reg.matches(s, re));
		
	}
	
	@Test
	public void test13() {
//		FOUND BUG 13 - HARD
		RegExpMatcher reg = new RegExpMatcher();
		String s = "";
		String re = "()";
		assertTrue(reg.matches(s, re));
		
	}
	
	@Test
	public void test9() {
//		FOUND BUG 9 - MEDIUM
		RegExpMatcher reg = new RegExpMatcher();
		String s = "2";
		String re = "<-2-6>";
		assertTrue(reg.matches(s, re));
		
	}
	
	@Test
	public void test10() {
//		FOUND BUG 10 - HARD
		RegExpMatcher reg = new RegExpMatcher();
		String s = "42";
		String re = "<2-45>";
		assertTrue(reg.matches(s, re));
	}
	
	@Test
	public void test6() {
//		FOUND BUG 6 - HARD
		RegExpMatcher reg = new RegExpMatcher();
		String s = "55555555555555555555555555555555555555555555555555555555"
				+ "55555555555555555555555555555555555555555555555555555555";
		String re = "<2-8>*";
		assertTrue(reg.matches(s, re));
	}
	
	@Test
	public void test8() {
//		FOUND BUG 8 - MEDIUM
		RegExpMatcher reg = new RegExpMatcher();
		String s = "aaa";
		String re = "a**";
		assertTrue(reg.matches(s, re));
	}

}
