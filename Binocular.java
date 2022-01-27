/**
 * A class that maintains information about a binocular.
 * This might form part of a larger application such
 * as a optical shop, for instance.
 *
 * @author (Laith AL-Halabi)
 * @author (Fuaad Islam )
 * @author (Cian Waterhouse)
 * 
 * @version (01/27/2022)
 */
public class Binocular
{
    // The fields.
    private String model;
    private int price;
    private int closeFocusDistance;
    private int diameter;
    private int magnification;
    private boolean imageStabilization; 
    private String Owner;


    /**
     * Set the model, price and focus fields when this object
     * is constructed.
     */
    public Binocular(String binocularModel, int binocularPrice,int binocularFocus,boolean imgStabilization)
    {
        model = binocularModel;
        price = binocularPrice;
        closeFocusDistance = binocularFocus;
        imageStabilization = imgStabilization;
    }

    // Add the methods here ...
    
    /**
     * Accessor method for model
     */
    public String getModel()
    {
        return model;
    }
    
    /**
     * Accessor method for price
     */
    public int getBinocularPrice()
    {
        return price;
    }
    
    /**
     * Accessor method for closeFocusDistance
     */
    public int getFocusDistance()
    {
        return closeFocusDistance;
    }
    

    /**
     * Mutator method for Diameter
     */
    public void set_diameter(int my_diam){
        diameter = my_diam;
    }
    /**
     * Mutator method for Magnification
     */
    public void set_magnification(int my_mag){
        magnification = my_mag;
        
        
    }
    /**
     * Accessor method for Diameter
     */
    int get_diameter(){
        return diameter;
        
    }
    /**
     * Accessor method for magnification
     */
    int get_magnification(){
        return magnification;
        
    }

    public boolean getimageStabilization()
    {
        return imageStabilization;
    }
    
    
    void change_owner(String input_Owner){
        Owner = input_Owner;
        
        
    }
    String get_owner(){
        return Owner;

    
    }
    
    /**
     * Method to print binocular information. 
     */
    public void printBinocularInfo(){
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Magnification: " + magnification);
        System.out.println("Diameter: " + diameter);
        System.out.println("Stablization: " + imageStabilization);
        System.out.println("Owner: " + Owner);
    }
    
    public void authorInfo(){
        System.out.println();
        System.out.println();
        System.out.println();
    }
}

