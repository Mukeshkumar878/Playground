#include<iostream>
int digital_root(int x)
{
  return x<10?x:digital_root(x%10+digital_root(x/10));
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<digital_root(n);
}