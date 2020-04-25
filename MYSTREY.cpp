#include<iostream>
#include <bits/stdc++.h>
using namespace std;
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	
	int n;
	bool flag=true;
	while(cin>>n)
	{
		int count=0;
		
		if(n>=0)
		{
			while(n!=0)
		{
			n=n&(n-1);
			count++;
		}
		cout<<count\n;	
			
		}
		
		
		
	}

	return 0;
}
