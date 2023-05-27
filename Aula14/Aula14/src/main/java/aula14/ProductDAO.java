/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula14;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JCMB
 */
public class ProductDAO implements IProductDAO{
   private List<IProduct> productList;

    public ProductDAO() {
        productList = new ArrayList<>();
    }

   @Override
    public IProduct getProductById(int id) {
        for (IProduct product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

   @Override
    public void saveProduct(IProduct product) {
        productList.add(product);
        System.out.println("Product saved: " + product.getName());
    }
}