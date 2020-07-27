class Solution {
public:
    int mySqrt(int x) {
        if (x == 0) return 0;
        int l = 1, r = x;
        while (l < r) {
            int m = r + (l - r) / 2;
            if (m <= x / m) l = m;
            else r = m - 1;
        }
        return l;
    }
};
