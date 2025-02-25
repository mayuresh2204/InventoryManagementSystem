package com.tka.InventoryManagementSystem.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.InventoryManagementSystem.entity.Category;
import com.tka.InventoryManagementSystem.entity.Product;
import com.tka.InventoryManagementSystem.entity.Supplier;


@Repository
public class Dao {

	@Autowired
	SessionFactory factory;

	public String addCategory(Category c) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			session.persist(c);
			tx.commit();
			msg="Category Added Successfully";
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public List<Category> getAllCategory() {
		Session session=null;
		Transaction tx=null;
		List<Category>list=null;
		String hqlQuery="from Category";
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			Query<Category>query=session.createQuery(hqlQuery, Category.class);
			list=query.list();
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

	public String updateCategory(Category c) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			Category ct=session.get(Category.class, c.getCid());
			ct.setCid(c.getCid());
			ct.setCname(c.getCname());
			session.merge(ct);
			tx.commit();
			msg="Category Updated Successfully";
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public String deleteCategory(int id) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			Category ct=session.get(Category.class, id);
			session.remove(ct);
			tx.commit();
			msg="Category Deleted Successfully";
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public Category getCategoryById(int id) {
		Session session=null;
		Transaction tx=null;
		Category ct=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			ct=session.get(Category.class, id);
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return ct;
	}
	
	
	//Supplier

	public String addSupplier(Supplier s) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			session.persist(s);
			tx.commit();
			msg="Supplier Added Successfully";
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public List<Supplier> getAllSuppliers() {
		Session session=null;
		Transaction tx=null;
		List<Supplier>list=null;
		String hqlQuery="from Supplier";
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			Query<Supplier>query=session.createQuery(hqlQuery, Supplier.class);
			list=query.list();
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

	public String updateSupplier(Supplier s) {
		Session session=null;
		Transaction tx=null;
		Supplier sp=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			sp=session.get(Supplier.class, s.getSid());
			sp.setSname(s.getSname());
			sp.setPhoneno(s.getPhoneno());
			sp.setCity(s.getCity());
			session.merge(sp);
			tx.commit();
			msg="Supplier Updated Successfully..";
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public String deleteSupplier(int id) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			Supplier ct=session.get(Supplier.class, id);
			session.remove(ct);
			tx.commit();
			msg="Supplier Deleted Successfully";
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public Supplier getSupplierById(int id) {
		Session session=null;
		Transaction tx=null;
		Supplier sp=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			sp=session.get(Supplier.class, id);
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return sp;
	}
	
	
	//Product
	

	public String addProduct(Product p) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			session.persist(p);
			tx.commit();
			msg="Product Added Successfully";
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public List<Product> getAllProduct() {
		Session session=null;
		Transaction tx=null;
		List<Product>list=null;
		String hqlQuery="from Product";
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			Query<Product>query=session.createQuery(hqlQuery, Product.class);
			list=query.list();
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

	public String updateProduct(Product p) {
		Session session=null;
		Transaction tx=null;
		Product pdt=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			pdt=session.get(Product.class,p.getId() );
			pdt.setName(p.getName());
			pdt.setAvailable(p.getAvailable());
			pdt.setCategory(p.getCategory());
			pdt.setDescription(p.getDescription());
			pdt.setPrice(p.getPrice());
			pdt.setQuantity(p.getQuantity());
			pdt.setSupplier(p.getSupplier());
			session.merge(pdt);
			tx.commit();
			msg="Product Successfully Updated ..";
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public String deleteProduct(int id) {
		Session session=null;
		Transaction tx=null;
		String msg=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			Product pt=session.get(Product.class, id);
			session.remove(pt);
			tx.commit();
			msg="Product Deleted Successfully";
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return msg;
	}

	public Product getProductById(int id) {
		Session session=null;
		Transaction tx=null;
		Product pd=null;
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			pd=session.get(Product.class, id);
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return pd;
	}

	public Product getMaxPriceProduct() {
		Session session=null;
		Transaction tx=null;
		Product pt=null;
		String hqlQuery="from Product where price=(select max(price) from Product )";
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			Query<Product>query=session.createQuery(hqlQuery, Product.class);
			pt=query.uniqueResult();
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return pt;
	}

	public List<Product> getProductByStatus(String status) {
		Session session=null;
		Transaction tx=null;
		List<Product>list=null;
		String hqlQuery="from Product where available=:myavailable";
		try {
			session=factory.openSession();
			tx=session.beginTransaction();
			Query<Product>query=session.createQuery(hqlQuery, Product.class);
			query.setParameter("myavailable", status);
			list=query.list();
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

	public List<Product> getProductByPriceRange(int price1, int price2) {
		Session session=null;
		Transaction tx=null;
		String hqlQuery="from Product where price>=:myprice1 and price<=:myprice2";
		List<Product>list=null;
		try {
			session=factory.openSession();
			session.beginTransaction();
			Query<Product>query=session.createQuery(hqlQuery,Product.class);
			query.setParameter("myprice1",price1);
			query.setParameter("myprice2",price2);
			list=query.list();
			tx.commit();
		} catch (Exception e) {
			if (tx!=null) {
				tx.rollback();
				
			}
			e.printStackTrace();
		}finally {
			if (session!=null) {
				session.close();
			}
		}
		return list;
	}

	
}
