import java.io.*;

public class ReadObject {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("student.ser");
			ObjectInputStream ois =  new ObjectInputStream(fis);
			
			Student s= (Student) ois.readObject();
			
			System.out.println("ID:"+s.id);
			System.out.println("Name:"+s.name);
			
			fis.close();
			
			ois.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
