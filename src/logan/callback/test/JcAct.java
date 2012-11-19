package logan.callback.test;

public class JcAct implements TeaTypeAct{

	
	private EventNotifier en; 
	
    public JcAct ()
    {
    en = new EventNotifier (this);
    } 
    
    
    
    public void greenTeaCome(){
    	System.out.println("GreenTeaCome:JC like it!");
    } 
	public void blackTeaCome(){
		// Do something...
		System.out.println("blackTeaCome:JC love it!");
	}
	public void cofeeCome(){
		// Do something...
		System.out.println("cofeeTeaCome:JC hate it!");
	}
	
}
