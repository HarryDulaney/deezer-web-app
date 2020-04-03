package com.hgdiv.opendata.controller;

public class PersonNotFoundException extends RuntimeException {

        PersonNotFoundException(Long id) {
            super("Couldn't find any matches for" + id);
        }
    }
