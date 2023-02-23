class Solution {
public:
vector<char> reverseString(vector<char>& s) {
        int start = 0;
        int end = s.size()-1;
        while(start<end)
        {
            swap(s[start],s[end]);
            start++;
            end--;
        }
    return s;
    }
};