package com.company.oop2;

public class TestBook {

    public static void main(String[] args) {

        Author author = new Author("Name", "name@mail.ru", 'm');
        Book dummyBook = new Book("My Java", author, 14.40, 50);
        System.out.println(dummyBook);
        dummyBook.setPrice(22.00);
        dummyBook.setQty(80);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());
        Book anotherBook = new Book("second Java", new Author("Iam Author",
                "author@gmail.com", 'm'), 25.60);
        System.out.println(anotherBook);
    }

}
