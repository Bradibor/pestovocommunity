package xyz.bradibarus.pestovocommunity.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private String email;
    @Enumerated(EnumType.STRING)
    private MemberType memberType;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Passport passport;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Joined joined;

    public void setPassport(Passport passport) {
        this.passport = passport;
        passport.setMember(this);
    }

    public void setJoined(Joined joined) {
        this.joined = joined;
        joined.setMember(this);
    }

    static public enum MemberType {
        JOINED, NOT_JOINED;
    }
}
