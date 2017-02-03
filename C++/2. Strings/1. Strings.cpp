#include <iostream>
#include <string>
using namespace std;

int main() {
    string a, b;
    cin >> a >> b;
    
    // printing size
    cout << a.size() << " " << b.size() << endl;
     
    // concatenating 
    cout << a + b << endl;
    
    // swapping
    char tmp = a[0];
    a[0] = b[0];
    b[0] = tmp;
    cout << a << " " << b << endl;
  
    return 0;
}
