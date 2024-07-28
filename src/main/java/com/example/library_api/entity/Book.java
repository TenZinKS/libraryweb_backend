package com.example.library_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "book", uniqueConstraints = {
        @UniqueConstraint(name = "unique_book_id", columnNames = "id")
})
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String genre;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

}
