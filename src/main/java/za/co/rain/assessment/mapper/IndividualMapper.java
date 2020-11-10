package za.co.rain.assessment.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import za.co.rain.assessment.entity.IndividualEntity;
import za.co.rain.assessment.model.Individual;

@Mapper(componentModel = "spring")
public interface IndividualMapper {
    @Mapping(source = "fullName", target = "fullName")
    Individual toDto(IndividualEntity individualEntity);

    @InheritInverseConfiguration
    IndividualEntity fromDto(Individual individual);

}
