#include <iostream>
int main(){
  int n;
  std::cin>>n;
  int i,j,k=1;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<i;j++)
    {
      std::cout<<k<<"*";
    }
    std::cout<<k<<"\n";
    k++;
  }
  k--;
  for(i=n;i>=1;i--)
  {
    for(j=1;j<i;j++)
    {
      std::cout<<k<<"*";
    }
    std::cout<<k<<"\n";
        k--;
}
}