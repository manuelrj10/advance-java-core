package exeptionX;

public class ThrowUser {
	String username="manuelrajesh39@gmail.com";
	String password="manuelrajesh";
	
	void validate(String UserName,String passWord) throws Exception{
		if(!UserName.equals(username)||!passWord.equals(password)) {
			throw new Exception("invalid userName or password"); 
		}
		else {
			System.out.println("hey Manuel");
		}
		
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowUser tus=new ThrowUser();
		try {
		tus.validate("manuelrajesh3@gmail.com","manuelrajesh");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Thank you");
		}

	}

}
