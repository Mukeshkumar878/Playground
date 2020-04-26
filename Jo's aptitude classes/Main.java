#include<iostream>
int gcd(int x, int y,int z)
{
  int gcd=0;
  for(int i=1;i<=x;i++)
  {
    if(x%i==0&&y%i==0&&z%i==0)
    {
      gcd=i;
    }
  }
  return gcd;
}
int main()
{
  int x,y,z,d;
  std::cin>>x>>y>>z>>d;
  int p=0;
  p=gcd(x,y,z);
  if(p==d)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}