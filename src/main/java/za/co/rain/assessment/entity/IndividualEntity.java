package za.co.rain.assessment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IndividualEntity {
    @Id
    private String id;
    private String href;
    private String aristocraticTitle;
    private OffsetDateTime birthDate;
    private String countryOfBirth;
    private OffsetDateTime deathDate;
    private String familyName;
    private String fullName;
    private String gender;
}
