package org.example;

// base class

public class LibraryItem {
    private String title;
    private String author;
    private int year;

    // Constructor

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year ;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;

    }

    public int getYear() {
        return year;
    }

    // toString() = print

    @Override
    public String toString() {
        return title + " by " + author + " (" + year + ")";
    }

}

