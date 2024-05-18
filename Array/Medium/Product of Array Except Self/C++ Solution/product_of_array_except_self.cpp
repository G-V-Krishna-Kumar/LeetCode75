#include <vector>
#include <iostream>

using namespace std;

class Solution {
    public:
        vector<int> prodExceptSelf(vector<int>& nums) {
            int n = nums.size();
            vector<int> answer(n);

            int prefix = 1, i;
            for (i=0; i<n; i++) {
                answer[i] = prefix;
                prefix *= nums[i];
            }

            int postfix = 1;
            for (i=n-1; i>=0; i--) {
                answer[i] *= postfix;
                postfix *= nums[i];
            }

            return answer;
        }
};

int main() {
    Solution solution_class;
    int n, i;
    cout << "Enter length of nums: ";
    cin >> n;

    vector<int> nums(n), answer(n);
    for (i=0; i<n; i++) {
        cout << "Enter element nums[" << i << "]: ";
        cin >> nums[i];
    }

    answer = solution_class.prodExceptSelf(nums);
    for (i=0; i<n; i++) {
        cout << answer[i] << " ";
    }

    return 0;
}
