package za.co.rain.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.rain.assessment.entity.IndividualEntity;


public interface IndividualRepository extends JpaRepository<IndividualEntity, String> {

}
