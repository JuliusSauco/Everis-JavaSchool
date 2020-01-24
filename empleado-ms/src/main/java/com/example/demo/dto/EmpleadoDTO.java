package com.example.demo.dto;

import java.util.Date;
import javax.validation.constraints.PastOrPresent;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpleadoDTO {

		private Long idEmpleado;
		
		private String nombre;
		
		@JsonProperty("apellido_paterno")
		private String apellidoPaterno;
		
		@JsonProperty("apellido_materno")
		private String apellidoMaterno;
		
		private String dni;
		
		@PastOrPresent
		@JsonProperty("fecha_ingreso")
		private Date fechaIngreso;
		
		private Boolean activo;
		
		private String empresa;
}
