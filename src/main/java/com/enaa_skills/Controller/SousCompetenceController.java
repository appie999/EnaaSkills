package com.enaa_skills.Controller;

import com.enaa_skills.Dto.SousCompetenceDto;
import com.enaa_skills.Service.SousCompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/souscompetence")
public class SousCompetenceController {

    @Autowired
    private SousCompetenceService service;


    @PostMapping
    public SousCompetenceDto saveSousCompetence(@RequestBody SousCompetenceDto dto){
        return service.saveSousCompetence(dto);
    }

    @GetMapping("/{id}")
    public SousCompetenceDto getSousCompetenceById(@PathVariable Long id){
        return service.getSousCompetenceById(id);
    }

    @GetMapping
    public List<SousCompetenceDto> getAllSousCompetences(){
        return service.getAllSousCompetences();
    }

    @PutMapping("/{id}")
    public SousCompetenceDto editSousCompetence(@PathVariable Long id, @RequestBody SousCompetenceDto dto){
        return service.editSousCompetence(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deleteSousCompetence(@PathVariable Long id){
        service.deleteSousCompetence(id);
    }

}
