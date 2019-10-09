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
public class Joined {
    @Id
    private Long id;
    private String protocolNumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate joinDate;
    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private Member member;
}
