package logan.callback.test;

public class EventNotifier {
	
	private TeaTypeAct ie;
    private boolean somethingHappened; 
    
    public EventNotifier (TeaTypeAct event) //EventNotifier ��construct�]�p����J InterestingEvent Object
    {
    // Save the event object for later use.
    ie = event; 
    // Nothing to report yet.
    somethingHappened = true;
    } 
    //...  
    
    
    public static void main(String[] args) {
    	
    	TeaTypeAct me = new LoganAct(); //CallMe ��@�XInterestingEvent�̭���method �ҥH�o��new�X�ӥ�
    	EventNotifier event = new EventNotifier(me);//�]�N�OCallMe�̭���@����k�]�|�a�i�hEventNotifier �i�H����
    	event.doWork(); //����ۤv�o��class�̭�doWork
    	    	
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



