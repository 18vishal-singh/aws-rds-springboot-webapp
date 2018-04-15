package paper.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "driver")
public class Driver implements Serializable {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "vehicle_no")
	private String vehicle_no;
	@Column(name = "dcity")
	private String dcity;
	@Column(name = "pcity")
	private String pcity;
	@Column(name = "mobileno")
	private String mobileno;

	public Driver(String name, String vehicle_no, String dcity, String pcity, String mobileno) {
		super();
		this.name = name;
		this.vehicle_no = vehicle_no;
		this.dcity = dcity;
		this.pcity = pcity;
		this.mobileno = mobileno;
	}

	public Driver() {
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

	public String getVehicle_no() {
		return vehicle_no;
	}

	public void setVehicle_no(String vehicle_no) {
		this.vehicle_no = vehicle_no;
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