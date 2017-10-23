package junit;

import org.junit.Test;

import cn.itcast.crm.container.ServiceProvinder;
import cn.itcast.crm.dao.ICompanyDao;
import cn.itcast.crm.domain.Company;
import cn.itcast.crm.domain.SysUser;

public class TestCompany {

	  @Test
	  public void saveCompany(){
		  ICompanyDao companyDao=(ICompanyDao)ServiceProvinder.getService(ICompanyDao.SERVICE_NAME);
		  Company c=new Company();
		  c.setCode("xxxccx");
		  c.setName("xxxccxx");
		  SysUser sysUser=new SysUser();
		  sysUser.setId(4);
		  c.setSysUser(sysUser);
		  c.setShareFlag('N');
		  
		  companyDao.save(c);
		  
	  }
	  
	  
	  
	
}
