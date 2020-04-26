#include<iostream>
int fact(int n)
{
  if(n==1)
  {
    return 1;
  }
  else
  {
    return n*fact(n-1);
  }
}
int main()
{
  int n;
  std::cin>>n;
  int q=0;
  q=fact(n);
  std::cout<<"The factorial of "<<n<<" is "<<q;
}