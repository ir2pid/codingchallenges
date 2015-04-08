/*
ID: ir2pid1
PROG: barn1
LANG: C++11
*/
#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <map>
#include <set>
#include <algorithm>    // std::sort

using namespace std;

int sort(vector<int> cows,vector<int> temp, int boards);
int needSort(vector<int> temp,int boards);
int finddoors(vector<int> cows,vector<int> temp);
int main() {
    ofstream fout ("barn1.out");
    ifstream fin ("barn1.in");
    int a, b, c, x;
    fin >> a >> b >>c; //maximum number of boards;the total number of stalls;number of cows
	vector<int> cows;
	vector<int> temp;
	map<int,vector<int>> stalls;
	for(int i=0;i<c;i++)
	{
		fin >> x;
		cows.push_back(x);		
		temp.push_back(i+1);
	}
	sort (cows.begin(), cows.end());
	int val = sort(cows,temp,a);
	fout << val << endl;
    return 0;
}

int sort(vector<int> cows,vector<int> temp, int boards)
{
	int diff = 0;
	int splits = cows.size();
	
	do{
		diff++;
		int rank = 1;
		temp[0] = rank;
		for(int i=0;i<cows.size()-1;i++)
		{
			splits = needSort(temp,boards);
			if(splits > boards)
			{
				if(cows[i+1]-cows[i] <= diff )
				{
					if(temp[i+1] != temp[i])
					{
						splits--;
					}
					temp[i+1] = temp[i];
					//rank = temp[i+1];
				}
				else
				{
					temp[i+1] = ++rank;
				}
			}
			else
			{
				break;
			}
		}
		
	}while(splits > boards);

	return finddoors(cows, temp);
}

int needSort(vector<int> temp,int boards)
{
	set<int> set;
	for(int i=0;i<temp.size();i++)
	{
		set.insert(temp[i]);
	}
	
	return set.size();
}


int finddoors(vector<int> cows,vector<int> temp)
{
	int sum = 0;
	int val = 1;
	int min = 0;
	for(int i=0;i<=temp.size()-1;i++)
	{
		if(temp[i]!=val)
		{
			sum += cows[i-1]-cows[min]+1;
			val = temp[i];
			min = i;
		}
	}
	sum += cows[cows.size()-1]-cows[min]+1;
	return sum;
}


