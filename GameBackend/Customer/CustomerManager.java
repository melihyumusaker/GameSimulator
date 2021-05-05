
public class CustomerManager implements CustomerService {
		
		private CustomerCheckService customerCheckService;
		
		public CustomerManager(CustomerCheckService customerCheckService) {
			this.customerCheckService = customerCheckService;
			System.out.println("Kullan�c� Kayda Uygun");
		}
		
		
		
		
		@Override
		public void add(Customer customer) {
			if(customerCheckService.CheckIfRealPerson(customer)) {
				System.out.println(customer.getFirstName() + " "  + customer.getLastName() 
				+ " adl� kullan�c� sisteme eklendi" );
			}
			else {
				System.out.println("Kay�ta uygun profilde de�ilsiniz");
			}
		
			
		}

		@Override
		public void delete(Customer customer) {
			System.out.println(customer.getFirstName() + " "  + customer.getLastName() 
			+ " adl� kullan�c� sistemden silindi" );
			
		}

		@Override
		public void upgrade(Customer customer,String firstName,String lastName) {
			
			System.out.println(customer.getId() + " ID'li " + customer.getFirstName() 
			+ " "  + customer.getLastName() + " Adl� kullan�c�n�n ismi ve soyismi " 
			+ firstName+ " "  + lastName + " olarak de�i�tirildi");
			
		}
	
	

}
