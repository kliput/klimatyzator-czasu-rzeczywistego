/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: temperatureNotify
//!	Generated Date	: Thu, 29, Nov 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/temperatureNotify.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;

//----------------------------------------------------------------------------
// Default/temperatureNotify.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## event temperatureNotify(int) 
public class temperatureNotify extends RiJEvent {
    
    public static final int temperatureNotify_Default_id = 18616;		//## ignore 
    
    public int temperatura;
    
    // Constructors
    
    public  temperatureNotify(int p_temperatura) {
        lId = temperatureNotify_Default_id;
        temperatura = p_temperatura;
    }
    
    public boolean isTypeOf(long id) {
        return (temperatureNotify_Default_id==id);
    }
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/temperatureNotify.java
*********************************************************************/

