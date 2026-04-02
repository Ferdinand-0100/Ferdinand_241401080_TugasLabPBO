package edu.ecommerce;

public class MainApp {
    public static void main(String[] args) {
        Order order = new Order("Brainrot67", "Ferdinand");

        Order.OrderItem item1 = order.new OrderItem("Brr", 670, 1);
        Order.OrderItem item2 = order.new OrderItem("Brrrr", 6700, 2);
        Order.OrderItem item3 = order.new OrderItem("Patapim", 67000, 3);

        Order.OrderItem[] items = {item1, item2, item3};

        order.hitungTotal(items);

        order.tampilkanRincian(items);
    }
}