package com.hgdiv.opendata.model;


public class Track {


    private String artist;
    private String title;
    private String genre;
    private String year;


    public Track() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Track{ " +
                "Title=" + title +
                ", Genre='" + genre + '\'' +
                "Year=" + year + '\'' +
                "Artist=" + artist + '}';
    }
}

