import java.util.Scanner;
public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Rock, 2-Paper, 3-Scissor");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice>3 || choice<1) {
            System.out.println("Invalid!");
            return;
        }
        int min=1;
        int max=3;
        int bot = (int)(Math.random()*(max - min + 1)+min);
        System.out.println("Bot Choice: "+bot);
        if (bot==choice) {
            System.out.println("Draw, try again!");
        }
        else if((bot==1 && choice==2) || (bot==2 && choice==3) || (bot==3 && choice==1)){
            System.out.println("You Win!");
        }
        else{
            System.out.println("Bot Wins!");
        }
        sc.close();
    }
}