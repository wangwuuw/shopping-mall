/**
 * 
 */
package com.beidoudxt.entity.response;

import java.util.List;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

import com.beidoudxt.common.OrderStatus;
import com.beidoudxt.entity.presistent.OrderProduct;

/**
 * @Company 北斗大学堂 qq群：903672759 
 * @author 令狐冲老师 qq号 1058737002
 * @Description: 
 * @date: 2019年12月22日下午5:41:31
 */
@Getter
@Setter
public class OrderResponse {
	@NotBlank
	private long id;
	@NotBlank
	private List<OrderProduct> products;
	@NotBlank
	private long userId;
	@NotBlank
	private OrderStatus status;
	
}
