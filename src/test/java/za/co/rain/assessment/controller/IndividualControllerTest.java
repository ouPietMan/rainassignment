package za.co.rain.assessment.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.bind.annotation.GetMapping;
import za.co.rain.assessment.model.Individual;
import za.co.rain.assessment.service.IndividualService;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(IndividualController.class)
class IndividualControllerTest {

    @Autowired
    private IndividualController individualController;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IndividualService individualService; //Individual findIndividual(String id);

    @Test
    public void getIndividualByIdTest() throws Exception {
        Individual individual = new Individual();
        individual.setId("string");
        individual.setFullName("fullName");

        when(individualService.findIndividual(any())).thenReturn(individual);

        mockMvc.perform(MockMvcRequestBuilders.get("/individual/string"))
                .andDo(print())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value("string"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.fullName").value("fullName"))
                .andExpect(status().isOk());

    }

    @Test
    public void saveIndividualTest() throws Exception {
        Individual individual = new Individual();
        individual.setId("string");
        individual.setFullName("fullName");

        when(individualService.createIndividual(any())).thenReturn(individual);

        mockMvc.perform(MockMvcRequestBuilders.post("/individual/")
                .content(new ObjectMapper().writeValueAsString(individual))
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").exists())
                .andExpect(MockMvcResultMatchers.jsonPath("$.id").value("string"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.fullName").value("fullName"));

    }



}
