package org.test.napptilus.core.service;

import org.test.napptilus.core.model.Fare;

import java.time.LocalDateTime;

public interface FareService {
    Fare retriveApplicableFare(LocalDateTime applicationDate, String productId, String brandId);
}
