package za.co.rain.assessment.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.OffsetDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "individual")
@Builder
public class IndividualEntity {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @Column(name = "href")
    private String href;

    @Column(name = "aristocraticTitle")
    private String aristocraticTitle;

    @Column(name = "birthDate")
    private OffsetDateTime birthDate;

    @Column(name="countryOfBirth")
    private String countryOfBirth;

    @Column(name="deathDate")
    private OffsetDateTime deathDate;

    @Column(name = "familyName")
    private String familyName;

    @Column(name = "fullName")
    @NotBlank(message = "Full name cannot be black")
    private String fullName;

    @Column(name = "gender")
    private String gender;
}
