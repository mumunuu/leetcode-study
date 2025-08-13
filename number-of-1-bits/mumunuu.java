class Solution {

    public int hammingWeight(int n) {


        int count = 0;

        while(n != 0) {
            count += n & 1;
            n >>>= 1;
        }

        return count;


//        String binaryString = Integer.toBinaryString(n);
//
//
//        int answer = 0;
//        for (int i = 0; i < binaryString.length(); i++) {
//            if (binaryString.charAt(i) == '1') {
//                answer++;
//
//            }
//        }
//
//        return answer;
    }
}
