#include<iostream>
int hcf(int n1,int n2)
{
  if(n2!=0)
    return hcf(n2,n1%n2);
  else
    return n1;
}
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<hcf(a,b); 
}