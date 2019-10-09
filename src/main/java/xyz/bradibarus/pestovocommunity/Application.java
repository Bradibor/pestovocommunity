package xyz.bradibarus.pestovocommunity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.json.GsonBuilderUtils;
import xyz.bradibarus.pestovocommunity.model.Member;
import xyz.bradibarus.pestovocommunity.repository.MemberRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class Application {
    @Autowired
    MemberRepository memberRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
