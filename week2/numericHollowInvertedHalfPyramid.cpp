#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter: ";
    cin>>n;
    for(int i=n;i>0;i--)
    {
      for(int j=0;j<i+1;j++)
      {
        if(j==0 || j==i || i==n-1)
        {
            cout<<(J+1)+" ";
        }else{
            cout<<"\n";
        }
      }
    }
}