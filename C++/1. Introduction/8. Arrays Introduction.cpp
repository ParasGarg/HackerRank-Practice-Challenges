#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int size;
    cin >> size;
    
    // input
    int arr[size];
    for (int i = 0; i < size; i++) {
        cin >> arr[i];
    }
    
    // output
    for (int i = size-1; i >= 0; i--) {
        printf("%d ", arr[i]);
    }
    
    return 0;
}