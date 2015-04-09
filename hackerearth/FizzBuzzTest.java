

public class FizzBuzzTest {
	/**
	 * @author sudipta.a.dutta
	 *
	 * @project Challenges
	 * @file FizzBuzzTest.java
	 * @package 
	 * @date Mar 17, 2015
	 * @todo TODO
	 */

	public static void main(String args[]) throws Exception {
		for(int i=1;i<=100;i++){
			if(i%3 == 0)
			{
				if(i%5 == 0)
					System.out.println("FizzBuzz");
				else 
					System.out.println("Fizz");
			}
			else if(i%5 == 0 && i%3 !=0){
				System.out.println("Buzz");
			}
			else 
				System.out.println(i);
		}
	}
}
