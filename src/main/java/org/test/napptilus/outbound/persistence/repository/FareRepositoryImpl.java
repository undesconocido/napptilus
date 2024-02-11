package org.test.napptilus.outbound.persistence.repository;

import org.springframework.stereotype.Service;
import org.test.napptilus.core.model.Fare;
import org.test.napptilus.core.repository.FareRepository;
import org.test.napptilus.outbound.persistence.mapper.FareMapper;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FareRepositoryImpl implements FareRepository {
    private final FareJpaRepository fareJpaRepository;
    private final FareMapper fareMapper;

    public FareRepositoryImpl(final FareJpaRepository fareJpaRepository,
                              final FareMapper fareMapper) {
        this.fareJpaRepository = fareJpaRepository;
        this.fareMapper = fareMapper;
    }

    @Override
    public List<Fare> retrieveApplicableFares(final LocalDateTime activationDate,
                                              final String productId,
                                              final String brandId) {
        return fareJpaRepository.retrieveApplicableFares(activationDate, productId, brandId)
                .stream()
                .map(fareMapper::toModel)
                .toList();
    }
}
