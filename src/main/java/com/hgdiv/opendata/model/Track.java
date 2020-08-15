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

    private Long id;
    private Boolean readable;
    private String isrc;
    private String title;
    private String title_short;
    private String title_version;
    private String link;
    private Integer duration;
    private Integer rank;
    private String preview;
    private Artist artist;
    private Album album;
    private String type;
    private Integer track_position;
    private Integer disk_number;
    private Double bpm;
    private Double gain;
    private String[] available_countries;
    private Date time_add;
    private Boolean explicit_lyrics;
    private Integer explicit_content_lyrics;

    /**
     * Gets id.
     *
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(Long id) {
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
     * Gets type.
     *
     * @return the type
     */
    public String getType() {
        return type;

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
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;

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
    public Date getTime_add() {
        return time_add;
    }

    /**
     * Sets time add.
     *
     * @param time_add the time add
     */
    public void setTime_add(Date time_add) {
        this.time_add = time_add;
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


}

