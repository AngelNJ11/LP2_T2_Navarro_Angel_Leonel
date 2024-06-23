package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "tb_area")
public class Area {
	
	@Id
	@Column(name = "area_id", nullable = false)
	private Integer areaId;
	
	@Column(name = "nombre_area", nullable = false, length = 45)
	private String nombreArea;
}
