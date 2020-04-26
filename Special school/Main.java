#include<iostream>
#include<bits/stdc++.h>
#include<string>
using namespace std;
int main()
{
  //Type your code here.
  string a,b,c;

  cin>>a;

  c=a;

  cin>>b;

  
  reverse(a.begin(),a.end());

  if(a==b)

    
    cout<<"It is correct";

  else

    cout<<"It is wrong";

}