package kodlamaio.northwind.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // bir bir arttırmak için
	@Column(name = "product_id")
	private int id;

//	@Column(name = "category_id") //aşağıda yazdığımıziçin bunagerek kalmadı.
//	private int categoryId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "supplier_id")
	private short supplierId;

	@Column(name = "unit_price")
	private double unitPrice;

	@Column(name = "quantity_per_unit")
	private String quantityPerUnit;

	@ManyToOne()
	@JoinColumn(name = "category_id")
	private Category category;

	@Column(name = "units_on_order")
	private short unitsOnOrder;

	@Column(name = "reorder_level")
	private short reorderLevel;

	@Column(name = "discontinued")
	private short discontinued;
	
	@Column( name= "units_in_stock")
	private short unitsInStock;

}
