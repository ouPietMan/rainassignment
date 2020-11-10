package za.co.rain.assessment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.OffsetDateTime;

@Entity
public class IndividualCreateEntity {
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
