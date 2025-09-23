package Basic_Maths;

public class LCM {
    //method 1: brute force - what I thought of at first hehe:)
    public static int findLcm(int a, int b){
        int minNum = Math.min(a, b);
        int maxNum = Math.max(a, b);
        int lcm = 0;
        outerLoop:
        for(int i=2; i<=maxNum;){
            for(int j=1; j<=minNum;){
                if(i*minNum == j*maxNum){
                    lcm = j * maxNum;
                    break outerLoop;
                } else if(i*minNum < j*maxNum){
                    i++;
                    continue;
                } else if(i*minNum > j*maxNum){
                    j++;
                }
            }
        }
        return lcm;
    }
    public static void main(String[] args) {
        int lcm = LCM.findLcm(20, 40);
        System.out.println(lcm);
    }
}
