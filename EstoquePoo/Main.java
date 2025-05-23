package EstoquePoo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.print("Digite o nome do produto: ");
        product.name = scanner.next();
        System.out.print("Digite o valor do produto: ");
        product.price = scanner.nextDouble();
        System.out.print("Digite o total de unidades do produto: ");
        product.quantity = scanner.nextInt();

        System.out.println("Produto: " + product.name);
        System.out.println("Valor do produto: " + product.price);
        System.out.println("Quantidade do produto: " + product.quantity);


    

        scanner.close();
    }
}