package xyz.bradibarus.pestovocommunity.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passport {
    @Id
    private Long id;
    private String authorityName;
    private String authorityCode;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String address;
    private String series;
    private String number;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Member member;
}
