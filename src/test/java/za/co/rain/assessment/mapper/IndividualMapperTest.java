package za.co.rain.assessment.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.rain.assessment.entity.IndividualEntity;
import za.co.rain.assessment.model.Individual;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class IndividualMapperTest {

    private final IndividualMapper individualMapper;

    @Autowired
    IndividualMapperTest(IndividualMapper individualMapper) {
        this.individualMapper = individualMapper;
    }

    @Test
    void toEntity(){
        Individual individualLocal = new Individual();
        individualLocal.setFullName("fullName");

        IndividualEntity individualEntity = individualMapper.fromDto(individualLocal);

        assertThat(individualLocal.getFullName()).isEqualTo(individualEntity.getFullName());

    }

    @Test
    void fromEntity(){
        IndividualEntity individualLocal = new IndividualEntity();
        individualLocal.setFullName("fullName");

        Individual individualEntity = individualMapper.toDto(individualLocal);

        assertThat(individualLocal.getFullName()).isEqualTo(individualEntity.getFullName());

    }
}
