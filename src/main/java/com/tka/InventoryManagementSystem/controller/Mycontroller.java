package com.tka.InventoryManagementSystem.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.InventoryManagementSystem.entity.Category;
import com.tka.InventoryManagementSystem.entity.Product;
import com.tka.InventoryManagementSystem.entity.Supplier;
import com.tka.InventoryManagementSystem.service.Service;

@RestController
@RequestMapping("api")
public class Mycontroller {

	@Autowired
	Service service;
	
	// Category
	
	@PostMapping("addcategory")
	public String addCategory(@RequestBody Category c) {
		String str=service.addCategory(c);
		return str;
	}
	@GetMapping("getallcategory")
	public List<Category> getAllCategory() {
		List<Category>list=service.getAllCategory();
		return list;
	}
	@PutMapping("updatecategory")
	public String updateCategory(@RequestBody Category c) {
		String msg=service.updateCategory(c);
		return msg;
		
	}
	@DeleteMapping("deletecategory/{id}")
	public String deleteCategory(@PathVariable int id) {
		String msg=service.deleteCategory(id);
		return msg;
		
	}
	@GetMapping("getcategorybyid/{id}")
	public Category getCategoryById(@PathVariable int id) {
		Category ct=service.getCategoryById(id);
		return ct;	
	}
	
	
	// Supplier  
	
	@PostMapping("addsupplier")
	public String addSupplier(@RequestBody Supplier s) {
		String msg=service.addSupplier(s);
		return msg;
	}
	@GetMapping("getallsuppliers")
	public List<Supplier> getAllSuppliers() {
		List<Supplier>list=service.getAllSuppliers();
		return list;
	}
	@PutMapping("updatesupplier")
	public String updateSupplier(@RequestBody Supplier s) {
		String msg=service.updateSupplier(s);
		return msg;
	}
	@DeleteMapping("deletesupplier/{id}")
	public String deleteSupplier(@PathVariable int id) {
		String msg=service.deleteSupplier(id);
		return msg;
	}
	@GetMapping("getsupplierbyid/{id}")
	public Supplier getSupplierById(@PathVariable int id) {
		Supplier supplier=service.getSupplierById(id);
		return supplier;
	}
	
	
	//Product
	
	
	@PostMapping("addproduct")
	public String addProduct(@RequestBody Product p) {
		String msg=service.addProduct(p);
		return msg;
	}
	@GetMapping("getallproduct")
	public List<Product> getAllProduct() {
		List<Product>list=service.getAllProduct();
		return list;
	}
	@PutMapping("updateproduct")
	public String updateProduct(@RequestBody Product p) {
		String msg=service.updateProduct(p);
		return msg;
		
	}
	@DeleteMapping("deleteproduct/{id}")
	public String deleteProduct(@PathVariable int id) {
		String msg=service.deleteProduct(id);
		return msg;
	}
	@GetMapping("getproductbyid/{id}")
	public Product getProductById(@PathVariable int id) {
		Product p=service.getProductById(id);
		return p;
	}
	
	
	@GetMapping("getmaxpriceproduct")
	public Product getMaxPriceProduct() {
		Product p=service.getMaxPriceProduct();
		return p;
	}
	@GetMapping("getproductbystatus/{status}")
	public List<Product> getProductByStatus(@PathVariable String status) {
		List<Product>list=service.getProductByStatus(status);
		return list;
	}
	@GetMapping("getproductbypricerange/{price1}/{price2}")
	public List<Product> getProductByPriceRange(@PathVariable int price1,@PathVariable int price2) {
		List<Product>list=service.getProductByPriceRange(price1,price2);
		return list;
	}
}
