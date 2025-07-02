package com.enaa_skills.Service;


import com.enaa_skills.Dto.SousCompetenceDto;
import com.enaa_skills.Entity.SousCompetence;
import com.enaa_skills.Mapper.SousCompetenceMapper;
import com.enaa_skills.Repository.SousCompetenceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SousCompetenceService {


    @Autowired
    private SousCompetenceMapper mapper;

    @Autowired
    private SousCompetenceRepo repo;


    public SousCompetenceDto saveSousCompetence(SousCompetenceDto sousCompetenceDto){
        return mapper.toDto(repo.save(mapper.toEntity(sousCompetenceDto)));
    }

    public SousCompetenceDto getSousCompetenceById(Long id){
        return mapper.toDto(repo.findById(id).orElseThrow(()->new RuntimeException("SousCompetence not found")));
    }

    public List<SousCompetenceDto> getAllSousCompetences(){
        return repo.findAll().stream().map(sousCompetence -> mapper.toDto(sousCompetence)).toList();
    }

    public SousCompetenceDto editSousCompetence(Long id, SousCompetenceDto sousCompetenceDto){
        SousCompetence sousCompetence = repo.findById(id).get();
        sousCompetence.setId(sousCompetenceDto.getId());
        sousCompetence.setName(sousCompetenceDto.getName());
        sousCompetence.setDescription(sousCompetenceDto.getDescription());
        sousCompetence.setValidated(sousCompetenceDto.getValidated());
        return mapper.toDto(repo.save(sousCompetence));
    }

    public void deleteSousCompetence(Long id){
        repo.deleteById(id);
    }
}
