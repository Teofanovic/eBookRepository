package com.sf13.uros.eBookRepository.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class EBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "title", nullable = false, length = 80)
	private String title;

	@Column(name = "author", nullable = true, length = 120)
	private String author;

	@Column(name = "keywords", nullable = true, length = 120)
	private String keywords;

	@Column(name = "year", nullable = true)
	private int year;

	@Column(name = "filename", nullable = false, length = 200)
	private String filename;

	@Column(name = "MIME", nullable = true, length = 100)
	private String MIME;

	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
