package za.co.rain.assessment.mapper;

import org.mapstruct.Mapper;
import za.co.rain.assessment.entity.IndividualCreateEntity;
import za.co.rain.assessment.entity.IndividualEntity;
import za.co.rain.assessment.model.Individual;
import za.co.rain.assessment.model.IndividualCreate;

@Mapper
public interface IndividualCreateMapper {
    IndividualCreate toDto(IndividualCreateEntity individualEntity);
    IndividualCreateEntity fromDto(IndividualCreate individual);

}
