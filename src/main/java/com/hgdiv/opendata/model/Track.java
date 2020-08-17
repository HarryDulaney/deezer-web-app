package com.hgdiv.opendata.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;

/**
 * The type Track.
 *
 * @author HGDIV
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Track {

    private Integer id; //The track's Deezer id
    private Boolean readable; //true if the track is readable in the player for the current user
    private String isrc; // The track isrc (Unique international music IP identifier)
    private String title; //full-title
    private String title_short;
    private String title_version; // The track version
    private String link; // The url of the track on Deezer
    private Integer duration;//The track's duration in seconds
    private Integer rank; // The track's Deezer rank
    private String preview; // The url of track's preview file. This file contains the first 30 seconds of the track
    private Artist artist;// Artists object
    private Album album; // Albums object
    private Integer track_position; //The position of the track in its album
    private Integer disk_number; // The track's album's disk number
    private Double bpm; // Beats per minute
    private Double gain; // Signal strength
    private String[] available_countries;
    private Date release_date; // The track's release date
    private Boolean explicit_lyrics; // Whether the track contains explicit lyrics
    private Integer explicit_content_lyrics;//The explicit content lyrics values (0:Not Explicit; 1:Explicit; 2:Unknown; 3:Edited; 6:No Advice Available)
    private Integer explicit_content_cover;
    /**
     * Gets id.
     *
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Gets readable.
     *
     * @return the readable
     */
    public Boolean getReadable() {
        return readable;
    }

    /**
     * Sets readable.
     *
     * @param readable the readable
     */
    public void setReadable(Boolean readable) {
        this.readable = readable;
    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets duration.
     *
     * @return the duration
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets duration.
     *
     * @param duration the duration
     */
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Gets rank.
     *
     * @return the rank
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * Sets rank.
     *
     * @param rank the rank
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    /**
     * Gets preview.
     *
     * @return the preview
     */
    public String getPreview() {
        return preview;
    }

    /**
     * Sets preview.
     *
     * @param preview the preview
     */
    public void setPreview(String preview) {
        this.preview = preview;
    }

    /**
     * Gets artist.
     *
     * @return the artist
     */
    public Artist getArtist() {
        return artist;
    }

    /**
     * Sets artist.
     *
     * @param artist the artist
     */
    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    /**
     * Gets link.
     *
     * @return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets link.
     *
     * @param link the link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     * Gets album.
     *
     * @return the album
     */
    public Album getAlbum() {
        return album;
    }

    /**
     * Sets album.
     *
     * @param album the album
     */
    public void setAlbum(Album album) {
        this.album = album;
    }

    /**
     * Gets isrc.
     *
     * @return the isrc
     */
    public String getIsrc() {
        return isrc;
    }

    /**
     * Sets isrc.
     *
     * @param isrc the isrc
     */
    public void setIsrc(String isrc) {
        this.isrc = isrc;
    }

    /**
     * Gets track position.
     *
     * @return the track position
     */
    public Integer getTrack_position() {
        return track_position;
    }

    /**
     * Sets track position.
     *
     * @param track_position the track position
     */
    public void setTrack_position(Integer track_position) {
        this.track_position = track_position;
    }

    /**
     * Gets disk number.
     *
     * @return the disk number
     */
    public Integer getDisk_number() {
        return disk_number;
    }

    /**
     * Sets disk number.
     *
     * @param disk_number the disk number
     */
    public void setDisk_number(Integer disk_number) {
        this.disk_number = disk_number;
    }

    /**
     * Gets bpm.
     *
     * @return the bpm
     */
    public Double getBpm() {
        return bpm;
    }

    /**
     * Sets bpm.
     *
     * @param bpm the bpm
     */
    public void setBpm(Double bpm) {
        this.bpm = bpm;
    }

    /**
     * Gets gain.
     *
     * @return the gain
     */
    public Double getGain() {
        return gain;
    }

    /**
     * Sets gain.
     *
     * @param gain the gain
     */
    public void setGain(Double gain) {
        this.gain = gain;
    }

    /**
     * Get available countries string [ ].
     *
     * @return the string [ ]
     */
    public String[] getAvailable_countries() {
        return available_countries;
    }

    /**
     * Sets available countries.
     *
     * @param available_countries the available countries
     */
    public void setAvailable_countries(String[] available_countries) {
        this.available_countries = available_countries;
    }

    /**
     * Gets time add.
     *
     * @return the time add
     */
    public Date getReleaseDate() {
        return release_date;
    }

    /**
     * The release date
     *
     * @param release_date
     */
    public void setReleaseDate(Date release_date) {
        this.release_date = release_date;
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

    public Boolean getExplicit_lyrics() {
        return explicit_lyrics;
    }

    public void setExplicit_lyrics(Boolean explicit_lyrics) {
        this.explicit_lyrics = explicit_lyrics;
    }


    public Integer getExplicit_content_lyrics() {
        return explicit_content_lyrics;
    }

    public void setExplicit_content_lyrics(Integer explicit_content_lyrics) {
        this.explicit_content_lyrics = explicit_content_lyrics;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public void setRelease_date(Date release_date) {
        this.release_date = release_date;
    }

    public Integer getExplicit_content_cover() {
        return explicit_content_cover;
    }

    public void setExplicit_content_cover(Integer explicit_content_cover) {
        this.explicit_content_cover = explicit_content_cover;
    }






}

