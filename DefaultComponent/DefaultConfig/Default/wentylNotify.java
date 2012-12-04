/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: wentylNotify
//!	Generated Date	: Tue, 4, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/wentylNotify.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;

//----------------------------------------------------------------------------
// Default/wentylNotify.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event wentylNotify(double) 
public class wentylNotify extends RiJEvent {
    
    public static final int wentylNotify_Default_id = 18617;		//## ignore 
    
    public double procentOtw;
    
    // Constructors
    
    public  wentylNotify(double p_procentOtw) {
        lId = wentylNotify_Default_id;
        procentOtw = p_procentOtw;
    }
    
    public boolean isTypeOf(long id) {
        return (wentylNotify_Default_id==id);
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/wentylNotify.java
*********************************************************************/

