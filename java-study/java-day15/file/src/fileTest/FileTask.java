package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileTask {
	public static void main(String[] args) throws IOException {
//      ������ 4�� ���
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
//		String[] foods = { "������ũ", "����ī��", "�ܹ���", "�ѿ�" };
//
//		Arrays.asList(foods).stream().forEach(food -> {
//			try {
//				bufferedWriter.write(food + "\n");
////           	bufferedWriter.newLine(); ����!
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		});
//		bufferedWriter.close();

//      ���� ��� �����ͼ� �ֿܼ� ���
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("food.txt"));
//		String line = null;
//
//		while ((line = bufferedReader.readLine()) != null) {
//			System.out.println(line);
//		}
//		bufferedReader.close();

//      BufferedReader bufferedReader1 = new BufferedReader(new FileReader("food.txt"));
//      String line = null;
//      String temp = "";
//      
//      while((line = bufferedReader1.readLine()) != null) {
//         if(line.equals("������ũ")) {
//            temp += "���İ�Ƽ\n";
//            continue;
//         }
//         temp += line + "\n";
//      }
//      
//      bufferedReader1.close();
//
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
//      bufferedWriter.write(temp);
//      
//      bufferedWriter.close();

//      �ܹ��� ����
		BufferedReader bufferedReader1 = new BufferedReader(new FileReader("food.txt"));
		String line = null;
		String temp = null;
		
		while ((line = bufferedReader1.readLine()) != null) {
			if (line.equals("�ܹ���")) {
				continue;
			}
			temp += line + "\n";
		}

		bufferedReader1.close();

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("food.txt"));
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}
}
