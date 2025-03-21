package com.beyond3.yyGang.order.dto;

import com.beyond3.yyGang.nsupplement.NSupplement;
import com.beyond3.yyGang.order.domain.Order;
import com.beyond3.yyGang.order.domain.OrderOption;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderOptionDto {

    private long nSupplementId;     // 영양제 아이디

    private String nSupplementName; // 영양제 이름

    private int quantity;  // 수량

    private int price;    // 상품 가격

    private int totalPrice; // 전체 가격

    public OrderOptionDto(OrderOption orderOption) {
        this.nSupplementId = orderOption.getNSupplement().getProductId();
        this.nSupplementName = orderOption.getNSupplement().getProductName();
        this.quantity = orderOption.getQuantity();
        this.price = orderOption.getNSupplement().getPrice();
        this.totalPrice = orderOption.getPrice();
    }

}