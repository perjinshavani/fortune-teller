package se.nackademin;

public class MagicNumbers {

    private String name;
    private int income;
    private String location;
    private int age;
    private int height;

    public int calculateA() {
        

              String ord[] = name.split("\\s+");
		int numberofnames= ord.length;
		int count = numberofnames + age;
                
                do{
                    count=count-7;
		}
		while(count >= 10);
			
		
        //TODO: calculate A
        return count;
    }

    public int calculateB() {
		int numberofcharacters = location.length();
		int count = numberofcharacters + income;
		
		while (count >= 10){
			count -= 7;
		}
		
        //TODO: calculate B
        return count;
    }

    public int calculateC() {
		int count = calculateA() + calculateB();
		count =count - height;
                do{
                    count=count+10;
                }
		
		while(count <= 0);
		
		
        //TODO: calculate C
        return count;
    }

    public int calculateD() {
		int count = calculateA();
		if (calculateA() > 5){
			count += calculateB();
		} 
	
		else{
			count += calculateC();
                }
		count-= income;
		while(count < 0) {
			count += 10;
		}
        //TODO: calculate D
        return count;
    }

    public int calculateE() {
		
		double count = age;
		count = count * income  * height;
		count= Math.sqrt(count);
		
		while(count> 10){
			count = count/2;
		}
        //TODO: calculate E
        return (int)Math.round(count);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    private int getAge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
