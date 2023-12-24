package com.sikku;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "OPTIONAl")
public class OptionalData {
	@Id
	private Integer key;
	private String value;

}
