#include<iostream>
int main(){
  int n;
  std::cin>>n;
  int *p;
  p=(int *)malloc(n*sizeof(int));
  int m=0;
  for(int i=0;i<n;i++)
  {
    std::cin>>*(p+i);
   if((*(p+i))%2==0)
   {
     m++;
   }
  }
  free(p);
  std::cout<<n-m<<"\n"<<m;
  
  return 0;
}