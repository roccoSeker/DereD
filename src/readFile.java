import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class readFile {
   public static void main(String[] args) {
	try(Scanner scanner=new Scanner( new FileReader("input.txt"))){
		
		while(scanner.hasNextLine()) {
			String input= scanner.nextLine();
			String[]array=input.split(";");
			if(array[0].equals("addAgency")) {
				System.out.println(input);
			}
		}
				
			}catch(FileNotFoundException ex){
				System.out.println("File can not found.");
				
			} catch (IOException e) {
				
				System.out.println("An error occurred while opening the file.");
			}
			
	
	
}

}