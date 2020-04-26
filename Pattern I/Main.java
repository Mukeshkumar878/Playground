#include <iostream>
int main()
{
  int n;
  std::cin>>n;
  for(int i=1;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    {
      std::cout<<n;
    }
    std::cout<<"\n";
    n++;
  }
  n--;
  for(int i=4;i>=1;i--)
  {
    for(int j=1;j<=i;j++)
    {
      std::cout<<n;
    }
    std::cout<<"\n";
    n--;
  }
}