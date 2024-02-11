package org.test.napptilus.outbound.persistence.mapper;

import org.springframework.stereotype.Component;
import org.test.napptilus.core.model.Fare;
import org.test.napptilus.outbound.persistence.entity.FareEntity;

@Component
public final class FareMapper {
    public Fare toModel(FareEntity fareEntity) {
        return Fare.builder()
                .brandId(fareEntity.getBrandId())
                .startDate(fareEntity.getStartDate())
                .endDate(fareEntity.getEndDate())
                .priceList(fareEntity.getPriceList())
                .productId(fareEntity.getProductId())
                .priority(fareEntity.getPriority())
                .price(fareEntity.getPrice())
                .currency(fareEntity.getCurrency())
                .build();
    }
}
