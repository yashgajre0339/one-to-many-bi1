package com.jsp.TestBankBranch;



import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestBankBranch {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("yash");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction= entityManager.getTransaction();
		
		Bank bank =new Bank();
		bank.setName("BOI");
		
		Branch branch1=new Branch();
		branch1.setLocation("BOI-vashi");
		branch1.setIFSCcode("123456789");
		   
		Branch branch2 =new Branch();
		branch2.setLocation("BOI-THANE");
		branch2.setIFSCcode("09808276676");
		
		ArrayList<Branch> branches= new ArrayList<Branch>();
		branches.add(branch1);
		branches.add(branch2);
		
		bank.setBranches(branches);
		branch1.setBank(bank);
		branch2.setBank(bank);
		
		entityTransaction.begin();
		entityManager.persist(bank);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityTransaction.commit();
	}

}

