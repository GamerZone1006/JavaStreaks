public class day12 {
    // public static void sqpattern(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void tripattern(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void revTri(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=n-i+1;j>=1;j--){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void numTri(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void doubleTri(int n){
    //     for(int i=1;i<=(2*n - 1);i++){
    //         int col;
    //         if(i>n){
    //             col = 2*n - i;
    //         }
    //         else{
    //             col = i;
    //         }
    //         for(int j=1;j<=col;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void mirrTri(int n){
    //     for(int i=1;i<=n;i++){
    //         int spaces = n - i;
    //         for(int k=0;k<spaces;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void revMirrTri(int n){
    //     for(int i=1;i<=n;i++){
    //         int spaces = i-1;
    //         for(int k=0;k<spaces;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j=n-i+1;j>=1;j--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void tri(int n){
    //     for(int i=1;i<=n;i++){
    //         int spaces = n-i;
    //         for(int k=0;k<spaces;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=(2*i - 1);j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void revTripattern(int n){
    //     for(int i=1;i<=n;i++){
    //         int spaces = i - 1;
    //         for(int k=0;k<spaces;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=2*(n-i)+1;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void ultaDiamond(int n){
    //     for(int i=1;i<=(2*n - 1);i++){
    //         int spaces;
    //         int col;
    //         if(i>5){
    //             col = i - n + 1;
    //             spaces = 2*n - i - 1;
    //             for(int k=0;k<spaces;k++){
    //                 System.out.print(" ");
    //             }
    //         }
    //         else{
    //             col = n - i + 1;
    //             spaces = i-1;
    //             for(int k=0;k<spaces;k++){
    //                 System.out.print(" ");
    //             }
    //         }
    //         for(int j=1;j<=col;j++){
    //             System.out.print("* ");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void hollowTri(int n){
    //     for(int i=1;i<=n;i++){
    //         int spaces=n-i;
    //         for(int k=0;k<spaces;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=(2*i - 1);j++){
    //             if (i==n || j==1 || j==(2*i - 1)) {
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void revHollowTri(int n){
    //     for(int i=1;i<=n;i++){
    //         int spaces=i-1;
    //         for(int k=0;k<spaces;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=2*(n-i)+1;j++){
    //             if(i==1 || j==1 || j==(2*(n-i) + 1)){
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void hollowDiamond(int n){
    //      *
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    //   *     *
    //    *   *
    //     * *
    //      *
    //     for(int i=1;i<=(2*n-1);i++){
    //         int spaces;
    //         int col;
    //         if (i>n) {
    //             col = 2*n - i;
    //             spaces = i - n;
    //         }
    //         else{
    //             col = i;
    //             spaces = n-i;
    //         }
    //         for(int k=0;k<spaces;k++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=2*col-1;j++){
    //             if (j==1 || j==(2*col -1)) {
    //                 System.out.print("* ");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void hollowSq(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<n;j++){
    //             if (i==1||i==n||j==1||j==(n-1)) {
    //                 System.out.print("*");
    //             }
    //             else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void DiaInSq(int n){
    //     int stars = 0;
    //     int spaces = 0;
    //     for(int i=1;i<=2*n;i++){
    //         if(i<=n){
    //             stars = n-i+1;
    //         }
    //         if(i>n){
    //             stars = i-n;
    //         }
    //         if (i<=n) {
    //             spaces = 2*(i-1);
    //         }
    //         if (i>n) {
    //             spaces = 2*(2*n - i);
    //         }
    //         for(int j=1;j<=stars;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=spaces;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=stars;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    //bow pattern
    public static void bow(int n){
        // *       *
        // **     **
        // ***   ***
        // **** ****
        // *********
        // **** ****
        // ***   ***
        // **     **
        // *       *
        for(int i=1;i<=(2*n-1);i++){
            int stars = 0;
            int spaces =0;
            if (i<=n) {
                stars = i;
                spaces = 2*(n-i);
            }
            if (i>n) {
                stars = (2*n-i);
                spaces = 2*(i-n);
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n=5;
        // sqpattern(n);
        // tripattern(n);
        // revTri(n);
        // numTri(n);
        // doubleTri(n);
        // mirrTri(n);
        // revMirrTri(n);
        // tri(n);
        // revTripattern(n);
        // ultaDiamond(n);
        // hollowTri(n);
        // revHollowTri(n);
        // hollowDiamond(n);
        // hollowSq(n);
        // DiaInSq(n);
        bow(n);
    }
}
