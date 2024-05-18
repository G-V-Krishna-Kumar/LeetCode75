#include <iostream>
#include <string>

using namespace std;


class Solution {
    public:
        string gcdOfStrings(string str1, string str2) {
            if (str1.length() < str2.length()) {
                return gcdOfStrings(str2, str1);
            }

            //base case
            if (str1 == str2) {
                return str1;
            }

            if (startsWith(str1, str2)) {
                return gcdOfStrings(str1.substr(str2.length()), str2);
            }

            return "";
        }

        bool startsWith(string str1, string str2) {
            return (str1.substr(0, str2.length()) == str2);
        }
};


int main() {
    Solution solution_class;
    string str1, str2;
    cout << "Enter str1: ";
    cin >> str1;

    cout << "Enter str2: ";
    cin >> str2;

    string result = solution_class.gcdOfStrings(str1, str2);
    cout << result;

    return 0;
}