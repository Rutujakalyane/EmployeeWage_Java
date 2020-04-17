import java.lang.*;
import java.util.*;

public class EmpWageObject
{
    public static void main(String args[])
    {
  	    EmpWageComputation empwagecomputation = new EmpWageComputation();
        //DECLARING ARRAYLIST OF COMPANY EMPLOYEE WAGE OBJECT
		    ArrayList<CompanyEmpWage> company = new ArrayList<CompanyEmpWage>();

        company.add( new CompanyEmpWage( "facebook", 20, 20, 100 ));
	    	empwagecomputation.computeTotalEmpWage(company.get(0));

	    	company.add( new CompanyEmpWage( "GOOGLE", 30, 20, 70 ));
		    empwagecomputation.computeTotalEmpWage(company.get(1));
	}
}
