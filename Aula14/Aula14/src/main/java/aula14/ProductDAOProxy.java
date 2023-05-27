/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14;

/**
 *
 * @author JCMB
 */
public class ProductDAOProxy implements IProductDAOProxy{
    private IProductDAO productDAO;

    public ProductDAOProxy() {
        productDAO = new ProductDAO();
    }

    @Override
    public IProduct getProductById(int id) {
        System.out.println("Proxy: Retrieving product from database...");
        return productDAO.getProductById(id);
    }

    @Override
    public void saveProduct(IProduct product) {
        System.out.println("Proxy: Saving product to database...");
        productDAO.saveProduct(product);
    }
}