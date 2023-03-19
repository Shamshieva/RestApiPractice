package com.manas.dto.request;

import com.manas.enums.HouseType;
import com.manas.enums.Region;

import java.math.BigDecimal;
import java.util.List;

public record AnnouncementRequest(
        List<String> images,
        HouseType houseType,
        Integer maxOfGuests,
        BigDecimal price,
        String title,
        String description,
        Region region,
        String city,
        String address
) {
}
