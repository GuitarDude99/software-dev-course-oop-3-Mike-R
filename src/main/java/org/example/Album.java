package org.example;

// Album
public class Album extends LibraryItem {
    private int trackCount;

    // Constructor

    public Album(String title, String author, int year, int trackCount) {
        super(title, author, year);
        this.trackCount = trackCount;
    }

    // Getter for the track count

    public int getTrackCount() {
        return trackCount;
    }

    // Print album details

    @Override
    public String toString() {
        return "Album: " + getTitle() + " by " + getAuthor() + " (" + getYear() + ") - " + trackCount + " tracks";
    }

}
