package com.ruifucredit.cloud.inventory.support.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class Stock {
	
	public static final String YES_STATUS = "Y";
	public static final String NO_STATUS = "N";
	
	private Long stockId;
	private Long goodsId;
	private Long subGoodsId;
	private BigDecimal stockNumber;
	private Date createTime;
	private Date updateTime;
	private String stockStatus;
	
}
