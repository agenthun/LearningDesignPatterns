package com.agenthun.factory.uml;

/**
 * Created by agenthun on 2016/10/2.
 * 具体工厂类，创建ProductA
 */
public class ConcreteFactory extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }

    @Override
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
