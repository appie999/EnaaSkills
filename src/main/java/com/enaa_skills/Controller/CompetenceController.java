package com.enaa_skills.Controller;

import com.enaa_skills.Dto.CompetenceDto;
import com.enaa_skills.Service.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/competence")
public class CompetenceController {

    @Autowired
    private CompetenceService competenceService;

    @PostMapping
    public CompetenceDto saveCompetence(@RequestBody CompetenceDto competenceDto){
        return competenceService.saveCompetence(competenceDto);
    }

    @GetMapping
    public List<CompetenceDto> getAllCompetences(){
        return competenceService.getAllCompetences();
    }

    @GetMapping("/{id}")
    public CompetenceDto getCompetenceById(@PathVariable Long id){
        return competenceService.getCompetenceById(id);
    }

    @PutMapping("/{id}")
    public CompetenceDto editCompetence(@PathVariable Long id, @RequestBody CompetenceDto competenceDto){
        return competenceService.editCompetence(id, competenceDto);
    }

    @DeleteMapping("/{id}")
    public void deleteCompetance(@PathVariable Long id){
        competenceService.deleteCompetence(id);
    }
}
