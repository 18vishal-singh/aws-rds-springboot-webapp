package paper.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "customer")
public class Customer implements Serializable {

	@Id
	@Column(name = "Id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "dcity")
	private String dcity;
	@Column(name = "pcity")
	private String pcity;
	@Column(name = "mobileno")
	private String mobileno;

	public Customer(String name, String dcity, String pcity, String mobileno) {
		super();
		this.name = name;
		this.dcity = dcity;
		this.pcity = pcity;
		this.mobileno = mobileno;
	}

	public Customer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDcity() {
		return dcity;
	}

	public void setDcity(String dcity) {
		this.dcity = dcity;
	}

	public String getPcity() {
		return pcity;
	}

	public void setPcity(String pcity) {
		this.pcity = pcity;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
}
