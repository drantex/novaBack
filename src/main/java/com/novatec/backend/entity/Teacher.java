package com.novatec.backend.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Table(name = "teachers")
@Entity
public class Teacher implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    
    @Column(name = "second_name", length = 50, nullable = true)
    private String secondName;
    
    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;
    
    @Column(name = "second_lastname", length = 50, nullable = true)
    private String secondLastName;    
    
    @Column(name = "document_number", length = 50, nullable = false, unique = true)
    private String documentNumber;
}
