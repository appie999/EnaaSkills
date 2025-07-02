package com.enaa_skills.Mapper;

import com.enaa_skills.Dto.SousCompetenceDto;
import com.enaa_skills.Entity.SousCompetence;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface SousCompetenceMapper {

    @Mapping(source = "competence.id" , target = "competenceId")
    SousCompetenceDto toDto(SousCompetence competence);

    @Mapping(target= "competence.id" , source = "competenceId")
    SousCompetence toEntity(SousCompetenceDto dto);
}
