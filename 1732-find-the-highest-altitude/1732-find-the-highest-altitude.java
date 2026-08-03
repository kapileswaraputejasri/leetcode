class Solution {
    public int largestAltitude(int[] gain) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < gain.length; i++) {
            a = a + gain[i];
            if (a > b) {
                b = a;
            }
        }
        return b;
    }
}