package com.example.demo.entity;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
@Table(name = "tb_empleado")
public class Empleado {

	@Id
	@Column(name = "dni_empleado",nullable = false, length = 8)
	private String dniEmpleado;
	
	@Column(name = "nombre_empleado", nullable=false, length = 45)
	private String nombreEmpleado;
	
	@Column(name = "apellido_empleado", nullable=false, length = 45)
	private String apellidoEmpleado;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", nullable=false)
	private LocalDate fechaNacimiento;
	
	@Column(name = "direccion", nullable=false, length = 45)
	private	String direccion;
	
	@Column(name = "correo", nullable=false, length = 45, unique = true)
	private String Correo;
	
	@ManyToOne
	@JoinColumn(name = "area_id", nullable = false)
	private Area area;
	
}
