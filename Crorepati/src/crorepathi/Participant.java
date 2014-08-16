package crorepathi;

public class Participant {
	// The quiz begins with the registration of the participant
		// Participant name, age in years, phone number and friend's phone number are the parameters
		// an instance of the participant should be created and returned
	/*Participant class with name, age, phone, currentLevel and prizeMoney as private instance variables.
Provide the following methods in the Participant class.
	public String getName() - returns the name of the participant
	public int getAge() - returns the age of the participant
	public String getPhone() - returns the phone of the participant*/
	
	@SuppressWarnings("unused")
	private String name="",phone_num="",friend_num="";
	private int age;
	
	public String getName()
	{
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getPhone(){
		return phone_num;
	}
public int Prize(int level){
	switch (level){
	case 1:
		return 1000;
	case 2:
		return 2000;
	case 3:
		return 3000;
	case 4:
		return 5000;
	case 5:
		return 10000;
	case 6:
		return 20000;
	case 7:
		return 40000;
	case 8:
		return 80000;
	case 9:
		return 160000;
	case 10:
		return 320000;
	case 11:
		return 640000;
	case 12:
		return 1250000;
	case 13:
		return 2500000;
	case 14:
		return 5000000;
	case 15:
		return 10000000;	
	}
	return 0;	
}
}
