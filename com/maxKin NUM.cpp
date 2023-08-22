#include <iostream>

int getDigitCount(int number, int digit) {
    int count = 0;
    while (number > 0) {
        if (number % 10 == digit) {
            count++;
        }
        number /= 10;
    }
    return count;
}

int main() {
    int k, n;
    std::cin >> k >> n;
    
    int maxElement = -1;
    int maxOccurrence = 0;
    for (int i = 0; i < n; ++i) {
        int num;
        std::cin >> num;
        
        int occurrence = getDigitCount(num, k);
        if (occurrence > maxOccurrence) {
            maxOccurrence = occurrence;
            maxElement = num;
        }
    }
    
    std::cout << maxElement << std::endl;
    
    return 0;
}