import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("🤖 BotMate: Hey there! I'm your friendly Java chatbot.");
        System.out.println("Type 'quit' whenever you're done chatting.\n");

        while (true) {
            System.out.print("You: ");
            String userInput = inputScanner.nextLine().toLowerCase();

            if (userInput.equals("quit")) {
                System.out.println("🤖 BotMate: See you soon! 👋");
                break;
            } else if (userInput.contains("hi") || userInput.contains("hey")) {
                System.out.println("🤖 BotMate: Hello! How may I help you?");
            } else if (userInput.contains("what's up") || userInput.contains("how are you")) {
                System.out.println("🤖 BotMate: I'm doing awesome, thanks for asking! 😎");
            } else if (userInput.contains("who are you") || userInput.contains("your name")) {
                System.out.println("🤖 BotMate: I'm BotMate, your mini assistant.");
            } else if (userInput.contains("goodbye") || userInput.contains("bye")) {
                System.out.println("🤖 BotMate: Goodbye! Come back anytime.");
            } else {
                System.out.println("🤖 BotMate: Hmm... I'm not sure how to respond to that.");
            }
        }

        inputScanner.close();
    }

}
