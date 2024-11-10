package com.kang.Board;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public List<Board> findAllBoards() {
        return boardRepository.findAll();
    }

    public Board findBoardById(Long id) {
        return boardRepository.findById(id).orElse(null);
    }

    public Board saveBoard(Board Board) {
        return boardRepository.save(Board);
    }

    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }
}
