package com.librarymanagment.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    @Autowired
    LibraryRepo repo;
    public void create(LibraryInventory inventory) {
        System.out.println("working perfectly fine");
        repo.save(inventory);
    }
}