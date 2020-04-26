#include<iostream>
using namespace std;
int main()
{
  int n,a=-1,b=1,c;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  std::cout<<c;
}