public class ArtisanPizza extends Pizza implements Cookable{
    // Public Methods
    @Override
    public void prepareDough(){
        System.out.println("Preparing fresh handmade dough for " + getName());
    }

    @Override
    public boolean bake(int minutes){
        if(minutes >= 10){
             System.out.println("Baking at: " + STANDARD_TEMP + "F for " + minutes + " minutes.");
             return true;
        }
        return false;
    }

    // Constructor
    public ArtisanPizza(String nameIn, char sizeIn, double priceIn){
        super(nameIn, sizeIn, priceIn);
    }

 
public static void validateSize(char size) throws InvalidPizzaSizeException{
    if(size != 'S' && size != 'M' && size != 'L'){
        throw new InvalidPizzaSizeException("Invalid pizza size!");
    }
}
}
