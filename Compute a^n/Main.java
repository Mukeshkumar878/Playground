#include<iostream>
using namespace std;
int power(int base,int a)
{
  if(a!=0)
    return (base*power(base,a-1));
  else
    return 1;
}
int main()
{
  int a,n;
  std::cin>>a>>n;
  int q;
  q=power(a,n);
  std::cout<<"Enter the value of a\nEnter the value of n";
  std::cout<<"\nThe value of "<<a<<" power "<<n<<" is "<<q;
}