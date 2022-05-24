package tacos;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

//import javax.validation.constraints.Digits;
//import javax.validation.constraints.Pattern;
//import org.hibernate.validator.constraints.CreditCardNumber; 
//import org.hibernate.validator.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name="Taco_Order")
public class Order {
	private Long id;
	private Date placedAt;
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	private String ccNumber;
	private String ccExpiration;
	private String ccCVV;
	
}