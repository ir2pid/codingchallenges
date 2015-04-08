/*
ID: ir2pid1
PROG: crypt1
LANG: C++11
*/
#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <map>
#include <set>
#include <algorithm>    // std::sort
#include <string>

using namespace std;

int eval(vector<int> nos, set<int> snos);
bool isSubset(int prod, set<int> snos);
bool isPrime(int prod);

int main() {
    ofstream fout ("crypt1.out");
    ifstream fin ("crypt1.in");
    int tot,x;
    fin >> tot; //maximum number of inputs
	set<int> snos;
	vector<int> nos;
	map<int,vector<int>> stalls;
	for(int i=0;i<tot;i++)
	{
		fin >> x;
		nos.push_back(x);	
		snos.insert(x);
	}
	
	int val = eval(nos,snos);
	fout << val << endl;
    return 0;
}

int eval(vector<int> nos, set<int> snos)
{
	//int combinations3 = pow((double)nos.size(),(double)3);
	//int combinations2 = pow((double)nos.size(),(double)2);
	int combinations1 = nos.size();
	int hit = 0;
	vector<int> top;
	vector<int> bottom;
	for(int i=0;i<combinations1;i++)
	{
		if(nos[i]==0)
		{
			continue;
		}
		/*if(!isPrime(nos[i]))
			continue;*/
		for(int j=0;j<combinations1;j++)
		{			
			//bottom.push_back((nos[i]*10)+nos[j]);
			int a = (nos[i]*10)+nos[j];
			for(int k=0;k<combinations1;k++)
			{				
				//top.push_back((nos[i]*100)+(nos[j]*10)+nos[k]);
				int b = (nos[i]*100)+(nos[j]*10)+nos[k];
				
				int prod = a*b;
				int prod2 = nos[i]*b;
				int prod3 = nos[j]*b;
				if(isSubset(prod,snos) && isSubset(prod2,snos) && isSubset(prod3,snos))
				{
					hit++;
				}
			}
		}
	}
	
	return hit;
}


bool isSubset(int prod, set<int> snos)
{
	while(prod>0)
	{
		int value = prod%10;
		
		prod = prod/10;
		if(snos.find(value) == snos.end())
		{
			return false;
		}
	}

	return true;
}


bool isPrime(int prod)
{
	if(prod == 2 || prod == 3 || prod == 5 || prod == 7)
		return true;

	return false;
}
