package springproject.board.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import springproject.board.domain.Board;

@Data
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String content;

    public BoardDto(Board board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
    }
}