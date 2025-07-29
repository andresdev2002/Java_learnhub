package org.example;

public class Library {
    String title;
    String author;
    int pages;
    boolean available;

    public Library(String title, String author, int pages, boolean available){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.available = true;
    }

    public void ShowInfo(){
        System.out.println("Title: " + title + ", Author: "+ author + ", Pages: " + pages);
        System.out.println("Available: " + (available ? "YES" : "NO" ));
    }

    public void borrowBook(){
        if (available){
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Bok not available");
        }
    }
    public void returnBook(){
        available = true;
        System.out.println("Book returned");
    }

    public static void main(String[] args){
        Library book1 = new Library("Mathematics Fundamentals", "Isaac Newton", 400, true);
        book1.ShowInfo();
        book1.borrowBook();
        book1.ShowInfo();
        book1.returnBook();
        book1.ShowInfo();
    }
}
