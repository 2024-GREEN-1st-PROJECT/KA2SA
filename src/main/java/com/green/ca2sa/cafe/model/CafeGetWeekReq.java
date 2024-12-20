package com.green.ca2sa.cafe.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.BindParam;

@Getter
@Setter
public class CafeGetWeekReq {
    @Schema(name = "days_ago")
    private String daysAgo;
    @Schema(name = "cafe_id")
    private long cafeId;
    @Schema(name = "order_progress")
    private int orderProgress;
    private String today;

    public CafeGetWeekReq(@BindParam("days_ago") String daysAgo,@BindParam("cafe_id") long cafeId,
                          @BindParam("order_progress")int orderProgress, String today) {
        this.daysAgo = daysAgo;
        this.cafeId = cafeId;
        this.orderProgress = orderProgress;
        this.today = today;
    }
}
