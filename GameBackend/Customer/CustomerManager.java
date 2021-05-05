
public class CustomerManager implements CustomerService {
		
		private CustomerCheckService customerCheckService;
		
		public CustomerManager(CustomerCheckService customerCheckService) {
			this.customerCheckService = customerCheckService;
			System.out.println("Kullanýcý Kayda Uygun");
		}
		
		
		
		
		@Override
		public void add(Customer customer) {
			if(customerCheckService.CheckIfRealPerson(customer)) {
				System.out.println(customer.getFirstName() + " "  + customer.getLastName() 
				+ " adlý kullanýcý sisteme eklendi" );
			}
			else {
				System.out.println("Kayýta uygun profilde deðilsiniz");
			}
		
			
		}

		@Override
		public void delete(Customer customer) {
			System.out.println(customer.getFirstName() + " "  + customer.getLastName() 
			+ " adlý kullanýcý sistemden silindi" );
			
		}

		@Override
		public void upgrade(Customer customer,String firstName,String lastName) {
			
			System.out.println(customer.getId() + " ID'li " + customer.getFirstName() 
			+ " "  + customer.getLastName() + " Adlý kullanýcýnýn ismi ve soyismi " 
			+ firstName+ " "  + lastName + " olarak deðiþtirildi");
			
		}
	
	

}
