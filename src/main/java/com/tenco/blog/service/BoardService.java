package com.tenco.blog.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tenco.blog.dto.BoardDTO;
import com.tenco.blog.repository.interfaces.BoardRepository;
import com.tenco.blog.repository.model.Board;

@Service
public class BoardService {

	private final BoardRepository boardRepository;
	
	@Autowired
	public BoardService(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}
	public List<Board> allBoard(){
		List<Board> boardListEntity = null; 
		try {
			boardListEntity = boardRepository.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return boardListEntity;
	}
	
	@Transactional
	public void newWriting(BoardDTO dto) {
	int result = 0;
		try {
			result = boardRepository.insert(dto.toBoard());
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	@Transactional
	public int  uploadWriting( int id , BoardDTO dto) {
		int resultRow = boardRepository.updateById(id, dto.getTitle(),dto.getName(), dto.getContent());
	return resultRow;
	
	}
	@Transactional
	public Board findForUpdate(int id) {
	Board boardListEntity = boardRepository.findById(id);
		return boardListEntity;
				
	}
	
	
	
	@Transactional
	public void deletWriting(int id) {
		int result =0;
		try {
			result = boardRepository.deleteById(id);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}
	
	
	
	

}
