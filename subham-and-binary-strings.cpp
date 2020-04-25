#include <string>
#include <iostream>
#include <bits/stdc++.h>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	int t;
	cin>>t;
	for(int i=0;i<t;i++)
	{
		int n;
		cin>>n;
		string str;
		cin>>str;
		int top=0,count=0;
		for(int i=0;i<n;i++)
		{
			if(top<str.length())
			{
				if(str[top]=='0')
				{
				count++;
						
				}
				top++;
				continue;
				
			}
			else if(top>=str.length())
			{
				top=0;
				if(str[top]=='0')
				{
				count++;		
				}
				top++;
				continue;
				
			}
			
			
			
		}
		
		cout<<count<<endl;
			
	}
	
	
	
return 0;
}	



