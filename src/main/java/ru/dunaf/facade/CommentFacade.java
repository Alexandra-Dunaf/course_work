package ru.dunaf.facade;

import org.springframework.stereotype.Component;
import ru.dunaf.dto.CommentDTO;
import ru.dunaf.entity.Comment;

@Component
public class CommentFacade {

    public CommentDTO commentToCommentDTO(Comment comment) {
        CommentDTO commentDTO = new CommentDTO();
        commentDTO.setId(comment.getId());
        commentDTO.setUsername(comment.getUsername());
        commentDTO.setMessage(comment.getMessage());
        return commentDTO;
    }
}
