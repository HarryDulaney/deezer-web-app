package com.hgdiv.opendata.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;


@Entity
public class Track {

    @Id
    private int id;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Track track = (Track) o;
        return Objects.equals(artist, track.artist) &&
                Objects.equals(title, track.title) &&
                Objects.equals(genre, track.genre) &&
                Objects.equals(year, track.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artist, title, genre, year);
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

