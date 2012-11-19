package logan.callback.test;

public class EventNotifier {
	
	private TeaTypeAct ie;
    private boolean somethingHappened; 
    
    public EventNotifier (TeaTypeAct event) //EventNotifier 的construct設計成輸入 InterestingEvent Object
    {
    // Save the event object for later use.
    ie = event; 
    // Nothing to report yet.
    somethingHappened = true;
    } 
    //...  
    
    
    public static void main(String[] args) {
    	
    	TeaTypeAct me = new LoganAct(); //CallMe 實作出InterestingEvent裡面的method 所以這邊new出來用
    	EventNotifier event = new EventNotifier(me);//也就是CallMe裡面實作的方法也會帶進去EventNotifier 可以飲用
    	event.doWork(); //執行自己這個class裡面doWork
    	    	
    	TeaTypeAct JC = new JcAct();
    	EventNotifier event2 = new EventNotifier(JC);
    	event2.doWork();
    }
    
    
    
    public void doWork ()
    {
    // Check the predicate, which is set elsewhere.
    if (somethingHappened)
        {
        // Signal the even by invoking the interface's method.
        ie.greenTeaCome();
        ie.blackTeaCome();
        ie.cofeeCome();
        }
    } 
}



