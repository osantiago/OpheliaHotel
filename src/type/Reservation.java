/**
 * CREATE TABLE IF NOT EXISTS `reservations` (
  `reservation_id` int(11) NOT NULL,
  `created_date` date NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `room_id` int(11) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `notes` text NOT NULL,
  `rate_id` int(11) NOT NULL,
  `payment_needed` decimal(11,0) NOT NULL,
  `created_by` int(11) NOT NULL,
  `type` text NOT NULL,
  PRIMARY KEY (`reservation_id`),
  UNIQUE KEY `reservation_id` (`reservation_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

 */

package type;

import java.sql.Date;

public class Reservation {

	int id;
	Date created_date;
	Date start_date;
	Date end_date;
	int room_id;
	int customer_id;
	String notes;
	int rate_id;
	double payment_needed;
	int created_by;
	String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getRate_id() {
		return rate_id;
	}
	public void setRate_id(int rate_id) {
		this.rate_id = rate_id;
	}
	public double getPayment_needed() {
		return payment_needed;
	}
	public void setPayment_needed(double payment_needed) {
		this.payment_needed = payment_needed;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
