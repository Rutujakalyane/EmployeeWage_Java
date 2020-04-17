public class EmpWageComputation
{
       	//CONSTANTS
	public final int IS_PART_TIME = 1;
	public final int IS_FULL_TIME = 2;
	//COMPUTATION
	public void computeTotalEmpWage( CompanyEmpWage companyEmployee )
        {
		int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
		while( totalEmpHrs <= companyEmployee.getMaxHrsInMonth() && totalWorkingDays < companyEmployee.getMaxNumOfWorkingDays() )  {
			totalWorkingDays++;
			int empCheck = (int) ( Math.random() * 10 ) % 3;
			switch (empCheck)
                        {
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
			}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +  empHrs);
		}
		companyEmployee.setTotalEmpWage( totalEmpHrs * companyEmployee.getEmpRatePerHour() );
		System.out.println("Total Wage of " + companyEmployee.getCompanyName() + " Employee is " + companyEmployee.getTotalEmpWage());
	}
