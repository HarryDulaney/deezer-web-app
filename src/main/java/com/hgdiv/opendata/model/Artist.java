package com.hgdiv.opendata.model;




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



    public Artist(){}


    public Artist(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String firstName) {
        this.name = firstName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getNb_album() {
        return nb_album;
    }

    public void setNb_album(Integer nb_album) {
        this.nb_album = nb_album;
    }

    public Integer getNb_fan() {
        return nb_fan;
    }

    public void setNb_fan(Integer nb_fan) {
        this.nb_fan = nb_fan;
    }

    public String getTracklist() {
        return tracklist;
    }

    public void setTracklist(String tracklist) {
        this.tracklist = tracklist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public String getPicture_small() {
        return picture_small;
    }

    public void setPicture_small(String picture_small) {
        this.picture_small = picture_small;
    }

    public String getPicture_medium() {
        return picture_medium;
    }

    public void setPicture_medium(String picture_medium) {
        this.picture_medium = picture_medium;
    }

    public String getPicture_big() {
        return picture_big;
    }

    public void setPicture_big(String picture_big) {
        this.picture_big = picture_big;
    }

    public String getPicture_xl() {
        return picture_xl;
    }

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
