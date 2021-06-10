package com.oyo.OYO.Extension.model;

import com.oyo.OYO.Extension.enums.Currency;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderRequestOYO {
    private List<ProductsOYO> products;
    private String bookingId;
    private String userProfileId;
    private Boolean isPaid;
    private String category;
    private Currency currency;
}
