package com.hgdiv.opendata.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.util.Assert;

import javax.persistence.*;
import java.net.URL;
import java.util.Objects;


/**
 * <p>
 * Optional Parameters for filtering resulting JSON
 * Possible values : RANKING, TRACK_ASC, TRACK_DESC, ARTIST_ASC, ARTIST_DESC, ALBUM_ASC,
 * ALBUM_DESC, RATING_ASC, RATING_DESC, DURATION_ASC, DURATION_DESC
 * </p>
 */

@Entity
public class Search {

    /***********************************************************
     StuckInMyHead Vars
     ***********************************************************/
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //Local repository id

    /***********************************************************
     Deezer
     ***********************************************************/
    private String userInput;

    public static final String APPENDABLE_QUERY_URL = "https://api.deezer.com/search?q=";
    public int deezerId; //The track's Deezer id

    @JsonIgnore
    public boolean readable; //true if the track is readable in the player for the current user
    public String title; //The track's full title
    public String title_short; //The track's short title
    public String title_version; // The track version
    public URL link; // The url of the track on Deezer
    public int duration; // The track's duration in seconds
    public int rank; // The track's Deezer rank
    public boolean explicit_lyrics; //Whether the track contains explicit lyrics
    public URL preview; // The url of track's preview file. This file contains the first 30 seconds of the track

    /*
    artist object containing : id, name, link, picture, picture_small,
                                    picture_medium, picture_big, picture_xl
     */
    @Transient
    private Artist artist;

    /*
    album object containing : id, title, cover, cover_small, cover_medium, cover_big, cover_xl
     */
    @Transient
    private Album album;


    public Search() {

    }

    public static String buildSearchQuery(String userInput) throws Exception {

        Assert.notNull(userInput, "The search criteria, Name of Artist is required to perform a search query");
        if (userInput.length() > 0)
            return APPENDABLE_QUERY_URL.concat(userInput);
        else
            throw new Exception();
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDeezerId() {
        return deezerId;
    }

    public void setDeezerId(int deezerId) {
        this.deezerId = deezerId;
    }

    public boolean isReadable() {
        return readable;
    }

    public void setReadable(boolean readable) {
        this.readable = readable;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_short() {
        return title_short;
    }

    public void setTitle_short(String title_short) {
        this.title_short = title_short;
    }

    public String getTitle_version() {
        return title_version;
    }

    public void setTitle_version(String title_version) {
        this.title_version = title_version;
    }

    public URL getLink() {
        return link;
    }

    public void setLink(URL link) {
        this.link = link;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public boolean isExplicit_lyrics() {
        return explicit_lyrics;
    }

    public void setExplicit_lyrics(boolean explicit_lyrics) {
        this.explicit_lyrics = explicit_lyrics;
    }

    public URL getPreview() {
        return preview;
    }

    public void setPreview(URL preview) {
        this.preview = preview;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String nameOfArtist) {
        this.userInput = nameOfArtist;
    }


    @Override
    public String toString() {
        return "Search{[" +
                "id=" + id +
                ", deezerId=" + deezerId +
                ", readable=" + readable +
                ", title='" + title + '\'' +
                ", title_short='" + title_short + '\'' +
                ", title_version='" + title_version + '\'' +
                ", link=" + link +
                ", duration=" + duration +
                ", rank=" + rank +
                ", explicit_lyrics=" + explicit_lyrics +
                ", preview=" + preview +
                ", artist=" + artist +
                ", album=" + album + '\'' +
                ", exampleSearchURL= " + APPENDABLE_QUERY_URL + '\'' +
                "]}";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Search search = (Search) o;
        return deezerId == search.deezerId &&
                readable == search.readable &&
                duration == search.duration &&
                rank == search.rank &&
                explicit_lyrics == search.explicit_lyrics &&
                id.equals(search.id) &&
                title.equals(search.title) &&
                Objects.equals(title_short, search.title_short) &&
                Objects.equals(title_version, search.title_version) &&
                link.equals(search.link) &&
                Objects.equals(preview, search.preview);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, deezerId, readable, title, title_short, title_version, link, duration, rank, explicit_lyrics, preview);
    }


}
