package za.co.rain.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.rain.assessment.entity.IndividualEntity;


@Repository
public interface IndividualRepository extends JpaRepository<IndividualEntity, String> {

}
