package com.tenco.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.tenco.blog.dto.BoardDTO;
import com.tenco.blog.repository.model.Board;
import com.tenco.blog.service.BoardService;


@Controller
public class BoardController {

	
	private final BoardService boardService;
	@Autowired
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	
    @GetMapping("/")
    public String index(Model model) {
    	
    	List<Board> boardList = boardService.allBoard();
    	
    	model.addAttribute("boardList",boardList);
        return "index";
    }

    @GetMapping("/board/saveForm")
    public String saveForm() {
        return "board/saveForm";
    }

    @GetMapping("/board/{id}/updateForm")
    public String updateForm(@PathVariable("id") int id, Model model) {
    	Board board = boardService.findForUpdate(id);
    	model.addAttribute("boardList",board);
    	model.addAttribute("id", id);
        return "board/uploadForm";
    }

    @PostMapping("/board/save")
    public String save(BoardDTO dto){
    	boardService.newWriting(dto);
        return "redirect:/";
    }

    @PostMapping("/board/update/{id}")
    public String update(BoardDTO boardDTO, @PathVariable(name = "id") Integer id, BoardDTO dto) {
       int boardTemp = boardService.uploadWriting(id ,dto);
        
        return "redirect:/";
    }

    @GetMapping("/board/{id}/delete")
    public String delete(@PathVariable("id") int id){
    	boardService.deletWriting(id);
        return "redirect:/";
    }
}
