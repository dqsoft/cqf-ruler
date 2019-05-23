package org.opencds.cqf.qdm.fivepoint4.repository;

import org.opencds.cqf.qdm.fivepoint4.model.PositiveMedicationAdministered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.annotation.Nonnull;
import java.util.Optional;

@Repository
public interface PositiveMedicationAdministeredRepository extends JpaRepository<PositiveMedicationAdministered, String>
{
    @Nonnull
    Optional<PositiveMedicationAdministered> findBySystemId(@Nonnull String id);
}