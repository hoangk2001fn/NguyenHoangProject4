import java.util.Arrays;

/** 
 * A ManagementCompany class to manage properties
 * @author Hoang Nguyen
 * @version 1.0
*/
public class ManagementCompany {
     
        private final int MAX_PROPERTY = 5;
        private double mgmFeePer;
        private String name;
        private Property[] properties;
        private String taxID;
        private int MAX_WIDTH = 10;
        private int count = 0;
        private int MAX_DEPTH = 10;
        private Plot plot ;
        
        /**
         * A No-Arg Constructor that creates a Management Company object.
         */
        public ManagementCompany() {
                properties = new Property[MAX_PROPERTY];
                this.name= "";
                this.taxID = "";
                this.plot = new Plot (0,0,MAX_WIDTH,MAX_DEPTH );
                
        }
        
        /**
         * A management company parameterized  constructor with a default company plot.
         * @param name name of the company
         * @param taxID taxID of the property
         * @param mgmFeePer management fee
         */
        public ManagementCompany(String name, String taxID, double mgmFeePer) {
                properties = new Property[MAX_PROPERTY];
                this.name = name;
                this.taxID = taxID;
                this.mgmFeePer = mgmFeePer;
                this.plot = new Plot (0,0,MAX_WIDTH,MAX_DEPTH );
        }
        
        /**
         * Copy constructor creates a ManagementCompany object using another ManagementComapany object..
         * @param otherCompany otherCompany is an object that is a copy 
         */
        public ManagementCompany(ManagementCompany otherCompany) {
                properties = new Property[MAX_PROPERTY];
                name = otherCompany.name;
                taxID = otherCompany.taxID;
                mgmFeePer = otherCompany.mgmFeePer;
                plot = otherCompany.plot;
        }
        
        /**
         * A management company parameterized constructor that sets the plot for the company. 
         * @param name management company's name
         * @param taxID management company's tax ID
         * @param mgmFeePer
         * @param x x cordinate
         * @param y y cordinate
         * @param width width of the plot
         * @param depth depth of the plot
         */
        public ManagementCompany(String name, String taxID, double mgmFeePer,int x, int y, int width, int depth) {
                properties = new Property[MAX_PROPERTY];
                this.name = name;
                this.taxID = taxID;
                this.mgmFeePer = mgmFeePer;
                this.plot = new Plot( x, y, width, depth);
        }
        
        
        /**
         * A get method that returns the size of properties array. 
         * @return MAX_PROPERTY size of the array. 
         */
        public int getMAX_PROPERTY() {
                return MAX_PROPERTY;
        }
        
        /** 
         * Adds a an already created property to the array. 
         * @param property property needs to be copy
         * @return the result of different outcomes
         */
        public int addProperty(Property property) {
            if (property == null) {
                return -2;
            }
            if (count >= MAX_PROPERTY) {
                return -1;
            }
            if (!this.plot.encompasses(property.getPlot())) {
                return -3;
            }

            if (count > 0) {
                Property p;
                for (int i = 0; i < count; i++) {
                    p = properties[i];

                    if (property.getPlot().overlaps(p.getPlot())) {
                        return -4;
                    }
                }
            }


            if (count < MAX_PROPERTY) {
                properties[count] = property;
                count++;
            }
            return count - 1;
        }

        /** 
         * Adds a an already created property to the array. 
         * @param name property's name
         * @param city city's name
         * @param rent rent amount
         * @param owner owner's name
         * @return the result of different outcomes
         */
        public int addProperty(String name, String city, double rent, String owner) {
            Property property = new Property(name, city, rent, owner);
            if (count >= MAX_PROPERTY) {
                return -1;
            }
            if (!this.plot.encompasses(property.getPlot())) {
                return -3;
            }

            if (count > 0) {
                for (int x = 0; x < count; x++) {
                    if (property.getPlot().overlaps(properties[x].getPlot())) {
                        return -4;
                    }
                }
            }
            if (count < MAX_PROPERTY) {
                properties[count] = property;
                count++;
            }
            return count - 1;
        }
        
        /** 
         * Adds a an already created property to the array. 
         * @param name property's name
         * @param city city's name
         * @param rent rent amount
         * @param owner owner's name
         * @param x x cordinate
         * @param y y cordinate
         * @param width width of the plot
         * @param depth depth of the plot
         * @return the result of different outcomes
         */
        public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) {
            Property property =  new Property(name, city, rent, owner, x, y , width, depth);
            if (count >= MAX_PROPERTY) {
                return -1;
            }
            if (!this.plot.encompasses(property.getPlot())) {
                return -3;
            }
            if (count > 0) {
                for (int xz = 0; xz < count; xz++) {
                    if (property.getPlot().overlaps(properties[xz].getPlot())) {
                        return -4;
                    }
                }
            }
            if (count < MAX_PROPERTY) {
                properties[count] = property;
                count++;
            }
            return count - 1;
        }

        /**
         * A method that adds up all the amounts of rent.
         * @return the total of the rent amount
         */
        public double totalRent() {
                double totalRent = 0.0;
                for(int x = 0; x < count; x++) {
                        if(properties[x] != null) {
                                totalRent += properties[x].getRentAmount();
                        }
                }
                return totalRent;
        }
        
        /** 
         * Returns value of the property that has the most rent amount
         * @return the value of the property that has the most rent amount
         */
        public double maxRentProp() {
                double max = 0.0;
                max = properties[maxRentPropertyIndex()].getRentAmount();
                return max;
        }
        
        /** 
         * return the Plot
         * @return the Plot 
         */
        public Plot getPlot() {
        	return this.plot;
        }
        
        /** 
         * return the name of the management company
         * @return the management company's name  
         */
        public String getName() {
        	return this.name;
        }
        
        /** 
         * return the index of the property has the most rent amount
         * @return the index where the property has the most rent amount
         */
        private int maxRentPropertyIndex() {
                int indexOFMaxRent=0;
                for (int x =0; x < count; x++) {
                        if(properties[x] != null) {
                                if(properties[indexOFMaxRent].getRentAmount() < properties[x].getRentAmount()) {
                                        indexOFMaxRent = x;
                                }
                        }
                }
                return indexOFMaxRent;
        }
        
        /** 
         * Displays the information of property at index of choice
         * @param i where the index the user wants
         * @return the information of property at index of choice
         */
        private String displayPropertyAtIndex(int i) {
                String result = "";
                if(properties[i] != null) {
                	System.out.println(properties[i].toString());
                }
                return result;

        }
        
        /** 
         * Displays the information of all properties
         * @return the information of all properties in the array
         */
        public String toString() {
        	String result = "";
            System.out.println("List of the properties for " + name + ",  taxID: " + taxID );
            System.out.println("__________________________________________________");
            for (int x  = 0; x < count; x++) { 
                    displayPropertyAtIndex(x);
            }
            System.out.println("__________________________________________________");
            System.out.println("Total management Fee: " + mgmFeePer);
            return result;
        }
                
                
}
