package collectionTest.arrayList.task;

public class Login {
	   public static void main(String[] args) {
	      UserField userField = new UserField();
	      User user = new User();
	      User user2 = new User();
	      
	      user.setId("hds1234");
	      user.setName("�ѵ���");
	      user.setPassword("1234");
	      user.setPhone("01012341234");
	      
	      user2.setId("hds12345");
	      user2.setName("�ѵ���");
	      user2.setPassword("4444");
	      user2.setPhone("0108889999");
	      
	      if(userField.checkId(user.getId()) == null) {
	         userField.join(user);
	         System.out.println(DBConnecter.users);
	      }else {
	         System.out.println("�ߺ��� ���̵�");
	      }
	      
	      if(userField.checkId(user2.getId()) == null) {
	         userField.join(user2);
	         System.out.println(DBConnecter.users);
	      }else {
	         System.out.println("�ߺ��� ���̵�");
	      }

	      
	      User userForLogin = new User();
	      userForLogin.setId("hds1234");
	      userForLogin.setPassword("1234");
	      
	      if(userField.login(userForLogin)) {
	         System.out.println("�α��� ����");
	         
	      }else {
	         System.out.println("�α��� ����");
	         
	      }

	   }
	}