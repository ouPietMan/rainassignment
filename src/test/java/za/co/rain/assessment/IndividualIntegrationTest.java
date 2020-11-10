package za.co.rain.assessment;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.client.RestTemplate;
import za.co.rain.assessment.mapper.IndividualMapper;
import za.co.rain.assessment.model.Individual;
import za.co.rain.assessment.repository.IndividualRepository;
import za.co.rain.assessment.service.IndividualService;
import za.co.rain.assessment.service.IndividualServiceImpl;

@SpringBootTest
public class IndividualIntegrationTest {

    @Autowired
    IndividualRepository individualRepository;
    @Autowired
    IndividualMapper individualMapper;


    @Mock
    RestTemplate restTemplate;

    @InjectMocks
    IndividualService individualService = new IndividualServiceImpl(individualMapper, individualRepository);

    @Test
    public void findIndividual(){
        individualService.findIndividual("id");

    }
}
