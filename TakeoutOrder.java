public class TakeoutOrder implements DeliverablePizza{
    @Override
    public void assignDriver(String driverName){
        System.out.println("Driver: " + driverName);
    }

    @Override 
    public String getStatus(){
        return "On the way!";
    }
    
    @Override
    public void prepareDough(){
        System.out.println("Dough prepared.");
    }

    @Override
    public boolean bake(int minutes){
        return true;
    }


}
