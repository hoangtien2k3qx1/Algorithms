
#include<bits/stdc++.h>

void Print(int n) {
    int x = (n * 2) - 1;
    int mid = n - 1;
    int k;
    for(int i = 0; i < x; i++) {
        for(int j = 0; j < x; j++) {
            k = std::max(std::abs(mid - i), std::abs(mid - j)) + 1;
            std::cout << k << " ";
        }
        std::cout << std::endl;
    }
}


int main() {
    system("cls");
    int n; std::cin >> n;
    Print(n);
    std::cin.get();
    return 0;
}