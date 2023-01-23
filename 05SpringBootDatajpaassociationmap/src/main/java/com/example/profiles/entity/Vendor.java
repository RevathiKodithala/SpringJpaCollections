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
@Table(name="Ventab")
public class Vendor {
	@Id
	@Column(name="Vid")
	private Integer VendorId;
	@Column(name="Vname")
	private String Vendorname;

}
