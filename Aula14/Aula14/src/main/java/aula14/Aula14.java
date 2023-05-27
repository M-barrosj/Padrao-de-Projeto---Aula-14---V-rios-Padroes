/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aula14;

/**
 *
 * @author JCMB
 */
public class Aula14 {

    public static void main(String[] args) {
        // Criação de produtos
        IProduct product1 = new Product(1, "Product 1", 10.0);
        IProduct product2 = new Product(2, "Product 2", 20.0);

        // Criando o DAO proxy
        IProductDAOProxy productDAOProxy = new ProductDAOProxy();

        // Salvando produtos no banco de dados
        productDAOProxy.saveProduct(product1);
        productDAOProxy.saveProduct(product2);

        // Recuperando um produto pelo ID
        IProduct retrievedProduct = productDAOProxy.getProductById(1);
        System.out.println("Retrieved Product: " + retrievedProduct.getName());
        
        // Criando um decorador para um produto
        IProduct decoratedProduct = new ProductDecorator(retrievedProduct);
        System.out.println("Decorated Product Name: " + decoratedProduct.getName());
        System.out.println("Decorated Product Price: " + decoratedProduct.getPrice());

        // Criando um logger para um produto
        IProduct loggedProduct = new ProductLogger(retrievedProduct);
        System.out.println("Logged Product Name: " + loggedProduct.getName());
        System.out.println("Logged Product Price: " + loggedProduct.getPrice());
        
        IProduct retrievedProduct2 = productDAOProxy.getProductById(2);
        System.out.println("Retrieved Product: " + retrievedProduct2.getName());
        
        // Criando um decorador para um produto
        IProduct decoratedProduct2 = new ProductDecorator(retrievedProduct2);
        System.out.println("Decorated Product Name: " + decoratedProduct2.getName());
        System.out.println("Decorated Product Price: " + decoratedProduct2.getPrice());

        // Criando um logger para um produto
        IProduct loggedProduct2 = new ProductLogger(retrievedProduct2);
        System.out.println("Logged Product Name: " + loggedProduct2.getName());
        System.out.println("Logged Product Price: " + loggedProduct2.getPrice());
    }
}