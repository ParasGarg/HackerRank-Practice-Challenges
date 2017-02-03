#include <iostream>
#include <cstdio>
using namespace std;

int main() {
    int integerVal;
    long longVal;
    long long longLongVal;
    char charVal;
    float floatVal;
    double doubleVal;
    
    scanf("%d %ld %lld %c %f %lf", &integerVal, &longVal, &longLongVal, &charVal, &floatVal, &doubleVal);
    printf("%d\n%ld\n%lld\n%c\n%f\n%lf", integerVal, longVal, longLongVal, charVal, floatVal, doubleVal);    
        
    return 0;
}