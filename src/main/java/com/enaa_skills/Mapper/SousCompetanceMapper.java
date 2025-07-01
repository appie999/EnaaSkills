package com.enaa_skills.Mapper;

import com.enaa_skills.Dto.SousCompetenceDto;
import com.enaa_skills.Entity.SousCompetence;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SousCompetanceMapper {

    SousCompetenceDto toDto(SousCompetence entity);
    SousCompetence toEntity(SousCompetenceDto dto);
}
