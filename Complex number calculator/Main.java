#include<iostream>
#include<cstdlib>

using namespace std;

int main(){

  int ch;

  cin>>ch;

  int ar,ac,br,bc;

  cin>>ar>>ac>>br>>bc;

  int ra,ca;

  switch(ch){

    case 1:

      ra=ar+br;

      ca=ac+bc;

      break;

    case 2:

      ra=ar-br;

      ca=ac-bc;

      break;

    case 3:

      ra=(ar*br)+(abs(ac)*abs(bc));

      ca=(ar*bc)+(ac*bc);

      break;

    default:

      cout<<"Invalid choice";

      return 0;

  }

  if(ca<0)

    cout<<ra<<ca<<"i";

  else

    cout<<ra<<"+"<<ca<<"i";

}