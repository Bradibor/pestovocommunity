package xyz.bradibarus.pestovocommunity.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import xyz.bradibarus.pestovocommunity.model.Joined;
import xyz.bradibarus.pestovocommunity.model.Member;
import xyz.bradibarus.pestovocommunity.model.Passport;

import java.time.LocalDate;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberRepositoryTest {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    JoinedRepository joinedRepository;
    @Autowired
    PassportRepository passportRepository;

    @Test
    public void saveAndGet() {
        Member member = Member.builder().memberType(Member.MemberType.NOT_JOINED)
                .address("Shokalslolo 11")
                .email("bradibaruS@gmail.com")
                .firstName("sergey")
                .lastName("bredid")
                .middleName("alekseevich")
                .phone("+79150453350")
                .build();
        member = memberRepository.save(member);
        member = memberRepository.findById(member.getId()).orElse(null);
        assert member != null;
        assert "Shokalslolo 11".equals(member.getAddress());
    }

    @Test
    public void saveAllAndGet() throws InterruptedException {
        Member member = Member.builder().memberType(Member.MemberType.NOT_JOINED)
                .address("Shokalslolo 11")
                .email("bradibaruS@gmail.com")
                .firstName("sergey")
                .lastName("bredid")
                .middleName("alekseevich")
                .phone("+79150453350")
                .build();
        Joined joined = Joined.builder()
                .joinDate(LocalDate.now())
                .protocolNumber("123")
                .build();
        Passport passport = Passport.builder()
                .authorityCode("987123")
                .authorityName("ОУВД КЕк")
                .date(LocalDate.now())
                .series("4519")
                .number("163829")
                .build();
        member.setJoined(joined);
        member.setPassport(passport);
        joined.setMember(member);
        passport.setMember(member);
        member = memberRepository.save(member);
        member = memberRepository.findById(member.getId()).orElse(null);
        assert member != null;
        assert "Shokalslolo 11".equals(member.getAddress());
        assert member.getJoined() != null;
        assert member.getPassport() != null;
    }
}
