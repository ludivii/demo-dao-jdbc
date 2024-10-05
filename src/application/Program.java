package application;

import java.util.Date;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		// TODO Auto-generated method stub
		
		Department obj = new Department(1, "books");
		Seller seller = new Seller(1, "Maria", "maria@gmail.com", new Date(), 3000.00, obj);
		SellerDao sellerDao = DaoFactory.createSellerDao();		
		System.out.println(obj);
		System.out.println(seller);

	}

}
