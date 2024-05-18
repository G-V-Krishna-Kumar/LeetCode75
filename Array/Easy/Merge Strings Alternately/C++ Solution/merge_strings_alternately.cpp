#include <iostream>
#include <string>
using namespace std;

class Solution {
    public:
        string mergeAlternately(string word1, string word2) {
            string result = "";
            int ptr = 0;

            while (ptr < max(word1.length(), word2.length())) {
                if (ptr < word1.length()) {
                    result += word1[ptr];
                }
                if (ptr < word2.length()) {
                    result += word2[ptr];
                }
                ptr++;
            }

            return result;
        }
};

int main() {
        Solution solution_class;
        string word1, word2;
        cout << "Enter word 1: ";
        cin >> word1;
        cout << "\nEnter word 2: ";
        cin >> word2;

        string result = solution_class.mergeAlternately(word1, word2);

        cout << "\nResult: " << result << endl;

        return 0;
}