package br.com.watchwatt.watchwatt.dao;

import br.com.watchwatt.watchwatt.domain.appliance.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ApplianceRepository extends JpaRepository<Appliance, Long> {

  Optional<ApplianceRepository> findByName(String name);
}
