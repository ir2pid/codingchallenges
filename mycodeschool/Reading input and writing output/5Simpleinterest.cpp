#include<iostream>
#include<cstdio>
#include<cmath>
// Include headers as needed

using namespace std;

int main()
{
    // Write your code here
    float p, r, m, si;
    cin>>p>>r>>m;
    
    si = p*(r/1200.0f)*m;
    
    cout << fixed;
    cout.precision(2);
    cout<<si;
    
    // Return 0 to indicate normal termination
    return 0;
}
