package com.hgdiv.opendata.model;


/**
 * The type Artist.
 *
 * @author HGDIV
 */
public class Artist {

    private Integer id; //The artist's Deezer id
    private String name; //The artist's name
    private String link; //The url of the artist on Deezer
    private String picture; //The url of the artist picture. Add 'size' parameter to the url to change size. Can be 'small', 'medium', 'big', 'xl'\
    private String picture_small;
    private String picture_medium;
    private String picture_big;
    private String picture_xl;
    private Integer nb_album; //The number of artist's albums
    private Integer nb_fan; //The number of artist's fans
    private String tracklist;
    private boolean radio;
    private String type;


    /**
     * Instantiates a new Artist.
     */
    public Artist(){}


    /**
     * Instantiates a new Artist.
     *
     * @param name the name
     */
    public Artist(String name) {
        this.name = name;
    }

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
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param firstName the first name
     */
    public void setName(String firstName) {
        this.name = firstName;
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
     * Gets picture.
     *
     * @return the picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Sets picture.
     *
     * @param picture the picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * Gets nb album.
     *
     * @return the nb album
     */
    public Integer getNb_album() {
        return nb_album;
    }

    /**
     * Sets nb album.
     *
     * @param nb_album the nb album
     */
    public void setNb_album(Integer nb_album) {
        this.nb_album = nb_album;
    }

    /**
     * Gets nb fan.
     *
     * @return the nb fan
     */
    public Integer getNb_fan() {
        return nb_fan;
    }

    /**
     * Sets nb fan.
     *
     * @param nb_fan the nb fan
     */
    public void setNb_fan(Integer nb_fan) {
        this.nb_fan = nb_fan;
    }

    /**
     * Gets tracklist.
     *
     * @return the tracklist
     */
    public String getTracklist() {
        return tracklist;
    }

    /**
     * Sets tracklist.
     *
     * @param tracklist the tracklist
     */
    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
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
     * Sets type.
     *
     * @param type the type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Is radio boolean.
     *
     * @return the boolean
     */
    public boolean isRadio() {
        return radio;
    }

    /**
     * Sets radio.
     *
     * @param radio the radio
     */
    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    /**
     * Gets picture small.
     *
     * @return the picture small
     */
    public String getPicture_small() {
        return picture_small;
    }

    /**
     * Sets picture small.
     *
     * @param picture_small the picture small
     */
    public void setPicture_small(String picture_small) {
        this.picture_small = picture_small;
    }

    /**
     * Gets picture medium.
     *
     * @return the picture medium
     */
    public String getPicture_medium() {
        return picture_medium;
    }

    /**
     * Sets picture medium.
     *
     * @param picture_medium the picture medium
     */
    public void setPicture_medium(String picture_medium) {
        this.picture_medium = picture_medium;
    }

    /**
     * Gets picture big.
     *
     * @return the picture big
     */
    public String getPicture_big() {
        return picture_big;
    }

    /**
     * Sets picture big.
     *
     * @param picture_big the picture big
     */
    public void setPicture_big(String picture_big) {
        this.picture_big = picture_big;
    }

    /**
     * Gets picture xl.
     *
     * @return the picture xl
     */
    public String getPicture_xl() {
        return picture_xl;
    }

    /**
     * Sets picture xl.
     *
     * @param picture_xl the picture xl
     */
    public void setPicture_xl(String picture_xl) {
        this.picture_xl = picture_xl;
    }




    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                ", picture='" + picture + '\'' +
                ", nb_album=" + nb_album +
                ", nb_fan=" + nb_fan +
                ", tracklist='" + tracklist + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

}
