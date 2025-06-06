package haneena;

public class product {
    String pname, pcode;
    int price;

   
    public product() {}

    public product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPname() {
        return pname;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPcode() {
        return pcode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void display() {
        System.out.println("pcode: " + this.pcode);
        System.out.println("pname: " + this.pname);
        System.out.println("price: " + this.price + "\n");
    }

    public static void main(String[] args) {
        
        product p1 = new product();
        p1.pcode = "Car123";
        p1.pname = "Benz";
        p1.price = 1000;
        System.out.println("Displaying p1:");
        p1.display();

        product p2 = new product("Jaguar", "Car426", 25000);
        System.out.println("Displaying p2: ");
        p2.display();

        product p3 = new product("Maruthi", "Car800", 50000);
        System.out.println("Displaying p3: ");
        p3.display();

        
        product p = p3.getPrice() < (p1.price < p2.price ? p1.price : p2.price) ? p3 : (p1.price < p2.price ? p1 : p2);

      
        System.out.println("\nDisplaying product with the lowest price: ");
        p.display();
    }
}