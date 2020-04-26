#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char chk='!';

  string s;

  cin>>s;

  while(s!="####"){

    if(chk!='!'){

      if(s.at(0)==chk)

        cout<<s<<"\n";}

    else

      cout<<s<<"\n";

    chk=s.at(s.length()-1);

    cin>>s;

  }
}