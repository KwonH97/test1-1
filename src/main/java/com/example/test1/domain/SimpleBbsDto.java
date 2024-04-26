package com.example.test1.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimpleBbsDto {
	
	private int id;
	private String writer;
	private String title;
	private String content;
	
}
