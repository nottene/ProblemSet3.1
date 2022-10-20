import java.util.Scanner;

public class consoleCarnival {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO THE CONSOLE CARNIVAL!");
        System.out.println("--------------------------------");
        System.out.println("Shall we play a game?\n");
        System.out.println("1. FLip a coin");
        System.out.println("2. Rock, Paper, Scissors");
        System.out.println("3. Magic 8 Ball");
        System.out.print("What game would you like to play: ");
        int choose = input.nextInt();
        if (choose == 1) {
            coinFlip();
        } else if(choose == 2) {
            rps();
        } else {
            m8b();
        }
    }

    public static int randomInt(int n) {
        return (int)(Math.random()*n) + 1;
    }
    public static void coinFlip() {
        Scanner input = new Scanner(System.in);
        int gamble = randomInt(2);
        String ans = "";
        System.out.print("Call heads or tails: ");
        String flip = input.next();
        if (gamble == 1) {
            ans = "heads";
        } else {
            ans = "tails";
        }

        if (flip.equals(ans)) {
            System.out.println("Ok, I'm flipping the coin! I got: " +ans+ ". You called it!");
        } else {
            System.out.println("Ok, I'm flipping the coin! I got: " +ans+ ". F in the chat!");
        }
    }

    public static void rps() {
        Scanner input = new Scanner(System.in);
        int random = randomInt(3);
        String an = "";
        int w = 0;
        System.out.print("Human, let's battle an epic game of rock, paper, scissors! Your choice: ");
        String r = input.next();
        if (random == 1) {
            an = "rock";
        } else if(random == 2) {
            an = "paper";
        } else {
            an = "scissors";
        }

        if (r.equals("rock")) {
            w = 1;
        }
        if (r.equals("paper")) {
            w = 2;
        }
        if (r.equals("scissors")) {
            w = 3;
        }

        if (w == 2 && random == 1 || w == 3 && random == 2 || w == 1 && random == 3) {
            System.out.println("Ok, I chose " +an+ "! NOOO, I took a fat L!!!");
        }else if (random == 2 && w == 1 || random == 3 && w == 2 || random == 1 && w == 3) {
            System.out.println("Ok, I chose " +an+ "! Haha, you are no match for me, mere mortal!!!");
        } else if (random == 1 && w == 1 || random == 2 && w == 2 || random == 3 && w == 3) {
            System.out.println("Ok, I chose " +an+ "! BRUH, how can I not beat a mere mortal!!!");
        }
    }

    public static void m8b() {
        Scanner input = new Scanner(System.in);
        System.out.println("Mere mortal, I can see into the FUTURE! Ask me a yes/no question: ");
        String s = input.next();
        int ball = randomInt(20);
        if (ball == 1) System.out.println("It is certain.");
        if (ball == 2) System.out.println("It is decidedly so.");
        if (ball == 3) System.out.println("Without a doubt.");
        if (ball == 4) System.out.println("Yes, definitely.");
        if (ball == 5) System.out.println("You may rely on it.");
        if (ball == 6) System.out.println("As I see it, yes.");
        if (ball == 7) System.out.println("Most likely.");
        if (ball == 8) System.out.println("Outlook good.");
        if (ball == 9) System.out.println("Yes.");
        if (ball == 10) System.out.println("Signs point to yes.");
        if (ball == 11) System.out.println("Reply hazy, try again.");
        if (ball == 12) System.out.println("Ask again later.");
        if (ball == 13) System.out.println("Better not tell you now.");
        if (ball == 14) System.out.println("Cannot predict now.");
        if (ball == 15) System.out.println("Concentrate and ask again.");
        if (ball == 16) System.out.println("Don't count on it.");
        if (ball == 17) System.out.println("My reply is no.");
        if (ball == 18) System.out.println("My sources say no.");
        if (ball == 19) System.out.println("Outlook not so good.");
        if (ball == 20) System.out.println("Very doubtful.");
    }
}
