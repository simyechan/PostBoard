package com.example.postboard.domain.board.controller;

import com.example.postboard.domain.board.dto.request.BoardRequest;
import com.example.postboard.domain.board.dto.response.BoardResponse;
import com.example.postboard.domain.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

    private final BoardService boardService;

    @PostMapping
    public String addBoard(@RequestBody BoardRequest req) {
        boardService.addBoard(req);
        return "";
    }

    @GetMapping
    public BoardResponse getBoard(@RequestParam long id) {
        return boardService.getBoard(id);
    }

    @GetMapping("/all")
    public List<BoardResponse> getAllBoards() {
        return boardService.getAllBoards();
    }
}
