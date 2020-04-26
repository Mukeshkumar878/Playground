#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int a=-1,b=1,c=0;
  for(int i=1;i<=n;i++)
  {
    c=a+b;
    a=b;
    b=c;}
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<c; 
}