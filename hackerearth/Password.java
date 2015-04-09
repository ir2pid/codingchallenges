import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;



public class Password {
	/**
	 * @author sudipta.a.dutta
	 *
	 * @project Challenges
	 * @file Password.java
	 * @package 
	 * @date Mar 17, 2015
	 * @todo TODO
	 */
	

	static HashSet<String> pass = new HashSet<String>();
	
    public static void main(String args[] ) throws Exception {
    	String filename = "in.txt";		 
		System.setIn(new FileInputStream(filename));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            String rev = reverse(input);
            if(pass.contains(input)){
            	int len = rev.length();
            	
            	System.out.println(len+" "+rev.charAt(len/2));
            	
            }
            else{
            	pass.add(rev);
            }
        }                      
    }
    
    public static String reverse(String s)
    {
    	String sb = "";
    	
    	for(int i=s.length()-1;i>=0;i--){
    		sb = sb+(s.charAt(i));
    	}
    	
    	return sb.toString();
    }
}
