public class towerOfHanoi{

    // public static void tOH(int n, String src, String helper, String dest){
    //     if (n==1) {
    //         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    //         return;
    //     }
    //     tOH(n-1, src, dest, helper);
    //     System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    //     tOH(n-1, helper, src, dest);
    // }

    public static int tohSteps(int n, String src, String helper, String dest){
        if(n==1){
            return 1;
        }
        return tohSteps(n - 1, src, dest, helper) 
           + 1 
           + tohSteps(n - 1, helper, src, dest);
    }

    public static int tohStepsDirect(int n, String src, String helper, String dest){
        return (int) Math.pow(2,n)-1;
    }

    public static void main(String[] args) {
        // tohSteps(3, "A", "B", "C");
        System.out.println(tohSteps(3, "A", "B", "C"));
        System.out.println(tohStepsDirect(3, "A", "B", "C"));
    }
}