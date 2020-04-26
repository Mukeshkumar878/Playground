#include<iostream>
#include<math.h>
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  a=pow(a,b);
  if(a>=c)
  
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}