package za.co.rain.assessment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rain.assessment.entity.IndividualEntity;
import za.co.rain.assessment.exception.IndividualNotFoundException;
import za.co.rain.assessment.mapper.IndividualMapper;
import za.co.rain.assessment.model.Individual;
import za.co.rain.assessment.repository.IndividualRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class IndividualServiceImpl implements IndividualService{

    private final IndividualMapper individualMapper;
    private final IndividualRepository entityRepository;

    @Autowired
    public IndividualServiceImpl(IndividualMapper individualMapper, IndividualRepository entityRepository) {
        this.individualMapper = individualMapper;
        this.entityRepository = entityRepository;
    }

    @Override
    public Individual findIndividual(String id) {
        return entityRepository.findById(id)
                .map(individualMapper::toDto)
                .orElseThrow(IndividualNotFoundException::new);
    }

    @Override
    public List<Individual> findAllIndividuals() {
        return entityRepository.findAll().stream()
                .map(individualMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public Individual createIndividual(Individual individual) {
        IndividualEntity individualEntity = individualMapper.fromDto(individual);
        IndividualEntity save = entityRepository.save(individualEntity);
        return individualMapper.toDto(save);
    }

    @Override
    public void deleteIndividual(String id) {
        entityRepository.deleteById(id);
    }

    @Override
    public void updateIndividual(Individual individual) {
        IndividualEntity individualEntity = individualMapper.fromDto(individual);
        entityRepository.save(individualEntity);

    }
}
