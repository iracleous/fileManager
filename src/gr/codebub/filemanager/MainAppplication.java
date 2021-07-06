package gr.codebub.filemanager;

import gr.codebub.filemanager.exception.TooHighPriceException;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainAppplication {

    public static void main(String[] args) throws IOException {

        ProductRepository productRepository = new ProductRepository();

//       Product product = new Product("snack", 1.20, 6);
//        try {
//            product.IncreasePriceWhenLowAvailability(2, 7);
//        } catch (TooHighPriceException e) {
//            e.printStackTrace();
//
//        }
//
//        productRepository.addProduct(product);
//
//        productRepository.save("products.txt");
//

 //       productRepository.load("products.txt");

        productRepository.deserializeFromXML("products.xml");

        System.out.println(productRepository);


   //         productRepository.serializeToXML("products.xml");

    }
}
