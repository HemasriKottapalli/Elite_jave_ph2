#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"Enter n: ";
    cin>>n;
    int k=n;
    for(int i=0; i<n; i++)
    {
        int c=1;
        for(int j=0; j<k;j++)
        {
            //spaces
            if(j<n-i-1)
            {
                cout<<" ";
            }
            //numbers upto 3 in ex: 1 2 3 4 5
            else if(j<=n-1)
            {
              cout<<c;
              c++;
            }
            else if(j==n){
                c=c-2;
                cout<<c;
                c--;
            }
            else{
                cout<<c;
                c--;
            }
        }
         k++;
        cout<<endl;
    }
}