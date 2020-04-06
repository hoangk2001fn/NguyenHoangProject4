
/** 
 * A plot class to create plot for a property
 * @author Hoang Nguyen
 * @version 1.0
*/
public class Plot{
	private int x;
	private int y;
	private int width;
	private int depth;
	
	/** 
     * No-args constructor to set default Plot 
     */
	public Plot() {
		x = 0;
		y = 0;
		width = 1;
		depth = 1;
	}
	
	/** 
     * A constructor with a plot parameter to copy
     * @param p Plot to be copied
     */
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	/** 
     * A constructor with parameter of a plot's x, y, width, depth to copy
     * @param x x cordinate
     * @param y y cordinate
     * @param width width of the plot
     * @param depth depth of the depth
     */
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	/** 
     * To test if 2 plots overlaps
     * @param plot plot user wants
     * @return the result of true or false to determine overlaps
     */
	public boolean overlaps(Plot plot) {
		if(((x>=plot.x && x <= (plot.x+plot.width)) && (y >=plot.y && y <= (plot.y+plot.depth))) ||
                (((x + width)>=plot.x && (x+width) <= (plot.x+plot.width)) && (y >=plot.y && y <= (plot.y+plot.depth))) ||
                ((x>=plot.x && x <= (plot.x+plot.width)) && ((y +depth) >=plot.y && (y+depth) <= (plot.y+plot.depth))) ||
                (((x+width)>=plot.x && (x+width) <= (plot.x+plot.width)) && ((y+depth) >=plot.y && (y+depth) <= (plot.y+plot.depth)))) {
         return true;
		}
        else if(((plot.x>=x && plot.x <= (x+width)) && (plot.y >=y && plot.y <= (y+depth))) ||
                (((plot.x + plot.width)>=x && (plot.x+plot.width) <= (x+width)) && (plot.y >= y && plot.y <= (y+depth))) ||
                ((plot.x>=x && plot.x <= (x+width)) && ((plot.y +plot.depth) >= y && (plot.y+plot.depth) <= (y+depth))) ||
                (((plot.x+plot.width)>=x && (plot.x+plot.width) <= (x+width)) && ((plot.y+plot.depth) >= y && (plot.y+plot.depth) <= (y+depth)))) {
         return true;
        }
        return false;
	}
	
	/** 
     * To test if 2 plots encompasses
     * @param plot plot user wants
     * @return the result of true or false to determine encompasses
     */
	public boolean encompasses(Plot plot) {
		boolean isEncompass = false;
		 if(((plot.x>= x && plot.x <= (x+width)) && (plot.y >= y && plot.y <= (y+depth))) && (((plot.x + plot.width)>= x && (plot.x+plot.width) <= (x+width)) && (plot.y >= y && plot.y <= ( y+depth)))) {
			isEncompass = true;
	     }
		 return isEncompass;
		}	
	
	/** 
     * set the value of x to the correspoding x user wanted 
     * @param x x cordinate
     */
	public void setX(int x) {
		this.x = x;
	}
	
	/** 
     * return the x value
     * @return the value of x 
     */
	public int getX() {
		return this.x;
	}
	
	/** 
     * set the value of y to the correspoding y user wanted 
     * @param y y cordinate
     */
	public void setY(int y) {
		this.y = y;
	}
	
	/** 
     * return the y value
     * @return the value of y 
     */
	public int getY() {
		return this.y;
	}
	
	/** 
     * set the value of width to the correspoding width user wanted 
     * @param width the width of the plot
     */
	public void setWidth(int width) {
		this.width = width;
	}
	
	/** 
     * return the width value
     * @return the value of width 
     */
	public int getWidth() {
		return this.width;
	}
	
	/** 
     * set the value of depth to the correspoding depth user wanted 
     * @param depth the depth of the plot
     */
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	/** 
     * return the depth value
     * @return the value of depth  
     */
	public int getDepth() {
		return this.depth;
	}
	
	/** 
     * Display the information of the plot
     * @return the information of plot 
     */
	public String toString() {
		return "Upper left: ( " + this.x + ", " + this.y + "); Width: " + this.width + " Depth: " + this.depth;
	}
	
}
