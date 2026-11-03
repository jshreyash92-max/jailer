import java.util.*;
public class ChatBot1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg;
        System.out.println("Chatbot: Hello! How can I help you?");
        while (true) {
            System.out.print("You: ");
            msg = sc.nextLine().toLowerCase();
            if (msg.contains("hello") || msg.contains("hi"))
                System.out.println("Chatbot: Hello! Nice to meet you.");
            else if (msg.contains("name"))
                System.out.println("Chatbot: I am a simple chatbot.");
            else if (msg.contains("how are you"))
                System.out.println("Chatbot: I am fine. Thank you!");
            else if (msg.contains("bye")){
                System.out.println("Chatbot: Goodbye!");
                break;
            } else
                System.out.println("Chatbot: Sorry, I don't understand.");}
        sc.close();
    }}
