
/** 
  * Function class to calculate the function 
  * @author Hoang Nguyen
  * @version 1.0
  */
public class Function {
    private int FUNCTION_CHOICE;
    private String description;
    
    /** 
     * A constructor to set description and choice according to user
     * @param the user's choice of function
     */
    public Function(int fnChoice) {
    	this.FUNCTION_CHOICE = fnChoice;
    	setDescription();
    }
    
    /** 
     * return FUNCTION_CHOICE
     * @return the value of FUNCTION_CHOICE
     */
    public int getFunctionChoice() {
    	return this.FUNCTION_CHOICE;
    }
    
    /** 
     * Set the value of description to thefunction corresponding
     * to the user's choice
     */
    public void setDescription() {
    	if (this.FUNCTION_CHOICE == 1) {
    		this.description = "(8x-sqrt(x))/(x^3-7x^2+15x-9)";
    	}
    	else if (this.FUNCTION_CHOICE == 2) {
    		this.description = "sin(x)";
    	}
    	else if (this.FUNCTION_CHOICE == 3) {
    		this.description = "sin(x)";
    	}
    	else if (this.FUNCTION_CHOICE == 4) {
    		this.description = "(sqrt(x^3+16)-4)/x^2";
    	}
    	else {
    		this.description = "(e^x-1)/x";
    	}
    }
    
    /** 
     * Returns the function based on user's choice from 1 - 5
     * @param user's choice of function
     * @return the function according to choice
     */
    public static String getDescription(int fnChoice) {
    	if(fnChoice ==1) {
            return "(8x-sqrt(x))/(x^3-7x^2+15x-9)";
        }
        else if (fnChoice ==2) {
            return "sin(x)";
        }
        else if (fnChoice ==3) {

            return "(5/x)+35";
        }
        else if (fnChoice ==4) {
            return "(sqrt(x^3+16)-4)/(x^2)";
        }
        else if (fnChoice == 5) {

            return "(e^x-1)/x";
        }
        else {
            return "";
        }
    }
    
    /** 
     * Return the the description and the user's choice of number
     * @return the result of of description and function choice
     */
    public String toString() {
    	return this.description + "for" + this.FUNCTION_CHOICE ;
    }
    
    /** 
     * return the answer of the number user put in  
     * @param the user choice to to put in to calculate the function
     * @return the calculated answer of the limit of the function of user
     */
    public double computeFunctionValue(double x) {
    	if(FUNCTION_CHOICE==1.0) {
           return (8*x-Math.sqrt(x))/(Math.pow(x,3)-7*Math.pow(x,2)+15*x-9);
    	}
        else if (FUNCTION_CHOICE ==2.0) {
            return Math.sin(x);
        }
        else if (FUNCTION_CHOICE ==3.0) {
            return (5/x)+35;
        }
        else if (FUNCTION_CHOICE ==4.0) {
            return (Math.sqrt(Math.pow(x,3)+16)-4)/Math.pow(x,2);
        }
        else if (FUNCTION_CHOICE == 5.0) {
            return (Math.pow(Math.E,x)-1)/x;
        }
        else {
            return 0.0;
        }
    }
}
