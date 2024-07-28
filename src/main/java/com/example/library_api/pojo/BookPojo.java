package com.example.library_api.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookPojo {

    private Long id;
    private String title;
    private String genre;
    private AuthorPojo author;

}
