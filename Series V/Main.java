#include<iostream>
using namespace std;
int main()
{
 int n,q=11;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    std::cout<<q*q<<" ";
    q+=4;
  }
}