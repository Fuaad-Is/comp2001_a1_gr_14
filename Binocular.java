/**
 * A class that maintains information about a binocular.
 * This might form part of a larger application such
 * as a optical shop, for instance.
 *
 * @author (Insert name of group member 1)
 * @author (Insert name of group member 2)
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
}
