#include <iostream>
using namespace std;
struct student
{
  char name[50];

    int roll;

    float marks;

};

int main() 

{

   //Your code goes here

  student s;

  cin.get(s.name,50);

  cin>>s.roll;

  cin>>s.marks;

  cout<<"\nStudent Details\n";

  cout<<"Name: "<<s.name<<"\n";

  cout<<"Roll: "<<s.roll<<"\n";

  cout<<"Marks: "<<s.marks<<"\n";

}