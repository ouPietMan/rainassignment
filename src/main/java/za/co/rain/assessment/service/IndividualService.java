package za.co.rain.assessment.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import za.co.rain.assessment.model.Individual;
import za.co.rain.assessment.model.IndividualCreate;
import za.co.rain.assessment.model.IndividualUpdate;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
public interface IndividualService {
    Individual createIndividual(@Valid final IndividualCreate individual);
    Individual deleteIndividual(final String id);
    List<Individual> listIndividual(final Optional<String> fields,
                                                           final Optional<Integer> offset,
                                                           final Optional<Integer> limit);
    Individual patchIndividual(final String id, final IndividualUpdate individual);
    Individual retrieveIndividual(final String id, final Optional<String> fields);


}
