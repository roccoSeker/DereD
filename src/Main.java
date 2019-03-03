import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class Main {
	
	private static int Agencyid=1;
	private static Agency[]agencies=new Agency[10];
	private static Agency agency =new Agency();
	private static int Agentid=1;
	private static Agent[]agents=new Agent[60];
	private static int Customerid=1;
	private static Customer[]customers=new Customer[60];
	private static int Contractid=1;
	private static Contract[]contracts=new Contract[60];
	private static int Realestateid=1;
	private static RealEstate[]realestates=new RealEstate[60];
	public static Scanner scanner=new Scanner(System.in);
	Operations operation=new Operations();
	public static void main(String[] args) {
		
		
		
		
		
		try(Scanner scanner=new Scanner( new FileReader("input.txt"))){
						while(scanner.hasNextLine()) {
				
				String input= scanner.nextLine();
			    String[]array=input.split(";");
				if(array[0].equals("addAgency")) {
					
					Address address=new Address(array[2],array[3],array[4]);
					Agency agency1=new Agency(Agencyid,array[1],address,array[5]);
					agencies[Agencyid-1]=agency1;
					Agencyid++;
				}
				if(array[0].equals("addAgent")) {
					Birthdate birthdate=new Birthdate(array[2]);
					Address address=new Address(array[2],array[3],array[4]);
					Agent agent1=new Agent(Agentid,array[2],birthdate,address,array[6],array[7]);
					agents[Agentid-1]=agent1;
					Agentid++;
				}
				if(array[0].equals("addCustomer")) {
					Birthdate birthdate1=new Birthdate(array[2]);
					Address address2=new Address(array[3],array[4],array[5]);
					Customer customer=new Customer(Customerid,array[1],birthdate1,address2,array[6],array[7]);
					customers[Customerid-1]=customer;
					Customerid++;
					
				}
				if(array[0].equals("addContract")) {
					Contract contract=new Contract(Contractid,array[4]);
					contracts[Contractid-1]=contract;
					Contractid++;
				}
				if(array[0].equals("addRealEstate")) {
					Address address3=new Address(array[3],array[4],array[5]);
					RealEstate realestate=new RealEstate(Realestateid,array[1],array[2],address3,array[6],array[7],array[8]);
					realestates[Realestateid-1]=realestate;
					Realestateid++;
				}
				
			}
				
		
					
				}catch(FileNotFoundException ex){
					System.out.println("File can not found.");
					
				} catch (IOException e) {
					
					System.out.println("An error occurred while opening the file.");
				}
				
		boolean exist=false;
		while(!exist) {
			System.out.println("Enter your choice");
			int choice=scanner.nextInt();
			switch(choice) {
			
			case 1:
			addAgencyMethod();
				break;
			case 2:
				break;
			case 3:
				break;
			
			}
			
		}

	}
	
	
     private static void addAgencyMethod() {
    	 System.out.println("Enter the name of the agent to be added.");
    	 String agencyName=scanner.nextLine();
    	 System.out.println("Enter the address of the agent to be added.");
    	 System.out.println("Enter street name");
    	 String street=scanner.nextLine();
    	 System.out.println("Enter neigborhood ");
    	 String neighborhood=scanner.nextLine();
    	 System.out.println("Enter city");
    	 String city=scanner.nextLine();
    	 System.out.println("Enter the phone of the agent to be added");
    	 String phone=scanner.nextLine();
    	 
    	operation.addAgency(Agency.createAgency(agencyName,street,neighborhood,city,phone));
    	 
    	 
     }
     
     
     
     
     
     
     
     
     
     
     
     
}
