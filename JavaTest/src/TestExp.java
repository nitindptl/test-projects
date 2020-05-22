
public class TestExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TestExp.isBalanced("{[<>]}"));
	}

	/*
	 * ()(){}{}[{}] {[<>]} {[[]} {[}]
	 */

	static boolean isBalanced(String str) {
		int ln = str.length();
		StringBuilder eval = new StringBuilder();
		for (int i = 0; i < ln; i++) {
			char ch = str.charAt(i);
			char close = TestExp.findClosing(ch);
			if (i != 0) {
				char lastChar = (char)(eval.toString().charAt(eval.length()-1));
				if (lastChar !=close && close == ' ') {
					return false;
				}
			}
			eval.append(str.charAt(i));
		}
		return true;
	}
	
	static char findClosing(char c) 
    { 
        if (c == '(') 
            return ')'; 
        if (c == '{') 
            return '}'; 
        if (c == '[') 
            return ']';
        if (c == '<') 
            return '>';
        return ' '; 
    } 
}
