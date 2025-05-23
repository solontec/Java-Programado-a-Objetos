package EstoquePoo;
public class Product {


    public String name;
    public double price;
    public int quantity;
    public double totalValorEstoque;

    public double valorTotal() {
        double total = price * quantity;
        return total;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }
    
    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

}
