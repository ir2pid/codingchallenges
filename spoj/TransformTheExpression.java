package spoj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class TransformTheExpression {

	static Stack<Character> varStack = new Stack();
	static Stack<Character> opStack = new Stack();
	static StringBuilder builder;
	
	public static void main(String args[]) throws Exception {

		//String filename = "cd";

		//System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);

		for (int i = 0; i < N; i++) {
			builder = new StringBuilder();
			String vals = br.readLine();
			getRPN(vals);
			System.out.println(builder.toString());
		}
	}
	
	public static void getRPN(String regular)
	{
		for(int i=0;i<regular.length();i++){
			char c = regular.charAt(i);
			if(c == '('){
				continue;
			}
			else if(c == ')'){
				build((char) opStack.pop());
			}
			else if(isAlpha(c)){
				build(c);
			}
			else{
				opStack.add(c);
			}
		}					
	}

	public static boolean isAlpha(char c){
		
		if(Character.isLetter(c))
			return true;
		
		return false;		
	}
	
	public static void build(char c){
		builder.append(c);
	}

}
