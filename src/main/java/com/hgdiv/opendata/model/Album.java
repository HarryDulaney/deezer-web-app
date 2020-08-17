package com.hgdiv.opendata.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

/**
 * The type Album.
 *
 * @author HGDIV
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Album {
    // Album object when returned from a search query
    private Integer id;
    private String title;
    private String upc;
    private String link;
    private String share; //Share Link
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
    // Album objects when retrieved using album_id include the below fields
    private String label;
    private Integer duration;
    private Integer rating;
    private Boolean available;
    private Album alternative;
    private Artist artist;
    private String approved_type;
    private String language;
    private String genre;
    private Integer nb_tracks;
    private Genres genres;
    private Integer explicit_content_lyrics;
    private List<Object> contributors;
    private Integer explicit_content_cover;
    private Tracks tracks;

    /**
     * @return duration formatted as D min and D sec.
     */
    public String formatDuration() {
        String result = "";
        if (this.duration != null) {
            int minutes = this.duration / 60;
            int seconds = this.duration % 60;
            result += minutes + " min and " + seconds + " sec";

        }
        return result;

    }


    /**
     * Instantiates a new Album.
     */
    public Album() {
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
     * Sets track list.
     *
     * @param tracklist the track list
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

    /**
     * Gets share link url.
     *
     * @return the link to use for sharing this album
     */
    public String getShare() {
        return share;
    }

    /**
     * Sets share link url.
     *
     * @param share The link to use for sharing this album
     */
    public void setShare(String share) {
        this.share = share;
    }


    /**
     * Gets explicit content lyrics.
     *
     * @return the explicit content lyrics
     */
    public Integer getExplicit_content_lyrics() {
        return explicit_content_lyrics;
    }

    /**
     * Sets explicit content lyrics.
     *
     * @param explicit_content_lyrics the explicit content lyrics
     */
    public void setExplicit_content_lyrics(Integer explicit_content_lyrics) {
        this.explicit_content_lyrics = explicit_content_lyrics;
    }

    /**
     * Gets contributors.
     *
     * @return the contributors
     */
    public List<Object> getContributors() {
        return contributors;
    }

    /**
     * Sets contributors.
     *
     * @param contributors the contributors
     */
    public void setContributors(List<Object> contributors) {
        this.contributors = contributors;
    }

    public Integer getExplicit_content_cover() {
        return explicit_content_cover;
    }

    public void setExplicit_content_cover(Integer explicit_content_cover) {
        this.explicit_content_cover = explicit_content_cover;
    }


    public Tracks getTracks() {
        return tracks;
    }

    public void setTracks(Tracks tracks) {
        this.tracks = tracks;
    }

    public Album getAlternative() {
        return alternative;
    }

    public void setAlternative(Album alternative) {
        this.alternative = alternative;
    }









    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return id.equals(album.id) &&
                title.equals(album.title) &&
                Objects.equals(upc, album.upc) &&
                Objects.equals(link, album.link) &&
                Objects.equals(cover, album.cover) &&
                Objects.equals(cover_small, album.cover_small) &&
                Objects.equals(cover_medium, album.cover_medium) &&
                Objects.equals(cover_big, album.cover_big) &&
                Objects.equals(cover_xl, album.cover_xl) &&
                Objects.equals(genre_id, album.genre_id) &&
                Objects.equals(fans, album.fans) &&
                Objects.equals(release_date, album.release_date) &&
                Objects.equals(record_type, album.record_type) &&
                Objects.equals(tracklist, album.tracklist) &&
                Objects.equals(explicit_lyrics, album.explicit_lyrics) &&
                Objects.equals(type, album.type) &&
                Objects.equals(label, album.label) &&
                Objects.equals(duration, album.duration) &&
                Objects.equals(rating, album.rating) &&
                Objects.equals(available, album.available) &&
                artist.equals(album.artist) &&
                Objects.equals(approved_type, album.approved_type) &&
                Objects.equals(language, album.language) &&
                Objects.equals(genre, album.genre) &&
                Objects.equals(nb_tracks, album.nb_tracks) &&
                Objects.equals(genres, album.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, upc, link, cover, cover_small, cover_medium, cover_big, cover_xl, genre_id, fans, release_date, record_type, tracklist, explicit_lyrics, type, label, duration, rating, available, artist, approved_type, language, genre, nb_tracks, genres);
    }

    @Override
    public String toString() {
        return "Album{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", upc='" + upc + '\'' +
                ", link='" + link + '\'' +
                ", cover='" + cover + '\'' +
                ", cover_small='" + cover_small + '\'' +
                ", cover_medium='" + cover_medium + '\'' +
                ", cover_big='" + cover_big + '\'' +
                ", cover_xl='" + cover_xl + '\'' +
                ", genre_id='" + genre_id + '\'' +
                ", fans=" + fans +
                ", release_date='" + release_date + '\'' +
                ", record_type='" + record_type + '\'' +
                ", tracklist='" + tracklist + '\'' +
                ", explicit_lyrics=" + explicit_lyrics +
                ", type='" + type + '\'' +
                ", label='" + label + '\'' +
                ", duration=" + duration +
                ", rating=" + rating +
                ", available=" + available +
                ", artist=" + artist +
                ", approved_type='" + approved_type + '\'' +
                ", language='" + language + '\'' +
                ", genre='" + genre + '\'' +
                ", nb_tracks=" + nb_tracks +
                ", genres=" + genres +
                '}';
    }

}