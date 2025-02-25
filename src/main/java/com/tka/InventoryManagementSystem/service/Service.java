package com.tka.InventoryManagementSystem.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.tka.InventoryManagementSystem.dao.Dao;
import com.tka.InventoryManagementSystem.entity.Category;
import com.tka.InventoryManagementSystem.entity.Product;
import com.tka.InventoryManagementSystem.entity.Supplier;


@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Dao dao;

	public String addCategory(Category c) {
		String msg=dao.addCategory(c);
		if(Objects.isNull(msg)) {
			msg="Category is not Added";
		}
		return msg;
	}

	public List<Category> getAllCategory() {
		List<Category>list=dao.getAllCategory();
		if (Objects.isNull(list)) {
			list=null;
		}
		return list;
	}

	public String updateCategory(Category c) {
		String msg=dao.updateCategory(c);
		if (Objects.isNull(msg)) {
			msg="Category is not Updated";
		}
		return msg;
	}

	public String deleteCategory(int id) {
		String msg=dao.deleteCategory(id);
		if (Objects.isNull(msg)) {
			msg="Category is not Deleted";
		}
		return msg;
	}

	public Category getCategoryById(int id) {
		Category ct=dao.getCategoryById(id);
		if (Objects.isNull(ct)) {
			ct=null;
		}
		return ct;
	}
	
	// Supplier

	public String addSupplier(Supplier s) {
		String msg=dao.addSupplier(s);
		if (Objects.isNull(msg)) {
			msg="Supplier is not Added..";
		}
		return msg;
	}

	public List<Supplier> getAllSuppliers() {
		List<Supplier>list=dao.getAllSuppliers();
		if (Objects.isNull(list)) {
			list=null;
		}
		return list;
	}

	public String updateSupplier(Supplier s) {
		String msg=dao.updateSupplier(s);
		if (Objects.isNull(msg)) {
			msg="Supplier is not Updated..";
		}
		return msg;
	}

	public String deleteSupplier(int id) {
		String msg=dao.deleteSupplier(id);
		if (Objects.isNull(msg)) {
			msg="Supplier is not Deleted..";
		}
		return msg;
	}

	public Supplier getSupplierById(int id) {
		Supplier supplier=dao.getSupplierById(id);
		if (Objects.isNull(supplier)) {
			supplier=null;
		}
		return supplier;
	}

	public String addProduct(Product p) {
		String msg=dao.addProduct(p);
		if (Objects.isNull(msg)) {
			msg="Product is not Added..";
		}
		return msg;
	}

	public List<Product> getAllProduct() {
		List<Product>list=dao.getAllProduct();
		if (Objects.isNull(list)) {
			list=null;
		}
		return list;
	}

	public String updateProduct(Product p) {
		String msg=dao.updateProduct(p);
		if (Objects.isNull(msg)) {
			msg="Product not Updated..";
		}
		return msg;
	}

	public String deleteProduct(int id) {
		String msg=dao.deleteProduct(id);
		if (Objects.isNull(msg)) {
			msg="Product not Deleted..";
		}
		return msg;
		
	}

	public Product getProductById(int id) {
		Product p=dao.getProductById(id);
		if (Objects.isNull(p)) {
			p=null;
		}
		return p;
	}

	public Product getMaxPriceProduct() {
		Product p=dao.getMaxPriceProduct();
		if (Objects.isNull(p)) {
			p=null;
		}
		return p;
	}

	public List<Product> getProductByStatus(String status) {
		List<Product>list=dao.getProductByStatus(status);
		if (Objects.isNull(list)) {
			list=null;
		}
		return list;
	}

	public List<Product> getProductByPriceRange(int price1, int price2) {
		List<Product>list=dao.getProductByPriceRange(price1,price2);
		if (Objects.isNull(list)) {
			list=null;
		}
		return list;
	}
}
