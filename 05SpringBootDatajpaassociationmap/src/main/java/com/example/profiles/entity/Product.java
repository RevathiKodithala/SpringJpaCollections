package com.example.profiles.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Protab")
public class Product {
	@Id
	@Column(name="pid")
	private Integer productId;
	@Column(name="pname")
	private String productname;
	@Column(name="pcost")
	private Integer cost;
	
	@ManyToOne
	@JoinColumn(name="VidFK")
	private Vendor Vob;

}
