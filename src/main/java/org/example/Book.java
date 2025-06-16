package org.example;

// Book = type of LibraryItem

public class Book extends LibraryItem {
    private int pageCount;

    // Constructor with the title, author, year, page count.

    public Book(String title, String author, int year, int pageCount) {
         super(title, author, year);
        this.pageCount = pageCount;
    }

    // Getter for page count
    public int getPageCount() {
        return pageCount;
    }

    // "reading"

    public void readBook() {
        System.out.println("Reading \"" + getTitle() + "\"... enjoy!");
    }

    // Print book details


    @Override
    public String toString() {
        return "Book: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ") - " + pageCount + " pages";
    }

}



