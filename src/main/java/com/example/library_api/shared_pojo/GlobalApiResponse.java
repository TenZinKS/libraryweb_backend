package com.example.library_api.shared_pojo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GlobalApiResponse <T> {
    private String message;
    private T data;
    private Integer StatusCode;
}
