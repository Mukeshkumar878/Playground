#include <cstring>
#include <iostream>
using namespace std;

int main()

{

   //Your code goes here

   char str[100];

  cin.get(str,100);

  int flag=0;

  for(int i=0;i<strlen(str);i++){

    if(str[i]==32)

      flag++;

  }

  if(flag>9)

    cout<<"Caption not eligible for the contest";

  else

    cout<<"Caption eligible for the contest";

}