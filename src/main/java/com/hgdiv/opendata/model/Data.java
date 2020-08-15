package com.hgdiv.opendata.model;

import java.util.List;

/**
 * The type Data.
 *
 * @param <T> Wrapper for application object to enable mapping json to objects
 *            by Jackson ObjectMapper -> Ex: Data[{k:key,v:value}] <- Objects Wrapped in Data[] field
 * @author HGDIV
 */
public class Data<T> {

    private Integer total;
    private List<T> data;
    private String next;


    private String checksum;

    /**
     * Instantiates a new Data.
     */
    public Data() {
    }

    /**
     * Instantiates a new Data.
     *
     * @param data the data
     */
    public Data(List<T> data) {
        this.data = data;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public List<T> getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(List<T> data) {
        this.data = data;
    }

    /**
     * Gets total.
     *
     * @return the total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * Sets total.
     *
     * @param total the total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * Gets next.
     *
     * @return the next
     */
    public String getNext() {
        return next;
    }

    /**
     * Sets next.
     *
     * @param next the next
     */
    public void setNext(String next) {
        this.next = next;
    }

    /**
     * Gets checksum.
     *
     * @return the checksum
     */
    public String getChecksum() {
        return checksum;
    }

    /**
     * Sets checksum.
     *
     * @param checksum the checksum
     */
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }


}
