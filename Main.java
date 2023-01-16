import java.util.Scanner;
class chatbot extends Thread {
    public void run(String s) {
        try {
            for (int i=1; i<=1;i++) {
                System.out.println("USER :" + s);
                Thread.sleep(2000);
                continue;
            }
            if (s.equals("hii")) {
                System.out.println("BOT : HELLO");
            }
            else if (s.equals("hello"))
            {
                System.out.println("BOT : HII");
            }
            else if (s.equals("from"))
            {
                System.out.println("BOT : INDIA !");
                System.out.println("BOT : U ?");
            }
            else if (s.equals("where are you from"))
            {
                System.out.println("BOT : INDIA !");
                System.out.println("BOT : U ?");
            }
            else if (s.equals("india"))
            {
                System.out.println("BOT : NICE...");
                System.out.println("BOT : FROM WHICH STATE ?");
            }
            else if (s.equals("ind")) {
                System.out.println("BOT : NICE...");
                System.out.println("BOT : FROM WHICH STATE ?");
            } else if (s.equals("m or f")) {
                System.out.println("BOT : M ");
                System.out.println("BOT : AND U ?");
            } else if (s.equals("what is your name")) {
                System.out.println("BOT : I AM CHINMAYA !");
                System.out.println("BOT : UR NAME ");
            } else if (s.equals("are you single")) {
                System.out.println("BOT : HOW DID YOU KNOW THAT ?");
                System.out.println("BOT : ARE YOU A MAGICIAN");
            } else if (s.equals("are you a bot")) {
                System.out.println("BOT : NO I AM NOT A BOT");
                System.out.println("BOT : ARE YOU A BOT  !");
                if (s.equals("no")){
                    System.out.println("ok");
                }
            }
            else if (s.equals("are you a student")){
                System.out.println("BOT : YES");
                System.out.println("BOT : WHAT ABOUT YOU");
            }
            else if (s.equals("exist"))
            {
                System.out.println("Exiting...");
                System.exit(0);
            }
            else {
                System.out.println("BOT :OO OK");
            }
        } catch (Exception sc) {

        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner command=new Scanner(System.in);
        System.out.println("-->WRITE EVERYTHING IN SMALLER LATTER WITH CORRECT SPELLING !");
        System.out.println("USE 'exist' KEYWORD :- TO END THE CHAT ");
        chatbot ChatBot=new chatbot();
        while (true) {
            while (true) {
                String s=command.nextLine();
                ChatBot.run(s);
                break;
            }
        }
    }
}