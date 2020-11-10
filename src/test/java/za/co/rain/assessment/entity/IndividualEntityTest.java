package za.co.rain.assessment.entity;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.co.rain.assessment.repository.IndividualRepository;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class IndividualEntityTest {

    private final IndividualRepository individualRepository;

    @Autowired
    IndividualEntityTest(IndividualRepository individualRepository) {
        this.individualRepository = individualRepository;
    }

    @Test
    public void dbTest(){

        IndividualEntity individual =IndividualEntity.builder()
                .id("id")
                .fullName("fullName")
                .build();

        individualRepository.save(individual);

        assertThat(individualRepository.findAll().size()).isEqualTo(1);


    }

}
