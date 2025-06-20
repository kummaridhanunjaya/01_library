package com.librarymanagment.library;

import ch.qos.logback.core.CoreConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    LibraryRepo repo;
    public void create(LibraryInventory inventory) {
        System.out.println("New Line ADDED");
        repo.save(inventory);
    }
}