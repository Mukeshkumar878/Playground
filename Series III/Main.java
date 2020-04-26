#include <iostream>
int main()
{
  int n,q=6,p=1,r=0;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    std::cout<<q<<" ";
    r=p*5;
    q+=r;
    p++;
  }

}