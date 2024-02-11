package org.test.napptilus.core.model;

import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Value
@Builder
public class Fare {

    @NonNull
    String brandId;

    @NonNull
    LocalDateTime startDate;

    @NonNull
    LocalDateTime endDate;

    int priceList;

    @NonNull
    String productId;

    int priority;

    @NonNull
    BigDecimal price;

    @NonNull
    String currency;
}
