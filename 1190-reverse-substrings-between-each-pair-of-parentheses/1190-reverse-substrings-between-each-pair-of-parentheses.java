class Solution {
    public String reverseParentheses(String s) {
        char[] arr = s.toCharArray();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                st.push(i);
            }
            else if (arr[i] == ')') {

                int left = st.pop() + 1;
                int right = i - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;

                    left++;
                    right--;
                }
            }
        }

        String res = "";

        for (char ch : arr) {
            if (Character.isAlphabetic(ch)) {
                res += ch;
            }
        }

        return res;
    }
}