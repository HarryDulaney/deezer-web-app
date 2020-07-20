package com.hgdiv.opendata.model;

/**
 * The type Album.
 *
 * @author HGDIV
 */
public class Album {

    private Integer id;
    private String title;
    private String upc;
    private String link;
    private String cover;
    private String cover_small;
    private String cover_medium;
    private String cover_big;
    private String cover_xl;
    private String genre_id;
    private Integer fans;
    private String release_date;
    private String record_type;
    private String tracklist;
    private Boolean explicit_lyrics;
    private String type;

    private String label;
    private Integer duration;
    private Integer rating;
    private Boolean available;
    private Artist artist;
    private String approved_type;
    private String language;
    private String genre;
    private Integer nb_tracks;
    private Genres genres;


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
     * Gets cover.
     *
     * @return the cover
     */
    public String getCover() {
        return cover;
    }

    /**
     * Sets cover.
     *
     * @param cover the cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Gets genre id.
     *
     * @return the genre id
     */
    public String getGenre_id() {
        return genre_id;
    }

    /**
     * Sets genre id.
     *
     * @param genre_id the genre id
     */
    public void setGenre_id(String genre_id) {
        this.genre_id = genre_id;
    }

    /**
     * Gets nb tracks.
     *
     * @return the nb tracks
     */
    public Integer getNb_tracks() {
        return nb_tracks;
    }

    /**
     * Sets nb tracks.
     *
     * @param nb_tracks the nb tracks
     */
    public void setNb_tracks(Integer nb_tracks) {
        this.nb_tracks = nb_tracks;
    }

    /**
     * Gets label.
     *
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets label.
     *
     * @param label the label
     */
    public void setLabel(String label) {
        this.label = label;
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
     * Gets fans.
     *
     * @return the fans
     */
    public Integer getFans() {
        return fans;
    }

    /**
     * Sets fans.
     *
     * @param fans the fans
     */
    public void setFans(Integer fans) {
        this.fans = fans;
    }

    /**
     * Gets rating.
     *
     * @return the rating
     */
    public Integer getRating() {
        return rating;
    }

    /**
     * Sets rating.
     *
     * @param rating the rating
     */
    public void setRating(Integer rating) {
        this.rating = rating;
    }

    /**
     * Gets release date.
     *
     * @return the release date
     */
    public String getRelease_date() {
        return release_date;
    }

    /**
     * Sets release date.
     *
     * @param release_date the release date
     */
    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    /**
     * Gets available.
     *
     * @return the available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     * Sets available.
     *
     * @param available the available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
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
     * Gets approved type.
     *
     * @return the approved type
     */
    public String getApproved_type() {
        return approved_type;
    }

    /**
     * Sets approved type.
     *
     * @param approved_type the approved type
     */
    public void setApproved_type(String approved_type) {
        this.approved_type = approved_type;
    }

    /**
     * Gets language.
     *
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets language.
     *
     * @param language the language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * Gets genre.
     *
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Sets genre.
     *
     * @param genre the genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Gets upc.
     *
     * @return the upc
     */
    public String getUpc() {
        return upc;
    }

    /**
     * Sets upc.
     *
     * @param upc the upc
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     * Gets genres.
     *
     * @return the genres
     */
    public Genres getGenres() {
        return genres;
    }

    /**
     * Sets genres.
     *
     * @param genres the genres
     */
    public void setGenres(Genres genres) {
        this.genres = genres;
    }

    /**
     * Gets record type.
     *
     * @return the record type
     */
    public String getRecord_type() {
        return record_type;
    }

    /**
     * Sets record type.
     *
     * @param record_type the record type
     */
    public void setRecord_type(String record_type) {
        this.record_type = record_type;
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
     * Gets cover small.
     *
     * @return the cover small
     */
    public String getCover_small() {
        return cover_small;
    }

    /**
     * Sets cover small.
     *
     * @param cover_small the cover small
     */
    public void setCover_small(String cover_small) {
        this.cover_small = cover_small;
    }

    /**
     * Gets cover medium.
     *
     * @return the cover medium
     */
    public String getCover_medium() {
        return cover_medium;
    }

    /**
     * Sets cover medium.
     *
     * @param cover_medium the cover medium
     */
    public void setCover_medium(String cover_medium) {
        this.cover_medium = cover_medium;
    }

    /**
     * Gets cover big.
     *
     * @return the cover big
     */
    public String getCover_big() {
        return cover_big;
    }

    /**
     * Sets cover big.
     *
     * @param cover_big the cover big
     */
    public void setCover_big(String cover_big) {
        this.cover_big = cover_big;
    }

    /**
     * Gets cover xl.
     *
     * @return the cover xl
     */
    public String getCover_xl() {
        return cover_xl;
    }

    /**
     * Sets cover xl.
     *
     * @param cover_xl the cover xl
     */
    public void setCover_xl(String cover_xl) {
        this.cover_xl = cover_xl;
    }

    /**
     * Gets explicit lyrics.
     *
     * @return the explicit lyrics
     */
    public Boolean getExplicit_lyrics() {
        return explicit_lyrics;
    }

    /**
     * Sets explicit lyrics.
     *
     * @param explicit_lyrics the explicit lyrics
     */
    public void setExplicit_lyrics(Boolean explicit_lyrics) {
        this.explicit_lyrics = explicit_lyrics;
    }

}