package StackUsingArray;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStack {

	public static void main(String[] args) throws IOException {
//		Stack s = new Stack(5);
//		s.push(1);
//		s.push(5);
//		s.push(8);
//		s.push(80);
//		s.push(2);
//		s.pop();
//		s.pop();
//		s.displayStack();
//		System.out.println("\n" + "The size of stack: " + s.getStackSize());
		
		DataOutputStream writer = new DataOutputStream(
				new FileOutputStream(new File("midtermFile.dat")));
		writer.write(1);           

			writer.writeUTF("jazz");         

			writer.writeChar('b');           

			writer.writeInt(8675309);           

			writer.write(8675309);           

			writer.write('b');	 
	}

}
