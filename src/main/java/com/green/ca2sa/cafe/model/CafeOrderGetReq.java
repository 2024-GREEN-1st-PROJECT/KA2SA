package com.green.ca2sa.cafe.model;

import com.green.ca2sa.common.model.Paging;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.BindParam;

@Getter
@Setter
public class CafeOrderGetReq extends Paging {
    @Schema(name = "cafe_id", requiredMode = Schema.RequiredMode.REQUIRED)
    private long cafeId;

    public CafeOrderGetReq(Integer page, Integer size,@BindParam("cafe_id") long cafeId) {
        super(page, size);
        this.cafeId = cafeId;
    }
}
