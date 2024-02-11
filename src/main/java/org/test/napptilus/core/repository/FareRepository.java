package org.test.napptilus.core.repository;

import org.test.napptilus.core.model.Fare;

import java.time.LocalDateTime;
import java.util.List;

public interface FareRepository {

    List<Fare> retrieveApplicableFares(LocalDateTime activationDate, String productId, String brandId);
}
