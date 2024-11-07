package fruits;

public abstract class Apple {
	
	boolean isRipe=true;
	byte countryCode=13;
	
	int quantity=100; 
	
	float price = 20.69f;
	
    String variety="Washington";
    
    
   
    
    public abstract void eat();
    
    public void ripen() {
    	// implementated
    	System.out.println("Ok, ripened this apple");
    }
    
}
