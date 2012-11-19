package logan.callback.test;

public class LoganAct implements TeaTypeAct{
	
	private EventNotifier en; 
	
    public LoganAct ()
    {
    en = new EventNotifier (this);
    } 
    
    
    
    public void greenTeaCome(){
    	System.out.println("GreenTeaCome:logan like it!");
    } 
	public void blackTeaCome(){
		// Do something...
		System.out.println("blackTeaCome:logan love it!");
	}
	public void cofeeCome(){
		// Do something...
		System.out.println("cofeeTeaCome:logan drinks it!");
	}

}
