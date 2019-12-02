package ie.lyit.bank;

public class Employee extends Person{
	
	private Date startDate;
	private double salary;
	private int number;
	private static int nextNumber = 1;
	private final double MAXIMUMSALARY = 150000;  
	
	public Employee()
	{
		
	}
	
	public Employee(Name n, Date dob, Date startDate, double salary)
	{
		this.name = n;
		this.dateOfBirth = dob;
		this.startDate = startDate;
		this.salary = salary;
		this.number = nextNumber++;
		
	}
	
	@Override
	public String toString(){
		return name.toString() + "," + dateOfBirth+ "," + startDate+ "," + salary+ "," + number;
	}
	
	@Override  // Overrides Object equals()
	public boolean equals(Object obj){
		Employee eObject;
		if (obj instanceof Person)
			eObject = (Employee)obj;
		else
			return false;
	   
		return(name.equals(eObject.name) &&
			   dateOfBirth.equals(eObject.dateOfBirth)&&
			   startDate.equals(eObject.startDate)&&
			   salary== eObject.salary &&
			   number== eObject.number);
	}
	
	public void incrementSalary(double incrementAmount) throws IllegalArgumentException
	{
		if ((incrementAmount + this.salary) > MAXIMUMSALARY)
		{
			throw new IllegalArgumentException("Balance cannot exceed 150000");
		}
		else
			this.salary = this.salary + incrementAmount;
		
	}
	
	public double calculateWage(double taxPercentage) throws IllegalArgumentException
	{
		double wage = salary / 12;
		if (taxPercentage >= 0 || taxPercentage <= 100)
		{
		//double wage = salary / 12;
			wage-=(wage*(taxPercentage/100));
			return wage;
		}
		else
		{
		
			throw new IllegalArgumentException("Tax percentage must be between 0 and 100");
		}
		
	}
	
	public void setStartDate(int day, int month, int year)
	{
		this.startDate = new Date(day,month,year);
	}
	
	public Date getStartDate()
	{
		return this.startDate;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public double getAccountNumber()
	{
		return this.number;
	}

}
