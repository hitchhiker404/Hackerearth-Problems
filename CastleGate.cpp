
#include <iostream>

using namespace std;

int main()
{
	int t,n;
	cin>>t;
	for(int k=0;k<t;k++)
	{
		int count=0;
		cin>>n;
		for(int i=1;i<n;i++)
		{
			for(int j=2;j<=n;j++)
			{
				if((i^j)<=n && i!=j&& (i<j) )
				count++;
				
			}
		}
		cout<<count<<endl;


	}	


return 0;
}
