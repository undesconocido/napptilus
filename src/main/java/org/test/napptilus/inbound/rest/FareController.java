package org.test.napptilus.inbound.rest;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.test.napptilus.core.service.FareService;
import org.test.napptilus.inbound.rest.dto.FareDto;
import org.test.napptilus.inbound.rest.mapper.FareDtoMapper;

import java.time.LocalDateTime;

@RestController
public class FareController {
    private final FareService fareService;
    private final FareDtoMapper fareDtoMapper;

    public FareController(final FareService fareService,
                          final FareDtoMapper fareDtoMapper) {
        this.fareService = fareService;
        this.fareDtoMapper = fareDtoMapper;
    }

    @GetMapping("/v1/fares")
    public FareDto retrieveApplicableFare(
            @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime applicationDate,
            @RequestParam String productId,
            @RequestParam String brandId
    ) {
        return fareDtoMapper.toDto(fareService.retriveApplicableFare(applicationDate, productId, brandId));
    }
}
