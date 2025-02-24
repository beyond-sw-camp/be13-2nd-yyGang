package com.beyond3.yyGang.cart.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CartOptionDto {

    @NotNull
    private Long productId;

    @Min(value = 1, message = "최소 1개 이상 장바구니에 담아야 한다")
    private int count;

}