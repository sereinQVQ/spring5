package com.atguigu.spring5;

public class Book {
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.setName("abc");

        Book book2 = new Book("abc");
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
