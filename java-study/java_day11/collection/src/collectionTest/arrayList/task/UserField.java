package collectionTest.arrayList.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class UserField {
	public static String userId;
	public ArrayList<User> users = DBConnecter.users;
	private final int KEY = 3;

//   ���̵� �ߺ��˻�
	public User checkId(String id) {
//      ���� for��, ���� for��, forEach
		for (User user : users) {
			if (user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}

//   ȸ������
	public void join(User user) {
		user.setPassword(encrypt(user.getPassword()));
		users.add(user);
	}

//   �α���
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

//   �α׾ƿ�
	public void logout() {
		userId = null;
	}

//   ��й�ȣ ����(����������)
	public void update(User user) {
		User userInDb = checkId(user.getId());
		userInDb.setPassword(encrypt(user.getPassword()));
	}

//   ��й�ȣ ����(��й�ȣ ���� ������)
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

//   ������ȣ ����
//   ��ȣȭ
	public String encrypt(String password) {
		String encryptedPassword = "";
		for (int i = 0; i < password.length(); i++) {
			encryptedPassword += (char) (password.charAt(i) * KEY);
		}

		return encryptedPassword;
	}
}
