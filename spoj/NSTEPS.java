package spoj;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NSTEPS {

	//static Map<Integer,Integer>mapX = new HashMap<Integer, Integer>(); 
	//static Map<Integer,Integer>mapY = new HashMap<Integer, Integer>(); 
	static int maxX;
	static int maxY;
	
	public static void main(String args[]) throws Exception {

		String filename = "in.txt";
		System.setIn(new FileInputStream(filename));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		for (int i = 0; i < N; i++) {
			String num = br.readLine();
			String[] arr = num.split(" ");
			Integer x = Integer.valueOf(arr[0]);
			Integer y = Integer.valueOf(arr[1]);

			maxX = 0;
			maxY = 0;			
			
			calculate(x,y);
			
		}
	}
	
	static void calculate(int x, int y){
		
		if(x == y){
			int val = 0;
			for(int i=0;i<x;i++){
				if(i%2 == 0){
					val += 1;
				}else{
					val += 3;
				}
			}
			System.out.println(val);
		}else if(x-y == 2){
			int val = 2;
			for(int i=0;i<y;i++){
				if(i%2 == 0){
					val += 1;
				}else{
					val += 3;
				}
			}
			System.out.println(val);
		}else{
			System.out.println("No Number");
		}
	}
	
}
