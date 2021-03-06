/*Problem

After years of study, scientists at Google Labs have discovered an alien language transmitted from a faraway planet. The alien language is very unique in that every word consists of exactly L lowercase letters. Also, there are exactly D words in this language.

Once the dictionary of all the words in the alien language was built, the next breakthrough was to discover that the aliens have been transmitting messages to Earth for the past decade. Unfortunately, these signals are weakened due to the distance between our two planets and some of the words may be misinterpreted. In order to help them decipher these messages, the scientists have asked you to devise an algorithm that will determine the number of possible interpretations for a given pattern.

A pattern consists of exactly L tokens. Each token is either a single lowercase letter (the scientists are very sure that this is the letter) or a group of unique lowercase letters surrounded by parenthesis ( and ). For example: (ab)d(dc) means the first letter is either a or b, the second letter is definitely d and the last letter is either d or c. Therefore, the pattern (ab)d(dc) can stand for either one of these 4 possibilities: add, adc, bdd, bdc.

Input

The first line of input contains 3 integers, L, D and N separated by a space. D lines follow, each containing one word of length L. These are the words that are known to exist in the alien language. N test cases then follow, each on its own line and each consisting of a pattern as described above. You may assume that all known words provided are unique.

Output

For each test case, output

Case #X: K

where X is the test case number, starting from 1, and K indicates how many words in the alien language match the pattern.

Limits

Small dataset

1 ≤ L ≤ 10
1 ≤ D ≤ 25
1 ≤ N ≤ 10

Large dataset

1 ≤ L ≤ 15
1 ≤ D ≤ 5000
1 ≤ N ≤ 500

Sample

Input
  	
Output
 
3 5 4
abc
bca
dac
dbc
cba
(ab)(bc)(ca)
abc
(abc)(abc)(abc)
(zyx)bc

Case #1: 2
Case #2: 1
Case #3: 3
Case #4: 0

*/

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

using namespace std;

void find(char , int);
void clear();
void scan();
vector<vector<char>> a;	
vector<vector<int>> pass;

int x,y,z;
int no;

void main()
{

	vector<string> l,n;

	vector<char> t;

	string s;
	string::iterator it,it2;
	char c;
	fscanf(stdin,"%d %d %d",&x,&y,&z);

	for(int i=0;i<y;i++)
	{
		cin>>s;
		l.push_back(s.c_str());
		
	}

	for(int i=0;i<z;i++)
	{
		cin>>s;
		n.push_back(s.c_str());
	}

	for(int i=0;i<y;i++)
	{
		vector<int> vi;
		for(it = l[i].begin();it!=l[i].end();it++)
		{
			t.push_back((*it));
			vi.push_back(0);
		}
		pass.push_back(vi);
		a.push_back(t);
		t.clear();
	}


	for(int i=0;i<z;i++)
	{
		int size = 0;
		for(it=n[i].begin(); it!=n[i].end() ;it++)
		{
			char t;

			t=(*it);
			if(t=='(')
			{
				
				it++;
				do
				{
					t=(*it);
					if(t==')')
						break;
					find(t,size);
					it++;
				}while(t!=')');
				size++;
			}
			else
			{
					t=(*it);
					find(t,size);
					size++;
			}
			
		
		}
		scan();
		clear();

		cout<<"Case #"<<i+1<<": "<<no<<"\n";



	}



}


void find(char c, int n)
{

	for(int i=0;i<y;i++)
	{
		if(a[i][n] == c)
			pass[i][n]=1;
		

	}
}
			
void clear()
{
	for(int i=0;i<y;i++)
	{
		for(int j=0;j<x;j++)
		{
			pass[i][j]=0;
		}
	}
}

void scan()
{
	no=0;
	int flag;

	for(int i=0;i<y;i++)
	{
		flag=1;
		for(int j=0;j<x;j++)
		{
			if(pass[i][j] != 1)
			{
				flag=0;
			}
		}
		if(flag)
		{
			no++;
		}

	}
}
