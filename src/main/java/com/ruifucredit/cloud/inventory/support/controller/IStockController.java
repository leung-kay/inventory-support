package com.ruifucredit.cloud.inventory.support.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ruifucredit.cloud.inventory.support.dto.Stock;
import com.ruifucredit.cloud.kit.dto.Outcoming;

public interface IStockController {

	@GetMapping("stock/{id}")
	public Outcoming<Stock> queryStock(@PathVariable(name = "id") Long id);

	@GetMapping("stock/commodity/{id}")
	public Outcoming<List<Stock>> queryCommodityStock(@PathVariable(name = "id") Long id);

	@GetMapping("stock/commodity/{id}/{subId}")
	public Outcoming<Stock> queryCommodityStock(@PathVariable(name = "id") Long id,
			@PathVariable(name = "subId") Long subId);

	@PutMapping("stock/{stockId}")
	public Outcoming<Stock> modifyStock(@PathVariable(name = "stockId") Long id, @RequestBody Stock stock);

	@PostMapping("stock")
	public Outcoming<List<Stock>> createStock(@RequestBody List<Stock> stock);

	@DeleteMapping("stock/{stockId}")
	public Outcoming<Stock> removeStock(@PathVariable(name = "stockId") Long id);

}
