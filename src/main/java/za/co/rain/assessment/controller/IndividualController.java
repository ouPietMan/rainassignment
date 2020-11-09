package za.co.rain.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import za.co.rain.assessment.api.IndividualApi;
import za.co.rain.assessment.model.Individual;
import za.co.rain.assessment.model.IndividualCreate;
import za.co.rain.assessment.model.IndividualUpdate;
import za.co.rain.assessment.service.IndividualServiceImpl;

@RestController
public class IndividualController implements IndividualApi {

    @Autowired
    private IndividualServiceImpl individualServiceImpl;

    @Override
    @PostMapping("/individual")
    public ResponseEntity<Individual> createIndividual(@RequestBody final IndividualCreate individual) {
        return ResponseEntity.ok().body(individualServiceImpl.createIndividual(individual));
    }

    @Override
    @DeleteMapping("/individual/{id}")
    public ResponseEntity<Void> deleteIndividual(final @PathVariable String id) {
        individualServiceImpl.deleteIndividual(id);
        return ResponseEntity.ok().build();
    }

    @Override
    @GetMapping("/individual")
    public ResponseEntity<List<Individual>> listIndividual(final Optional<String> fields,
                                                           final Optional<Integer> offset,
                                                           final Optional<Integer> limit) {
        return ResponseEntity.ok().body(individualServiceImpl.listIndividual(fields, offset, limit));
    }

    @Override
    @PatchMapping("/individual/{id}")
    public ResponseEntity<Individual> patchIndividual(final @PathVariable String id, @RequestBody final IndividualUpdate individual) {
        return ResponseEntity.ok().body(individualServiceImpl.patchIndividual(id, individual));
    }

    @Override
    @GetMapping("/individual/{id}")
    public ResponseEntity<Individual> retrieveIndividual(final @PathVariable String id, final Optional<String> fields) {
        return ResponseEntity.ok().body(individualServiceImpl.retrieveIndividual(id, fields));
    }
}
