package za.co.rain.assessment.mapper;

import org.mapstruct.Mapper;
import za.co.rain.assessment.entity.IndividualEntity;
import za.co.rain.assessment.entity.IndividualUpdateEntity;
import za.co.rain.assessment.model.Individual;
import za.co.rain.assessment.model.IndividualUpdate;

@Mapper
public interface IndividualUpdateMapper {
    IndividualUpdate toDto(IndividualUpdateEntity individualEntity);
    IndividualUpdateEntity fromDto(IndividualUpdate individual);

}
