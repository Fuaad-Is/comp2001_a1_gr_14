/**
 * A class that maintains information about a binocular.
 * This might form part of a larger application such
 * as a optical shop, for instance.
 *
 * @author (Insert name of group member 1)
 * @author (Fuaad Islam )
 * @author (Insert name of group member 3)
 * 
 * @version (Insert today's date here.)
 */
public class Binocular
{
    // The fields.
    private String model;
    private int price;
    private int closeFocusDistance;
    private int diameter;
    private int magnification;


    /**
     * Set the model, price and focus fields when this object
     * is constructed.
     */
    public Binocular(String binocularModel, int binocularPrice,int binocularFocus)
    {
        model = binocularModel;
        price = binocularPrice;
        closeFocusDistance = binocularFocus;
    }

    // Add the methods here ...
    
    public String getModel()
    {
        return model;
    }
    
    public int getBinocularPrice()
    {
        return price;
    }
    
    public int getFocusDistance()
    {
        return closeFocusDistance;
    }
    void set_diameter(int my_diam){
        diameter = my_diam;
    }
    void set_magnification(int my_mag){
        magnification = my_mag;
        
        
    }
    int get_diameter(){
        return diameter;
        
    }
    int get_magnification(){
        return magnification;
    }
}
