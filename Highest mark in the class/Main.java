#include<iostream>
int main()
{
  int high=0;
  int n;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    if(a[i]>high)
    {
      high=a[i];
    }
  }
  std::cout<<high;

}