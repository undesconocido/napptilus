package org.test.napptilus.inbound.rest.mapper;

import org.springframework.stereotype.Component;
import org.test.napptilus.core.model.Fare;
import org.test.napptilus.inbound.rest.dto.FareDto;

@Component
public final class FareDtoMapper {
    public FareDto toDto(Fare fare) {
        return new FareDto(
                fare.getProductId(),
                fare.getBrandId(),
                fare.getPriority(),
                fare.getPrice().toString(),
                fare.getCurrency());
    }
}

