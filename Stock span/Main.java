#include<iostream>
using namespace std;
void stockspan(int n,int*a){
  int c=0,c1=1;
  cout<<c1<<"\n";
  for(int i=1;i<n;i++){
    if(a[i-1]<=a[i]){
      c=c+2;
      cout<<c<<"\n";
    }
    else cout<<c1<<"\n";
  }
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  stockspan(n,arr);
}