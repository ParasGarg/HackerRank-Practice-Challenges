#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str) {
    vector<int> parsedVal;                                          // new stl
    string val = "";                                                // string to collect value fron string stream
    // traversing string
    for (int i = 0; i < str.size(); i++) {                          // traversing string
        if (str[i] != ',') {                                        // actions when no separator
            val = val + str[i];            
        } else if (str[i] == ',') {                                 // actions to be performed if separator
            int val_parsed = stoi(val);                             // converting string into int
            parsedVal.push_back(val_parsed);                        // adding value to vector
            val = "";                                               // putting null in val
        }
    }
    int val_parsed = stoi(val);                                     // converting string into int
    parsedVal.push_back(val_parsed);                                // adding value to vector
    
    return parsedVal;
}

int main() {
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    
    // display output
    for(int i = 0; i < integers.size(); i++) {
        cout << integers[i] << "\n";
    }
    
    return 0;
}