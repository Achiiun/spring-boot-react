package springproject.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springproject.board.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
