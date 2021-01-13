#include <iostream>
#include <cstdlib>

using namespace std;

int main()

{

char aone[4] = {};

char bone[4] = {};

cin >> aone;

cin >> bone;

int c, d , e, f,g;

c = atoi(aone) ; //입력 a

d = bone[0] - '0' ;

e = bone[1] - '0' ; //십의자리

f = bone[2] - '0' ; //일의자리

g = atoi(bone) ;

cout << c * f << endl;

cout << c * e << endl;

cout << c * d << endl;

cout << c * g;

return 0;

}
