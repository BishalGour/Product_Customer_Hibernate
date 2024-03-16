package com.jsp.jdbc.HibernateProject.HibernateProject__Product_db_QueryInterface;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
	
	
    public static void main( String[] args )
    {
      Company c = new Company();
//      CompanyService.addCompany(c);

      
      CompanyService.findCompanyById();
//    CompanyService.findCompanyByName();
      CompanyService.findCompanyByCEO();
      CompanyService.findAllCompanyByType();
      CompanyService.updateNoOfEmployeeByID();
      CompanyService.updateNoOfEmployeeByName();
      CompanyService.deleteCompanyByName();
      CompanyService.deleteCompanyByCompanyType();
      
    }
}
