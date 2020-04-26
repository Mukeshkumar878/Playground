#include<iostream>
using namespace std;
int main()
{
  int n;
  int temp,dig,sum=0;
  std::cin>>n;
  temp=n;
  while(n>0)
  {
    dig=n%10;
    n=n/10;
    sum+=dig;
  }
  if(temp%sum==0)
  {
    std::cout<<"Harshad Number";
  }
  else
  {
    std::cout<<"Not Harshad Number";
  }
  
}