#include <iostream>
#include <vector>

using namespace std;

class Solution {
    public:
        bool canPlaceFlowers(vector<int>& flowerbed, int n) {
            bool left, right;
            int count=0, i, arr_length = flowerbed.size();

            for (int i=0; i<arr_length; i++) {
                if (flowerbed[i] == 0) {
                    left = (i==0) || (flowerbed[i-1] == 0);
                    right = (i==arr_length-1) || (flowerbed[i+1] == 0);

                    if (left && right) {
                        count++;
                        flowerbed[i] = 1;
                    }
                }
            }

            return count >= n;
        }
};


int main() {
    Solution solution_class;
    int size, i, n;
    cout << "Enter size of array: ";
    cin >> size;

    vector<int> flowerbed (size);
    
    for (i=0; i<size; i++) {
        cout << "Enter flowerbed[" << i << "]: ";
        cin >> flowerbed[i];
    }

    cout << "Enter value of n: ";
    cin >> n;


    bool result = solution_class.canPlaceFlowers(flowerbed, n);

    if (result) 
        cout << "True";
    else
        cout << "False";

    return 0;
}