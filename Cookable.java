public interface Cookable {
    // Constant
    int STANDARD_TEMP = 450;

    // Abstract Method
    void prepareDough();
    boolean bake(int minutes);

    // Default Method
    default void slice(int slices){
        System.out.println("Cutting pizza into " + slices + " slices.");
    }
}
