package com.tenco.blog.dto;

import java.sql.Timestamp;

import com.tenco.blog.repository.model.Board;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BoardDTO {
	private Integer id;
	private String name;
	private String title;
	private String content;
	private Timestamp createdAt;
	
	public Board toBoard() {
		return Board.builder()
				.name(this.name)
				.title(this.title)
				.content(this.content)
				.build();
	}
}
