#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2!=0)
      std::cout<<i*i-1<<" ";
    else
      std::cout<<i*i-2<<" ";
    
  }
}