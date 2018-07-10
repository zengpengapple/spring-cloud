package org.example.product.client;

import java.util.List;

import org.example.order.common.vo.CartVo;
import org.example.product.common.vo.ProductInfoVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import lombok.extern.slf4j.Slf4j;



@FeignClient(name="product",fallback=ProductClient.ProductClientFallback.class)
public interface ProductClient{
   
	@PostMapping("/findByIds")
	List<ProductInfoVo> findByIds(@RequestBody List<String> ids);
	
	@PostMapping("/decreaseStock")
	void decreaseStock(@RequestBody List<CartVo> CartVos);
	
	@Component
	@Slf4j
	static class ProductClientFallback implements ProductClient{

		@Override
		public List<ProductInfoVo> findByIds(List<String> ids) {
			log.warn("product fallback");
			return null;
		}

		@Override
		public void decreaseStock(List<CartVo> CartVos) {
			
			log.warn("product fallback");
		}
		
	}

	
}
