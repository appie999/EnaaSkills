package com.enaa_skills.Controller;

import com.enaa_skills.Dto.CompetenceDto;
import com.enaa_skills.Service.CompetanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/competence")
public class CompetenceController {

    @Autowired
    private CompetanceService competanceService;

    @PostMapping("/")
    public CompetenceDto saveCompetence(@RequestBody CompetenceDto competenceDto){
        return competanceService.saveCompetance(competenceDto);
    }

    @GetMapping
    public List<CompetenceDto> getAllCompetences(){
        return competanceService.getAllCompetances();
    }

    @GetMapping("/{id}")
    public CompetenceDto getCompetenceById(@PathVariable Long id){
        return competanceService.getCompetanceById(id);
    }

    @PutMapping("/{id}")
    public CompetenceDto editCompetence(@PathVariable Long id, @RequestBody CompetenceDto competenceDto){
        return competanceService.editCompetance(id, competenceDto);
    }

    @DeleteMapping("/")
    public void deleteCompetance(Long id){
        competanceService.deleteCompetance(id);
    }
}
