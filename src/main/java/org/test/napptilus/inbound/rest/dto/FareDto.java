package org.test.napptilus.inbound.rest.dto;

import lombok.NonNull;

public record FareDto(
        @NonNull String productId,
        @NonNull String brandId,
        int priority,
        @NonNull String price,
        @NonNull String currency
) {
}
