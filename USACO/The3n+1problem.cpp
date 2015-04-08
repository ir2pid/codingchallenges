/* @JUDGE_ID: 110101 Cpp "The 3n + 1 Problem" */
#include <iostream>
#include <fstream>
#include <stdlib.h>
#include <sstream>
#include <algorithm>
#include <vector>
#include <list>
#include <string>
#include <map>
#include <set>
#include <queue>
#include <stack>
#include <complex>
#include <cstdio>
#include <cassert>
#include <cmath>
#include <cctype>
#include <map>

using namespace std;

int main()
{
    long a,b;
	map<long, long> cycleLengthResult;
	bool first = false;
	while(cin>>a>>b){
		
		long c,d;
		c = a; 
		d = b;
		long max=0;
		if ( a > b ) //swap to ensure i <= j
        {
            int s = a;
            a = b;
            b = a;
        }
    	for(long i=a;i<=b;i++)
    	{
	    	long j=i,count=0;
			if(cycleLengthResult.find(j) == cycleLengthResult.end())
			{
	    		while(j!=1)
	    		{
	    			if(j%2==0)
	    				j/=2;
	    			else
	    				j=(j*3)+1;
	    			count++;
	    		//cout<<j;
	    		}
				cycleLengthResult[i] = count;
			}
			else
			{
				count = cycleLengthResult[i];
			}
	    	if(count>max)
		    	max=count;
    	}
		if(!first)
		{	first = true;
			cout<<c<<" "<<d<<" "<<max+1;
		}
		else
		{			
			cout<<endl<<c<<" "<<d<<" "<<max+1;
		}
    }
	return 1;
}