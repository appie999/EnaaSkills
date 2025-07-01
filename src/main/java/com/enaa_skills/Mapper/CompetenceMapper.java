package com.enaa_skills.Mapper;

import com.enaa_skills.Dto.CompetenceDto;
import com.enaa_skills.Entity.Competence;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CompetenceMapper {

    CompetenceDto toDto(Competence entity);
    Competence toEntity(CompetenceDto dto);
}
