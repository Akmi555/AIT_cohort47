package lesson_41;
/*
@date 10.07.2024
@author Sergey Bugaienko
*/

import java.util.List;

public class Shop {
    private String title;
    private List<String> products;

    public Shop(String title, List<String> products) {
        this.title = title;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "title='" + title + '\'' +
                ", products=" + products +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getProducts() {
        return products;
    }

    public void setProducts(List<String> products) {
        this.products = products;
    }
}
