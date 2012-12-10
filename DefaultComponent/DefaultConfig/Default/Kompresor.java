/*********************************************************************
	Rhapsody	: 7.6.1
	Login		: Kuba
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Kompresor
//!	Generated Date	: Mon, 10, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Kompresor.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Kompresor.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Kompresor 
public class Kompresor implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassKompresor = new AnimClass("Default.Kompresor",false);
    //#]
    
    protected static final double MAX_MOC = 100;		//## attribute MAX_MOC 
    
    protected double moc = 0;		//## attribute moc 
    
    
    // Constructors
    
    //## operation Kompresor() 
    public  Kompresor() {
        System.out.println("  -> Kompresor");;
        try {
            animInstance().notifyConstructorEntered(animClassKompresor.getUserClass(),
               new ArgData[] {
               });
        
        //#[ operation Kompresor() 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public static final double getMAX_MOC() {
        return MAX_MOC;
    }
    
    //## auto_generated 
    private double getMoc() {
        return moc;
    }
    
    //## auto_generated 
    private void setMoc(double p_moc) {
        moc = p_moc;
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassKompresor; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
        msg.add("moc", moc);
        msg.add("MAX_MOC", MAX_MOC);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Kompresor.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Kompresor.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Kompresor.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Kompresor.java
*********************************************************************/

