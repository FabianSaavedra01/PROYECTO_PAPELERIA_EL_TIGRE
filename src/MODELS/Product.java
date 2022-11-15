package MODELS;

public class Product {
    private int idProduct;
    private String nameProduct;
    private int countProduct;
    private String description;
    //Aquí podría ir tambien una imagen del producto cre que ya habiamos hablado de eso


    public Product(int idProduct, String nameProduct, int countProduct, String description) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.countProduct = countProduct;
        this.description = description;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public void setCountProduct(int countProduct) {
        this.countProduct = countProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
