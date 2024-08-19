package com.tenco.blog.repository.model;

import java.sql.Timestamp;
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
public class Board {
	private int id;
	private String name;
	private String title;
	private String content;
	private Timestamp createdAt;
}
