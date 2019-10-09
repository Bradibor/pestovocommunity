package xyz.bradibarus.pestovocommunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.bradibarus.pestovocommunity.model.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
