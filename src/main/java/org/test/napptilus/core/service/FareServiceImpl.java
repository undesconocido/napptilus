package org.test.napptilus.core.service;

import org.springframework.stereotype.Service;
import org.test.napptilus.core.model.Fare;
import org.test.napptilus.core.repository.FareRepository;

import java.time.LocalDateTime;
import java.util.NoSuchElementException;

import static java.util.Comparator.comparingInt;

@Service
public class FareServiceImpl implements FareService {

    private final FareRepository fareRepository;

    public FareServiceImpl(final FareRepository fareRepository) {
        this.fareRepository = fareRepository;
    }

    @Override
    public Fare retriveApplicableFare(final LocalDateTime applicationDate, final String productId, final String brandId) {
        return fareRepository.retrieveApplicableFares(applicationDate, productId, brandId)
                .stream()
                .max(comparingInt(Fare::getPriority))
                .orElseThrow(() -> new NoSuchElementException("No fare found for the given parameters"));
    }
}
