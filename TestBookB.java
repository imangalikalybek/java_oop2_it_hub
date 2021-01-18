package com.company.oop2;

public class TestBookB {

    public static void main(String[] args) {

        Author[] authors = new Author[2];
        authors[0] = new Author("Second Author", "second@gmail.com", 'm');
        authors[1] = new Author("Iam Author", "author@gmail.com", 'm');
        BookB javaDummy = new BookB("Java", authors, 30.00, 70);
        System.out.println(javaDummy);
    }

}
