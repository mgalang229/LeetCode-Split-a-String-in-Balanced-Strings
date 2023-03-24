class Solution {
    public int balancedStringSplit(String s) {
        int[] freq = new int[2];
        Arrays.fill(freq, 0);
        int count = 0;
        for (char letter : s.toCharArray()) {
            if (letter == 'R') {
                freq[0]++;
            } else {
                freq[1]++;
            }
            if (freq[0] == freq[1]) {
                count++;
                freq[0] = freq[1] = 0;
            }
        }
        return count;
    }
}
