package com.enaa_skills.Service;

import com.enaa_skills.Dto.CompetenceDto;
import com.enaa_skills.Entity.Competence;
import com.enaa_skills.Mapper.CompetenceMapper;
import com.enaa_skills.Repository.CompetenceRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CompetenceService {

    private final CompetenceRepo repo;

    private final CompetenceMapper mapper;

    public CompetenceDto saveCompetence(CompetenceDto competenceDto){
        return mapper.toDto(repo.save(mapper.toEntity(competenceDto)));
    }

    public CompetenceDto getCompetenceById(Long id){
        return mapper.toDto(repo.findById(id).orElseThrow(()->new RuntimeException("competance not found")));
    }

    public List<CompetenceDto> getAllCompetences(){
        return repo.findAll().stream().map(competence -> mapper.toDto(competence)).toList();
    }

    public CompetenceDto editCompetence(Long id, CompetenceDto competenceDto){
        Competence competence = repo.findById(id).get();
        competence.setId(competenceDto.getId());
        competence.setName(competenceDto.getName());
        competence.setDescription(competenceDto.getDescription());

        return mapper.toDto(repo.save(competence));
    }

    public void deleteCompetence(Long id){
        repo.deleteById(id);
    }

}
