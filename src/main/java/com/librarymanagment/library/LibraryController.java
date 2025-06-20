package com.librarymanagment.library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class LibraryController {

    @Autowired
    public LibraryService libraryService;


    @PostMapping("/add")
    public String add(LibraryInventory inventory) {
        libraryService.create(inventory);
        return "created";

    }

}
