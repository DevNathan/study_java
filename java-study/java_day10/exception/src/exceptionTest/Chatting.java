package exceptionTest;

import java.util.Scanner;

public class Chatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = null;

        System.out.println("���濡�� ������ �޽��� : ");
        message = sc.nextLine();

        if (message.contains("�ٺ�")) {
            try {
                throw new BadWordException("��Ӿ� ���");
            } catch (BadWordException e) {
                System.out.println("��Ӿ�� ���� ����");
            }
        } else {
            System.out.println(message);
        }
    }
}
