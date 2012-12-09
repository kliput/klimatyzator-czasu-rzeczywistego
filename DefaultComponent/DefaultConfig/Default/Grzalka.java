/*********************************************************************
	Rhapsody	: 8.0
	Login		: Piotrek
	Component	: DefaultComponent
	Configuration 	: DefaultConfig
	Model Element	: Grzalka
//!	Generated Date	: Sun, 9, Dec 2012 
	File Path	: DefaultComponent/DefaultConfig/Default/Grzalka.java
*********************************************************************/

package Default;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// Default/Grzalka.java                                                                  
//----------------------------------------------------------------------------

//## package Default 


//## class Grzalka 
public class Grzalka implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassGrzalka = new AnimClass("Default.Grzalka",false);
    //#]
    
    protected static final double MAX_MOC = 100;		//## attribute MAX_MOC 
    
    protected double moc = 0;		//## attribute moc 
    
    
    // Constructors
    
    //## operation Grzalka() 
    public  Grzalka() {
        System.out.println("  -> Grzalka");;
        try {
            animInstance().notifyConstructorEntered(animClassGrzalka.getUserClass(),
               new ArgData[] {
               });
        
        //#[ operation Grzalka() 
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
    public double getMoc() {
        return moc;
    }
    
    //## auto_generated 
    public void setMoc(double p_moc) {
        moc = p_moc;
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassGrzalka; 
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
            super(Grzalka.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Grzalka.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Grzalka.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: DefaultComponent/DefaultConfig/Default/Grzalka.java
*********************************************************************/

