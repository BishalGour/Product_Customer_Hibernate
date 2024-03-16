package com.jsp.jdbc.HibernateProject.HibernateProject__Product_db_QueryInterface;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;




public class CompanyService {

	public  static Session getSession() {
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Company.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();

		return session;
	}

	public static void addCompany(Company c) {
		Session ss = CompanyService.getSession();
		Transaction tt=ss.beginTransaction();

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Company Id");
		int companyId =sc1.nextInt();
		c.setCompanyId(companyId);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Company Name");
		String companyName =sc1.next();
		c.setCompanyName(companyName);

		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter the Company HeadQuater Location");
		String headQuaterLocation=sc3.next();
		c.setHeadQuaterLocation(headQuaterLocation);

		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter the Number Of Branch");
		int noOfBranch=sc4.nextInt();
		c.setNoOfBranch(noOfBranch);

		Scanner sc5 = new Scanner(System.in);
		System.out.println("Enter Number Of Employee");
		int noOfEmployee=sc3.nextInt();
		c.setTotalNumberOfEmployee(noOfEmployee);
		
		Scanner sc6 = new Scanner(System.in);
		System.out.println("Enter CEO Name");
		String ceo=sc3.next();
		c.setCompanyCEO(ceo);
		
		ss.save(c);
		tt.commit();
		ss.close();
		

	}
	public static void findCompanyById()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Company Id You want to find :- ");
		String cId = sc.next();

		Session ss = getSession();
		Transaction tt = ss.beginTransaction();

		NativeQuery<Company> nq = ss.createNativeQuery("select * from Company where companyId=?",Company.class);
		nq.setParameter(1, cId);
		List<Company> company = nq.list();
		for(Company c : company)
		{
			System.out.println(c);
		}
		tt.commit();
		ss.close();
		sc.close();
	}
	public static void findCompanyByName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Company Name You want to find :- ");
		String cName = sc.next();

		Session ss = getSession();
		Transaction tt = ss.beginTransaction();

		NativeQuery<Company> nq = ss.createNativeQuery("select * from Country where countryName=?",Company.class);
		nq.setParameter(1, cName);
		List<Company> company = nq.list();
		for(Company c : company)
		{
			System.out.println(c);
		}
		tt.commit();
		ss.close();
		sc.close();
	}
	public static void findCompanyByCEO()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter CEO Name You want to find :- ");
		String cCEO = sc.next();

		Session ss = getSession();
		Transaction tt = ss.beginTransaction();

		NativeQuery<Company> nq = ss.createNativeQuery("select * from Country where companyCEO=?",Company.class);
		nq.setParameter(1, cCEO);
		List<Company> company = nq.list();
		for(Company c : company)
		{
			System.out.println(c);
		}
		tt.commit();
		ss.close();
		sc.close();
	}
	public static void findAllCompanyByType()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Company Type You want to find :- ");
		String cType = sc.next();

		Session ss = getSession();
		Transaction tt = ss.beginTransaction();

		NativeQuery<Company> nq = ss.createNativeQuery("select * from Company where countryType=?",Company.class);
		nq.setParameter(1, cType);
		List<Company> company = nq.list();
		for(Company c : company)
		{
			System.out.println(c);
		}
		tt.commit();
		ss.close();
		sc.close();
	}
	public static void updateNoOfEmployeeByID()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter ID Company You want to Update :- ");
		String eUpdate = sc.next();

		Session ss = getSession();
		Transaction tt = ss.beginTransaction();

		NativeQuery<Company> nq = ss.createNativeQuery("update company set totalNumberOfEmployee=?1 where companyId=?",Company.class);
		nq.setParameter(1, eUpdate);
		List<Company> company = nq.list();
		for(Company c : company)
		{
			System.out.println(c);
		}
		tt.commit();
		ss.close();
		sc.close();
	}
	public static void updateNoOfEmployeeByName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name Company You want to Update :- ");
		String eUpdate = sc.next();

		Session ss = getSession();
		Transaction tt = ss.beginTransaction();

		NativeQuery<Company> nq = ss.createNativeQuery("update company set totalNumberOfEmployee=?1 where companyId=?",Company.class);
		nq.setParameter(1, eUpdate);
		List<Company> company = nq.list();
		for(Company c : company)
		{
			System.out.println(c);
		}
		tt.commit();
		ss.close();
		sc.close();
	}
	public static void deleteCompanyByName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name Company You want to Delete :- ");
		String eUpdate = sc.next();

		Session ss = getSession();
		Transaction tt = ss.beginTransaction();

		NativeQuery<Company> nq = ss.createNativeQuery("delete company where companyId=?",Company.class);
		nq.setParameter(1, eUpdate);
		List<Company> company = nq.list();
		for(Company c : company)
		{
			System.out.println(c);
		}
		tt.commit();
		ss.close();
		sc.close();
	}
	public static void deleteCompanyByCompanyType()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name Company You want to Delete :- ");
		String eUpdate = sc.next();

		Session ss = getSession();
		Transaction tt = ss.beginTransaction();

		NativeQuery<Company> nq = ss.createNativeQuery("delete company where companyType=?",Company.class);
		nq.setParameter(1, eUpdate);
		List<Company> company = nq.list();
		for(Company c : company)
		{
			System.out.println(c);
		}
		tt.commit();
		ss.close();
		sc.close();
	}
	
	

}
