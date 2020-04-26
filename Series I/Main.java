#include<iostream>
int main()
{
  int n;
  float a=0.5,b=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    std::cout<<a<<" ";
  a+=b;
    b*=3;
  }
}