package collectionTest.arrayList.task;


public class User {
	   private String name;
	   private String id;
	   private String password;
	   private String phone;
	   
	   public User() {;}

	   public String getName() {
	      return name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public String getId() {
	      return id;
	   }

	   public void setId(String id) {
	      this.id = id;
	   }

	   public String getPassword() {
	      return password;
	   }

	   public void setPassword(String password) {
	      this.password = password;
	   }

	   public String getPhone() {
	      return phone;
	   }

	   public void setPhone(String phone) {
	      this.phone = phone;
	   }

	   @Override
	   public String toString() {
	      return "User [name=" + name + ", id=" + id + ", password=" + password + ", phone=" + phone + "]";
	   }

	   @Override
	   public int hashCode() {
	      final int prime = 31;
	      int result = 1;
	      result = prime * result + ((id == null) ? 0 : id.hashCode());
	      return result;
	   }

	   @Override
	   public boolean equals(Object obj) {
	      if (this == obj)
	         return true;
	      if (obj == null)
	         return false;
	      if (getClass() != obj.getClass())
	         return false;
	      User other = (User) obj;
	      if (id == null) {
	         if (other.id != null)
	            return false;
	      } else if (!id.equals(other.id))
	         return false;
	      return true;
	   }
	   
	}

