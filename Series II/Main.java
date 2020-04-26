#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int q=11;
  for(int i=1;i<=n;i++)
  {
    std::cout<<q*q<<" ";
    q+=4;
  }
}