class Solution {
    public String defangIPaddr(String address) {
        char[] arr=address.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='.')
            {
                sb.append("[.]");
            }else
            {
                sb.append(arr[i]);
            }
        }return sb.toString();
    }
}