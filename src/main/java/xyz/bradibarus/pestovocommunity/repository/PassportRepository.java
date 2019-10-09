package xyz.bradibarus.pestovocommunity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import xyz.bradibarus.pestovocommunity.model.Passport;

public interface PassportRepository extends JpaRepository<Passport, Long> {
}
