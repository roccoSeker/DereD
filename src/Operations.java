import java.util.ArrayList;

public class Operations {

private Agency[]agencies=new Agency[20];
private Agent[]agents=new Agent[50];
private Customer[]customers=new Customer[60];
private Contract[]contracts=new Contract[60];
private RealEstate[]realestates=new RealEstate[60];
private static int count;

public Operations() {
	
}
public Operations(int capasity) {
	agencies=new Agency[capasity];
	agents=new Agent[capasity];
	customers=new Customer[capasity];
	contracts=new Contract[capasity];
	realestates=new RealEstate[capasity];
	
	count=0;
	
}
 public Operations(Agency[] agencies) {
	super();
	this.agencies = agencies;
}
 public Operations(Agent[]agents) {
	 this.agents=agents;
 }

 public void addAgency(Agency agency) {
	 for(int i=0;i<agencies.length;i++) {
		 if(agencies[1].equals(agency)) {
			 System.out.println("This agency is already exist");
		 }
		 else {
			 agencies[count]=agency;
			 count++;
		 }
	 }
	 
 }
 public void deleteAgency(Agency agency) {
	 Agency[]agencies2=null;
	 for(int i=0;i<agencies.length;i++) {
	 if(!agencies[1].equals(agency)) {
		 System.out.println("This agency is already non-exist");
	 }
	 else {
		 agencies2=new Agency[agencies2.length-1];
		 for(int index=0;index<1;index++) {
			 agencies2[index]=agencies[index];
		 }
		 for(int j=i;j<agencies.length-1;j++) {
			 agencies2[j]=agencies[j+1];
		 }
		 break;
	 }
 }
 }
public void addAgent(Agent agent) {
	for(int i=0;i<agents.length;i++) {
		if(agents[1].equals(agent)) {
			System.out.println("This agent is already exist");
		}
		else {
			agents[count]=agent;
			count++;
		}
		
	}
}
public void deleteAgent(Agent agent) {
	Agent[]agents2=null;
	for(int i=0;i<agents.length;i++) {
	if(!agents[2].equals(agent)) {
		System.out.println("This agent is already non-exist");
	}
	else {
		agents2=new Agent[agents2.length-1];
		for(int index=0;index<1;index++) {
			agents2[index]=agents[index];
		}
		for(int j=i;j<agents.length;j++) {
			agents2[j]=agents[j+1];
		}
		break;
	}
}
}
public void addCustomer(Customer customer) {
	for(int i=0;i<customers.length;i++) {
		if(customers[1].equals(customer)) {
			System.out.println("This customer is already exist.");
			
		}
		else {
			customers[count]=customer;
			count++;
		}
	}
}
public void deleteCustomer(Customer customer) {
	Customer[]customers2=null;
	for(int i=0;i<customers.length;i++) {
		if(!customers[2].equals(customers)) {
			System.out.println("This agent is already non-exist");
		}
		else {
			customers2=new Customer[customers2.length-1];
			for(int index=0;index<1;index++) {
				customers2[index]=customers[index];
			}
			for(int j=i;j<agents.length;j++) {
				customers2[j]=customers[j+1];
			}
			break;
		}
	}

	}
public void addContract(Contract contract) {
	for(int i=0;i<contracts.length;i++) {
		if(customers[1].equals(contract)) {
			System.out.println("This customer is already exist.");
			
		}
		else {
			contracts[count]=contract;
			count++;
		}
	
}
	
}
public void deleteContract(Contract contract) {
	Contract []conracts2=null;
	for(int i=0;i<contracts.length;i++) {
		if(!contracts[1].equals(contract)) {
			System.out.println("This contract is already non-exist");
		}
		else {
			conracts2=new Contract[conracts2.length-1];
			for(int index=0;index<1;index++) {
				conracts2[index]=contracts[index];
			}
			for(int j=i;j<contracts.length;j++) {
				conracts2[j]=contracts[j+1];
			}
			break;
	}
	
}
}
public void addRealEstate(RealEstate realestate) {
	for(int i=0;i<realestates.length;i++) {
		if(customers[1].equals(realestate)) {
			System.out.println("This customer is already exist.");
			
		}
		else {
			realestates[count]=realestate;
			count++;
		}
	
}
}
public void deleteRealEstate(RealEstate realestate) {
	RealEstate[]realestate2=null;
	for(int i=0;i<realestates.length;i++) {
		if(!realestates[1].equals(realestate)) {
			System.out.println("This contract is already non-exist");
		}
		else {
			realestate2=new RealEstate[realestate2.length-1];
			for(int index=0;index<1;index++) {
				realestate2[index]=realestates[index];
			}
			for(int j=i;j<realestates.length;j++) {
				realestate2[j]=realestates[j+1];
			}
			break;
		}
	}
}
}		
	

