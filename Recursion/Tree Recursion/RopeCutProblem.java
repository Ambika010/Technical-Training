public class RopeCutProblem {
    static int getMaxCuts(int ropeLen, int a, int b, int c){
        if(ropeLen==0){
            return 0;
        }
        if(ropeLen<0){
            return -1;
        }
        int option1 = getMaxCuts(ropeLen-a, a, b, c);
        int option2 = getMaxCuts(ropeLen-b, a, b, c);
        int option3 = getMaxCuts(ropeLen-c, a, b, c);
        int result = Math.max(option1, Math.max(option2, option3));
        if(result == -1){
            return -1;
        }
        return result+1;
    }
    public static void main(String[] args) {
        int maxCut=getMaxCuts(5, 2, 5, 1);
        System.out.println((maxCut==-1)?"not able to cut the rope":"Maximum no. of cuts = "+maxCut);
    }
}
