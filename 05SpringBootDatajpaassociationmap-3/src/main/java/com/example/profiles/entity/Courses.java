package com.example.profiles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="crstab")
public class Courses {
	@Id
	@Column(name="cid")
	private Integer courseId;
	
	@Column(name="cname")
	private String courseName;
	
	@Column(name="ccost")
	private Double courseCost;
}
