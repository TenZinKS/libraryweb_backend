package com.example.library_api.pojo;

import com.example.library_api.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AuthorPojo {

    private long id;
    private String name;
    private List<Book> books;

}
