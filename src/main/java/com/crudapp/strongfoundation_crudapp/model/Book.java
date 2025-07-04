package com.crudapp.strongfoundation_crudapp.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="books")
@AllArgsConstructor
@NoArgsConstructor
@Getter@Setter
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String title;

    private String author;
}
