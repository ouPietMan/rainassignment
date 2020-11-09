package za.co.rain.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import za.co.rain.assessment.model.Individual;
import za.co.rain.assessment.model.IndividualCreate;
import za.co.rain.assessment.model.IndividualUpdate;
import za.co.rain.assessment.repository.IndividualRepository;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class IndividualServiceImpl implements IndividualService {


    @Override
    public Individual createIndividual(final IndividualCreate individual) {
        Individual individualLocal = new Individual();
        individualLocal.setId(individual.getId());
        individualLocal.setHref(individual.getHref());
        individualLocal.setAristocraticTitle(individual.getAristocraticTitle());
        individualLocal.setBirthDate(individual.getBirthDate());
        individualLocal.setCountryOfBirth(individual.getCountryOfBirth());
        individualLocal.setDeathDate(individual.getDeathDate());
        individualLocal.setFamilyName(individual.getFamilyName());
        individualLocal.setFullName(individual.getFullName());
        individualLocal.setGender(individual.getGender());

        return null;
    }

    @Override
    public Individual deleteIndividual(String id) {
        return null;
    }

    @Override
    public List<Individual> listIndividual(Optional<String> fields, Optional<Integer> offset, Optional<Integer> limit) {
        return null;
    }

    @Override
    public Individual patchIndividual(String id, IndividualUpdate individual) {
        return null;
    }

    @Override
    public Individual retrieveIndividual(String id, Optional<String> fields) {
        return null;
    }
}
