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
    
    //This method prints-out each method and the author of that particular method 
    //Each method is in a different line followed by the authors name
    public void authorInfo(){
        System.out.println("Accessor method for model: Fuaad");
        System.out.println("Accessor method for price: Fuaad");
        System.out.println("Accessor method for closeFocusDistance: Fuaad");
        System.out.println("Accessor method for the magnification(int): Cian");
        System.out.println("Accessor method for the diameter(int): Cian");
        System.out.println("Mutator method to set magnification: Cian");
        System.out.println("Mutator method to set the diameter: Cian");
        System.out.println("Accessor method for imageStabilization(boolean): Laith");
        System.out.println("Accessor method for owner: Cian");
        System.out.println("Mutator method 'changeOwner' to change the owner: Cian");
        System.out.println("Method printBinocularInfo, which prints Model, Price, Magnification, Diameter, imageStabilization and Owner: Fuaad");
        System.out.println("Method authorInfo that prints out the author for each implemented method: Laith");
    }
}

