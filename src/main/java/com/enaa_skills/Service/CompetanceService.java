package com.enaa_skills.Service;

import com.enaa_skills.Dto.CompetenceDto;
import com.enaa_skills.Entity.Competence;
import com.enaa_skills.Mapper.CompetenceMapper;
import com.enaa_skills.Repository.CompetanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetanceService {

    @Autowired
    private CompetanceRepo repo;

    @Autowired
    private CompetenceMapper mapper;

    public CompetenceDto saveCompetance(CompetenceDto competenceDto){
        return mapper.toDto(repo.save(mapper.toEntity(competenceDto)));
    }

    public CompetenceDto getCompetanceById(Long id){
        return mapper.toDto(repo.findById(id).orElseThrow(()->new RuntimeException("competance not found")));
    }

    public List<CompetenceDto> getAllCompetances(){
        return repo.findAll().stream().map(competence -> mapper.toDto(competence)).toList();
    }

    public CompetenceDto editCompetance(Long id, CompetenceDto competenceDto){
        Competence competence = repo.findById(id).get();
        competence.setId(competenceDto.getId());
        competence.setName(competenceDto.getName());
        competence.setDescription(competenceDto.getDescription());

        return mapper.toDto(repo.save(competence));
    }

    public void deleteCompetance(Long id){
        repo.deleteById(id);
    }

}
