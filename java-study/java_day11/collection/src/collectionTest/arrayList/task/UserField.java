package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class UserField {
	public static String userId;
	public ArrayList<User> users = DBConnecter.users;
	private final int KEY = 3;

//   아이디 중복검사
	public User checkId(String id) {
//      빠른 for문, 향상된 for문, forEach
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}

//   회원가입
	public void join(User user) {
		user.setPassword(encrypt(user.getPassword()));
		users.add(user);
	}

//   로그인
	public boolean login(User user) {
		User userInDb = checkId(user.getId());
		if (userInDb != null) {
			if (userInDb.getPassword().equals(encrypt(user.getPassword()))) {
				userId = user.getId();
				return true;
			}
		}
		return false;

	}

//   로그아웃
	public void logout() {
		userId = null;
	}

//   비밀번호 변경(마이페이지)
	public void update(User user) {
		User userInDb = checkId(user.getId());
		userInDb.setPassword(encrypt(user.getPassword()));
	}

//   비밀번호 변경(비밀번호 변경 페이지)
	public boolean update(String password, String newPassword) {
		User foundUser = checkId(userId);
		if (foundUser.getPassword().equals(encrypt(password))) {
			foundUser.setPassword(encrypt(newPassword));
			return true;
		}
		return false;
	}

	public String randomNum(int count) {
		String number="";
	   Random random = new Random();
	   for (int i = 0; i < count; i++) {
		   number += random.nextInt(10);
	   }
	   return number;
   }

//   인증번호 생성
//   암호화
	public String encrypt(String password) {
		String encryptedPassword = "";
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char) (password.charAt(i) * KEY);
		}

		return encryptedPassword;
	}
}
