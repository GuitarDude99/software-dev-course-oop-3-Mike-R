package org.example;

// Movie


public class Movie extends LibraryItem {
    private int durationInMinutes;

    // Constructor

    public Movie(String title, String author, int year, int durationInMinutes) {
        super(title, author, year);
        this.durationInMinutes = durationInMinutes;
    }

    // Getter
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // Printt


    @Override
    public String toString() {
        return "Movie: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ") - " + durationInMinutes + " minutes";
    }

}


