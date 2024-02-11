package org.test.napptilus.outbound.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.test.napptilus.outbound.persistence.entity.FareEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public interface FareJpaRepository extends JpaRepository<FareEntity, UUID> {

    @Query(value = """
            SELECT f FROM FareEntity f
            WHERE f.startDate <= :activationDate AND f.endDate >= :activationDate
            AND f.productId = :productId
            AND f.brandId = :brandId
            """
    )
    List<FareEntity> retrieveApplicableFares(
            @Param("activationDate") LocalDateTime activationDate,
            @Param("productId") String productId,
            @Param("brandId") String brandId
    );
}
