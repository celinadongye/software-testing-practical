package st1920.automaton;

import st1920.automaton.RegExpMatcher.MatchString;
import st1920.automaton.RegExpMatcher.REString;
import static org.junit.Assert.*;

import org.junit.Test;


public class Task3_2 {
	
	@Test
	public void testA() {
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("55");
		REString re = new REString("<45-56");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}	
	}
	
	@Test
	public void testB() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("nefjnfr");
		REString re = new REString("(nefjn");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}	
	}
	
	@Test
	public void testC() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("j");
		REString re = new REString("[nefjn");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testD() {	 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("aaaaaa");
		REString re = new REString("a{6,");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testE() {	 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("str");
		REString re = new REString("\"str ");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testF() {	 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("56");
		REString re = new REString("<45>");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}	
	}
	
	@Test
	public void testG() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("fr");
		REString re = new REString("~(ab)");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testH() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("33");
		REString re = new REString("<32--34>");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}		
	}
	
	@Test
	public void testK() {
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("nnl");
		REString re = new REString("\"nn\"l?");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testL() {
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("55");
		REString re = new REString("<ad-66>");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}	
	}
	
	@Test
	public void testM() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("");
		REString re = new REString("");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}	
	}
	
	@Test
	public void testN() {
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("avavFF");
		REString re = new REString("(av)*&(FF)?");
		try {
		assertFalse(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testO() {
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("a");
		REString re = new REString("[a-]");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}		
	}
	
	@Test
	public void testP() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("45");
		REString re = new REString("<=->");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testQ() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("has");
		REString re = new REString("has{4,2}");
		try {
		assertFalse(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testR() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("has");
		REString re = new REString("has{0,2}");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}	
	}
	
	@Test
	public void testS() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("40");
		REString re = new REString("<3-5>");
		try {
		assertFalse(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
		
	}
	
	@Test
	public void testT() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("a");
		REString re = new REString("[a-z]&");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testU() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("b");
		REString re = new REString("a&[a-z]");
		try {
		assertFalse(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testV() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("b");
		REString re = new REString("[a-z]&a");
		try {
		assertFalse(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testW() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("b");
		REString re = new REString("a&c");
		try {
		assertFalse(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	@Test
	public void testX() { 
		RegExpMatcher reg = new RegExpMatcher();
		MatchString s = new MatchString("aa");
		REString re = new REString("(aa)&(.+&[a-z]{2})");
		try {
		assertTrue(reg.matches(s, re));
		}catch(Exception e) {
			Exception str = e;
		}
	}
	
	
}
