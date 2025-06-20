package com.librarymanagment.library;


import jakarta.persistence.*;
import lombok.ToString;

@Table
@ToString
@Entity

public class LibraryInventory {

    @Column
    public String books;
    @Column
    public String computers;
    @Column
    public String gamingKits;
    @Column
    public String musicalInstruments;
    @Column
    public int rollNo;
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

}
