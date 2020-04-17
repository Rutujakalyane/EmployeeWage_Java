public class CompanyEmpWage
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
