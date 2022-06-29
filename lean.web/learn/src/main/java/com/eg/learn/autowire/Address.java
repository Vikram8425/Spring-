package com.eg.learn.autowire;

public class Address {
		private String Street;
		private String zipcode;
		public String getStreet() {
			return Street;
		}
		public String getZipcode() {
			return zipcode;
		}
		public void setStreet(String street) {
			Street = street;
		}
		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}
		@Override
		public String toString() {
			return "Address [Street=" + Street + ", zipcode=" + zipcode + "]";
		}
		public Address(String street, String zipcode) {
			super();
			Street = street;
			this.zipcode = zipcode;
		}
		
		public Address() {
			
		}
}
