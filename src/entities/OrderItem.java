package entities;

public class OrderItem {

    private Integer quantity;
    private Double price;
    /* O PRICE É REPETIDO NO ORDERITEM PARA SE MANTER UM HISTÓRICO
    DO PREÇO MESMO QUE HAJA ALTERAÇÃO NO PRICE DO PRODUCT */
    private Product product;        // COMPOSIÇÃO DE OBJETOS CLASSE PRODUCT

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
