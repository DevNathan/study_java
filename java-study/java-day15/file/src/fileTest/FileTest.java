package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//   throws�� �ش� �޼ҵ带 ����� ������ ���ܸ� �߻���Ų��.
//   ���� �޼ҵ� �������� throws�� �ۼ��� ���ܰ� �߻����� �ʴ´�.
	public static void main(String[] args) throws IOException {
//      ���� ���: ��𿡼� �ۼ��ص� ã�ư� �� �ִ� ���, "���ѹα� ����� ������ ���ﵿ 123-22 ���� 302ȣ", "C:/a/b"
//      ��� ���: ���� ��ġ�� ���� ����Ǵ� ���, "�����ؼ� ��ȸ���ϼ���", "../../a/b", "./a", "a"

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
		bufferedWriter.write("����ȣ");
		bufferedWriter.close();

		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new FileReader("test.txt"));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("���� ���");
		} finally {
			bufferedReader.close();
		}
	}
}
