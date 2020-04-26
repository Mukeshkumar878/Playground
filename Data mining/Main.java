#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int o=0,e=0,d=0;
  while(n>0)
  {
    d=n%10;
    if(d%2==0)
    {
      e+=d;
    }
    else
    {
      o+=d;
    }
    n=n/10;
  }
  if(e==o)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}