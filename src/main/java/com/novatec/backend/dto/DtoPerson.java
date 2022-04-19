package com.novatec.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoPerson {
    private Long id;
    private String name;
    private String secondName;
    private String lastName;
    private String secondLastName;
    private String documentNumber;
}
