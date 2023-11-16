package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//   throws는 해당 메소드를 사용한 쪽으로 예외를 발생시킨다.
//   따라서 메소드 내에서는 throws에 작성한 예외가 발생하지 않는다.
	public static void main(String[] args) throws IOException {
//      절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로, "대한민국 서울시 강남구 역삼동 123-22 빌딩 302호", "C:/a/b"
//      상대 경로: 현재 위치에 따라 변경되는 경로, "직진해서 우회전하세요", "../../a/b", "./a", "a"

		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
		bufferedWriter.write("조남호");
		bufferedWriter.close();

		BufferedReader bufferedReader = null;

		try {
			bufferedReader = new BufferedReader(new FileReader("test.txt"));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로");
		} finally {
			bufferedReader.close();
		}
	}
}
