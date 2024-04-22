package com.training.string;

import java.util.Objects;

public class Product {
	
	 int id;  
	  
	    String name;  
	  
	    float price;  
	  
	    public Product(int id, String name, float price) {  
	  
	        this.id = id;  
	  
	        this.name = name;  
	  
	        this.price = price;  
	  
	    }

		@Override
		public String toString() {
			return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(id, name, price);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Product other = (Product) obj;
			return id == other.id && Objects.equals(name, other.name)
					&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price);
		}  
	
//	

}
