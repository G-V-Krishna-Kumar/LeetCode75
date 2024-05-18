#include <vector>
#include <iostream>

using namespace std;


class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int n = candies.size();
        vector<bool> result(n);
        int i, maximum=0;
        for (i=0; i<n; i++) {
            if (candies[i] > maximum) {
                maximum = candies[i];
            }
        }

        for (i=0; i<n; i++) {
            if ((candies[i]+extraCandies) >= maximum) {
                result[i] = true;
            }
            else {
                result[i] = false;
            }
        }

        return result;
    }
};


int main() {
    Solution solution_class;

    int n, i, extraCandies;
    cout << "Enter length of the array: ";
    cin >> n;

    vector<int> candies(n);

    for (i=0;i<n; i++) {
        cout << "Enter candies[" << i << "]: ";
        cin >> candies[i];
    }

    cout << "Enter extra candies :";
    cin >> extraCandies;

    vector<bool> result(n);
    result = solution_class.kidsWithCandies(candies, extraCandies);

    for (i=0; i<n; i++) {
        cout << result[i] << " ";
    }

    return 0;
}