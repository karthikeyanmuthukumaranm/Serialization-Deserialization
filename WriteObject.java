import java.io.*;

public class WriteObject {
	public static void main(String[] args) {
		try {
			Student s = new Student(1,"steve");
			
			FileOutputStream fos = new FileOutputStream("student.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			fos.close();
			oos.close();
			System.out.println("Object Saved");		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
}
