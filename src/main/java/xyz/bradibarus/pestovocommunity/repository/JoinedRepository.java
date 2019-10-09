package xyz.bradibarus.pestovocommunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.bradibarus.pestovocommunity.model.Joined;

public interface JoinedRepository extends JpaRepository<Joined, Long> {
}
