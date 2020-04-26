#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int m[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>m[i];
  }
  int q;
  std::cin>>q;
  int flag=0;
  for(int i=0;i<n;i++)
  {
    if(m[i]==q)
    {
    flag=1;
      break;
  }
}
if(flag==0){
  std::cout<<"She failed";
}
  else
  {
    std::cout<<"She passed her exam";
  }
}