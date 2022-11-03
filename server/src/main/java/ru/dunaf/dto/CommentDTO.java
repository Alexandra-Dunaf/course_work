package ru.dunaf.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class CommentDTO {

    private Long id;
    private String username;
    @NotEmpty
    private String message;
}
