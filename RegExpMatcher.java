package st1920.automaton;

/**
 * Utility class to provide a simple interface to the package.
 */
public class RegExpMatcher {
	
	 public static class MatchString {
		
		private String matchstr;
		
		public MatchString(String str) {
			matchstr = str;
		}
		public  String getString() {
			return matchstr;
		}

	}
	public static class REString {

		private  String restring;
		
		public REString(String str) {
			restring = str;
		}
		
		public  String getString() {
			return restring;
		}		
	}
	
	//MatchString METHODS 
	public  MatchString makeAlpha() {
		return new MatchString("a");
	}
	public  MatchString makeNum() {
		return new MatchString("1");
	}
	public  MatchString makeConcatenation(String l, String r) {
		return new MatchString(l+r);
	}
	
	
	public  REString makeAlphareg() {
		return new REString("a");
	}
	public  REString makeNumreg() {
		return new REString("1");
	}
	
	//REString METHODS
	public  REString repeatZeroOrOne(REString p) {
		return new REString(p + "?");
	}
	
	public  REString repeatOneOrMore(REString p) {
		return new REString(p + "+");
	}
	public  REString repeatZeroOrMore(REString p) {
		return new REString(p + "*");
	}
	public  REString excludePattern(REString p) {
		return new REString("~" + p );
	}
	public  REString eitherPattern(REString p,REString q) {
		return new REString( p + "|" + q );
	}
	public  REString bothPatterns(REString p,REString q) {
		return new REString( p + "&" + q );
	}
	public  REString followPattern(REString p,REString q) {
		return new REString( p + "" + q );
	}
	public  REString matchesNOccurences(REString p,int n) {
		return new REString( p + "{" + n + "}" );
	}
	public  REString matchesNOrMoreOccurences(REString p,int n) {
		return new REString( p + "{" + n + ",}" );
	}
	public  REString matchesNToMOccurences(REString p,int n,int m) {
		return new REString( p + "{" + n + "," + m + "}" );
	}
	public  REString matchesBracketChars(String p) {
		return new REString(  "[" + p + "]" );
	}
	public  REString matchesNoBracketChars(String p) {
		return new REString(  "[^" + p + "]" );
	}
	public  REString matchesAnyChar(REString p) {
		return new REString( p + "." ); 
	}
	// NOT SURE IF THIS IS HOW TO USE
	public  REString matchesNoChar() {
		return new REString( "#" );
	}
	public  REString matchesAnyString() {
		return new REString(  "@" );
	}
	public  REString matchesString(String p) {
		return new REString( "\"" + p + "\"" );
	}
	public  REString matchesNumBetweenNandM(int n,int m) {
		return new REString( "<" + n + "-" + m + ">" );
	}
	public  REString makeParenthesis(REString p ) {
		return new REString( "(" + p + ")");
	}
	
	
	//NEW matches METHOD
	public static boolean matches(MatchString m, REString re) {
		RegExp regExp = new RegExp(re.getString());
		Automaton a = regExp.toAutomaton();
		return a.run(m.getString());
	}
	
	/**
	 * Tells whether the string <code>m</code> matches the regular expression <code>re</code>.
	 * @param m string to be matched
	 * @param re regular expression
	 */
//	public static boolean matches(String m, String re) {
//		RegExp regExp = new RegExp(re);
//		Automaton a = regExp.toAutomaton();
//		return a.run(m);
//	}
	
}
