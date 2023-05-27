/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14;

/**
 *
 * @author JCMB
 */
public class ProductLogger implements IProduct{
    private IProduct product;

    public ProductLogger(IProduct product) {
        this.product = product;
    }

    @Override
    public String getName() {
        // Implementação decorada da obtenção do nome com registro de log
        return product.getName();
        // Implementação decorada da obtenção do nome com registro de log
    }

    @Override
    public double getPrice() {
        // Implementação decorada da obtenção do preço com registro de log
        return product.getPrice();
        // Implementação decorada da obtenção do preço com registro de log
    }

    @Override
    public int getId() {
        return product.getId();
    }
}