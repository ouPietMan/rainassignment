package za.co.rain.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.rain.assessment.api.IndividualApi;
import za.co.rain.assessment.model.Individual;
import za.co.rain.assessment.service.IndividualService;

import java.util.List;
import java.util.Optional;

@RestController
public class IndividualController implements IndividualApi {


    private final IndividualService individualService;

    @Autowired
    public IndividualController(IndividualService individualService) {
        this.individualService = individualService;
    }

    @Override
    @PostMapping("/individual")
    public ResponseEntity<Individual> createIndividual(@RequestBody final Individual individual) {
        Individual individualCreated = individualService.createIndividual(individual);
        return new ResponseEntity<>(individualCreated, HttpStatus.CREATED);
    }

    @Override
    @DeleteMapping("/individual/{id}")
    public ResponseEntity<Void> deleteIndividual(final @PathVariable String id) {
        individualService.deleteIndividual(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @Override
    @GetMapping("/individual")
    public ResponseEntity<List<Individual>> listIndividual(final Optional<String> fields,
                                                           final Optional<Integer> offset,
                                                           final Optional<Integer> limit) {
        List<Individual> allIndividuals = individualService.findAllIndividuals();
        return new ResponseEntity<>(allIndividuals, HttpStatus.OK);
    }

    @Override
    @PatchMapping("/individual/{id}")
    public ResponseEntity<Individual> patchIndividual(final @PathVariable String id, @RequestBody final Individual individual) {
        individualService.updateIndividual(individual);
        return new ResponseEntity<>(individual, HttpStatus.OK);
    }

    @Override
    @GetMapping("/individual/{id}")
    public ResponseEntity<Individual> retrieveIndividual(final @PathVariable String id, final Optional<String> fields) {
        Individual individual = individualService.findIndividual(id);
        return new ResponseEntity(individual, HttpStatus.OK);
    }
}
