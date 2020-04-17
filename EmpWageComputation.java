public class EmpWageComputation
{
        //CONSTANTS
        public final int IS_PART_TIME = 1;
        public final int IS_FULL_TIME = 2;
        //COMPUTATION
        public void computeTotalEmpWage( CompanyEmpWage companyEmployee )
        {
                int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
                while( totalEmpHrs <= companyEmployee.getMaxHrsInMonth() && totalWorkingDays < companyEmployee.getMaxNumOfWorkingDays() )
                {
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
        public static void main(String args[])
         {
                EmpWageComputation empwagecomputation = new EmpWageComputation();
                //DECLARING ARRAY OF COMPANY EMPLOYEE WAGE OBJECT
                CompanyEmpWage[] company = new CompanyEmpWage[2];

                company[0] = new CompanyEmpWage( "facebook", 20, 20, 100 );
                empwagecomputation.computeTotalEmpWage(company[0]);

                company[1] = new CompanyEmpWage( "GOOGLE", 30, 20, 70 );
                empwagecomputation.computeTotalEmpWage(company[1]);
        }
}
class CompanyEmpWage
{
	public String CompanyName;
        public int EmpRatePerHour;
        public int NumOfWorkingDays;
        public int HoursInMonth;

        public int totalEmpWage = 0;
        public CompanyEmpWage( String CompanyName, int EmpRatePerHour, int NumOfWorkingDays, int HoursInMonth )
        {
                this.CompanyName = CompanyName;
                this.EmpRatePerHour = EmpRatePerHour;
                this.NumOfWorkingDays = NumOfWorkingDays;
                this.HoursInMonth = HoursInMonth;
        }
        public String getCompanyName()
        {
                return CompanyName;
        }
        public int getEmpRatePerHour()
        {
                return EmpRatePerHour;
        }
        public int getMaxNumOfWorkingDays()
        {
                return NumOfWorkingDays;
        }
        public int getMaxHrsInMonth()
        {
                return HoursInMonth;
        }
        public void setTotalEmpWage( int totalEmpWage )
        {
                this.totalEmpWage = totalEmpWage;
        }
        public int getTotalEmpWage()
        {
                return totalEmpWage;
        }
}
