public class Pizza{
        // Attributes
        private String name;
        private char size;
        private double price;

        // Default Constructor
        public Pizza(){
            this.name = "Pepperoni";
            this.size = 'M';
            this.price = 7.99;
        }

        // Constructor
        public Pizza(String nameIn, char sizeIn, double priceIn){
            this.name = nameIn;
            this.size = sizeIn;
            this.price = priceIn;
        }

        // Getters and Setters
        public String getName(){
            return name;
        }

        public char getSize(){
            return size;
        }

        public double getPrice(){
            return price;
        }

        public void setName(String name){
            this.name = name;
        }

        public void setSize(char size){
            this.size = size;
        }

        public void setPrice(double price){
            this.price = price;
        }

        // Other Methods
        @Override
        public String toString(){
            return "----- Pizza Order----- \n" + 
            "Pizza: " + this.name + "\n" +
            "Size: " + this.size + "\n" + 
            "Price: " + this.price + "\n";
        }

        public void showOrder(){
            System.out.println(toString());
        }

}