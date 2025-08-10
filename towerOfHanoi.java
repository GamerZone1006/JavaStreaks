public class towerOfHanoi{
    public static void tOH(int n, String src, String helper, String dest){
        if (n==1) {
            System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        tOH(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        tOH(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        tOH(3, "A", "B", "C");
    }
}