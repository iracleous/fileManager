package gr.codebub.filemanager;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductRepository {

    private ArrayList<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
    }

    //crud
    //create
    public void addProduct(Product product) {
        products.add(product);
    }

    //read
    //get
    public Product getProduct(int index) {
        return products.get(index);
    }

    public void updateProduct(int index, double newPrice) {
        products.get(index)
                .setPrice(newPrice);
    }

    //delete
    public void deleteProduct(int index) {
        products.remove(index);
    }

    public String toString() {
        return products.toString();
    }

    //////////////////////////////////////////
    public void save(String filename) throws FileNotFoundException {

        File file = new File(filename);


        PrintWriter printWriter = new PrintWriter(file);
        for (Product product : products) {
            printWriter.println(product.getName() + "," + product.getPrice() + "," + product.getInventoryQuantity());
        }
        printWriter.close();
    }

    public void load(String filename) {
        File file = new File(filename);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] elements = line.split(",");
                String name = elements[0];
                double price = Double.parseDouble(elements[1]);
                int inventoryQuantity = Integer.parseInt(elements[2]);
                products.add(new Product(name, price, inventoryQuantity));

            }


        } catch (FileNotFoundException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            e.printStackTrace();
        } finally {
            System.out.println("The method has terminated");
        }

    }

    public void serializeToXML(String filename) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        XMLEncoder encoder = new XMLEncoder(fileOutputStream);

        encoder.writeObject(products);
        encoder.close();
        fileOutputStream.close();
    }

    public void deserializeFromXML(String filename) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        XMLDecoder xmlDecoder = new XMLDecoder(fileInputStream);
        products = (ArrayList) xmlDecoder.readObject();
        xmlDecoder.close();
        fileInputStream.close();
    }


}

