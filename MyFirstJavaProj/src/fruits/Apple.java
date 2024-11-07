package fruits;

public abstract class Apple {
	
	boolean isRipe=true;
	byte countryCode=13;
	
	int quantity=100; 
	
	float price = 20.69f;
	
    String variety="Washington";
    
    abstract void eat();
    
    void ripen() {
    	// implementated
    	System.out.println("Ok, ripened this apple");
    }
    
}
