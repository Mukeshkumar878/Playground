#include<iostream>
using namespace std;
int main()
{
  int count=0;
  float marks=0;
  int n=0;
  while(count!=3)
  {
    std::cin>>n;
    if(n<0)
    {
      marks-=1;
      break;
    }
    else
    {
      if(n%2!=0)
      {
        marks+=1;
        count++;
      }
      else
      {
        marks-=0.5;
      }
    }
  }
  std::cout<<marks;
}