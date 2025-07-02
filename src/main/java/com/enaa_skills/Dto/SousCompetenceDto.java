package com.enaa_skills.Dto;

import com.enaa_skills.Entity.Competence;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SousCompetenceDto {
    private Long id;
    private String name;
    private String description;
    private Boolean validated;
    private Long competenceId;
}
