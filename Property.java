
/** 
 * A property class to create property
 * @author Hoang Nguyen
 * @version 1.0
*/
public class Property{
    private String city;
    private String owner;
    private String propertyName;
    private double rentAmount;
    private Plot plot;
    
    /** 
     * No-args constructor to set default Property
     */
    public Property() {
    	this.city = "";
    	this.owner = "";
    	this.propertyName = "";
    	this.rentAmount = 0;
    	this.plot = new Plot();
    }
    
    /** 
     * Constructor to copy property in parameter 
     * @param Property p
     */
    public Property(Property p) {
    	this.city = p.getCity();
    	this.owner = p.getOwner();
    	this.propertyName = p.getPropertyName();
    	this.rentAmount = p.getRentAmount();
    	this.plot = p.getPlot();
    }
    
    /** 
     * Constructor to pass the values in parameter
     * to correspoding values in the class
     * create default Plot
     * @param property name
     * @param city
     * @param rent amount 
     * @param owner's name
     */
    public Property(String propertyName, String city, double rentAmount, String owner) {
    	this.city = city;
    	this.owner = owner;
    	this.propertyName = propertyName;
    	this.rentAmount = rentAmount;
    	this.plot = new Plot();
    }
    
    /** 
     * Constructor to pass the values in parameter
     * to correspoding values in the class
     * create Plot with the values in parameter
     * @param propertyName property name
     * @param city city
     * @param rentAmount rent amount 
     * @param owner owner's name
     * @param x x
     * @param y y
     * @param depth depth
     * @param width width
     */
    public Property(String propertyName, String city, double rentAmount,String owner, int x, int y, int depth, int width) {
    	this.city = city;
    	this.owner = owner;
    	this.propertyName = propertyName;
    	this.rentAmount = rentAmount;
    	this.plot = new Plot(x, y, depth, width);
    }
    
    /** 
     * return the name of property
     * @return the property's name  
     */
    public String getPropertyName() {
    	return this.propertyName;
    }
    
    /** 
     * set the property's name
     * @param propertyName the property's name
     */
    public void setPropertyName(String propertyName) {
    	this.propertyName = propertyName;
    }
    
    /** 
     * return the city's name
     * @return the city 
     */
    public String getCity() {
    	return this.city;
    }
    
    /** 
     * set the city's name
     * @param city the city
     */
    public void setCity(String city) {
    	this.city = city;
    }
    
    /** 
     * set the value of plot 
     * @param x x
     * @param y y
     * @param width the width of the plot
     * @param depth the depth of the plot
     */
    public Plot setPlot(int x, int y, int width, int depth) {
    	this.plot.setX(x);
    	this.plot.setY(y);
    	this.plot.setWidth(width);
    	this.plot.setDepth(depth);
    	return this.plot;
    }
    
    /** 
     * return the Plot
     * @return the Plot
     */
    public Plot getPlot() {
    	return this.plot;
    }
    
    /** 
     * return the depth value
     * @return the value of the rent amount   
     */
    public double getRentAmount() {
    	return this.rentAmount;
    }
    
    /** 
     * set the value of rent amount 
     * @param rentAmount the rent amount 
     */
    public void setRentAmount(double rentAmount) {
    	this.rentAmount = rentAmount;
    }
    
    /** 
     * set the owner's name 
     * @param ownner the owner's name 
     */
    public void setOwner(String owner) {
    	this.owner = owner;
    }
    
    /** 
     * return the owner's name
     * @return owner  
     */
    public String getOwner() {
    	return this.owner;
    }
    
    /** 
     * Display the information of the property
     * @return the information of property 
     */
    public String toString() {
    	String x =  "Property Name: " + this.propertyName + "\n" +
               "Located in " + this.city + "\n" + 
    		   "Belonging to: " + this.owner + "\n" + 
    		   "Rent Amount: " + this.rentAmount + " ";
    	return x;
    }
}
