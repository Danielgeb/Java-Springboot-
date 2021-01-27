package com.cogent.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "product")
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String item;
	private float amount;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Expense(String item, float amount) {
        this.item = item;
        this.amount = amount;
    }
	@Override
	public String toString() {
		return "Expense [id=" + id + ", item=" + item + ", amount=" + amount + "]";
	}

	

}
