package za.co.rain.assessment.service;

import za.co.rain.assessment.model.Individual;

import java.util.List;


public interface IndividualService {

    Individual findIndividual(String id);
    List<Individual> findAllIndividuals();
    Individual createIndividual(Individual individual);
    void deleteIndividual(String id);
    void updateIndividual(Individual individual);
}
