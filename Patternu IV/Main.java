#include <iostream>
using namespace std;
int main() {
    int n,i,j,k=1;
  int temp=0;
  std::cin>>n;
  for( i=1;i<=n;i++)
  {
    if(i%2!=0)
    {
      for(j=1;j<=n;j++)
      {
        std::cout<<k;
        if(j==n-1)
        {
          k++;
        }
      }
      temp=k;
      std::cout<<"\n";
    }
    else
    {
      k=k+1;
      for(j=1;j<=n;j++)
      {
        std::cout<<k;
        if(j==1)
        {
          k--;
        }
      }
      k=temp+1;
      std::cout<<"\n";
    }
  }
    return 0;
}