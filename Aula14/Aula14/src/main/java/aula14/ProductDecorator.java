/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14;

/**
 *
 * @author JCMB
 */
public class ProductDecorator implements IProduct{
    private IProduct product;

    public ProductDecorator(IProduct product) {
        this.product = product;
    }

    @Override
    public String getName() {
        // Implementação decorada da obtenção do nome
        return product.getName();
        // Implementação decorada da obtenção do nome
    }

    @Override
    public double getPrice() {
        // Implementação decorada da obtenção do preço
        return product.getPrice();
        // Implementação decorada da obtenção do preço
    }

    @Override
    public int getId() {
        return product.getId();
    }
}