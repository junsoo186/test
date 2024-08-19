package com.tenco.blog.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.tenco.blog.dto.BoardDTO;
import com.tenco.blog.repository.model.Board;

@Mapper
public interface BoardRepository {
	public int insert(Board board);
	public int updateById( @Param("id")int id,@Param("name") String name ,@Param("title") String title,
			@Param("content") String content);
	public Board findById(int id);
	public List<Board> findAll();
	public int deleteById(int id);
}
