

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		double tc  = Double.parseDouble(customer.getNationalityId());
		double y�l = Double.parseDouble(customer.getBirthYear());
		
		if(tc >= Math.pow(10, 10) && tc < Math.pow(10, 11) &&
				(2021 - y�l == customer.getAge() ))
				  {return true;}
		
		else {return false;}
		
	}

	
	

	
	
}
