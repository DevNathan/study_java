package exceptionTest;

import java.util.Scanner;

public class Chatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = null;

        System.out.println("상대방에게 보내는 메시지 : ");
        message = sc.nextLine();

        if (message.contains("바보")) {
            try {
                throw new BadWordException("비속어 사용");
            } catch (BadWordException e) {
                System.out.println("비속어는 금지 사항");
            }
        } else {
            System.out.println(message);
        }
    }
}
