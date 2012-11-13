/**
 * CREATE TABLE IF NOT EXISTS `reservation rates` (
  `rate_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `actual_rate` decimal(11,0) NOT NULL,
  `basic_rate_id` decimal(11,0) NOT NULL,
  `room_id` int(11) NOT NULL,
  PRIMARY KEY (`rate_id`),
  KEY `rate_id` (`rate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


 */

package type;

import java.sql.Date;

public class ReservationRate {

	int id;
	Date date;
	double actual_rate;
	int basic_rate_id;
	int room_id;
	
	ReservationRate(int id, Date date, double actual_rate, int basic_rate_id, 
			int room_id) {
		this.id = id;
		this.date = date;
		this.actual_rate = actual_rate;
		this.room_id = room_id;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getActual_rate() {
		return actual_rate;
	}
	public void setActual_rate(double actual_rate) {
		this.actual_rate = actual_rate;
	}
	public int getBasic_rate_id() {
		return basic_rate_id;
	}
	public void setBasic_rate_id(int basic_rate_id) {
		this.basic_rate_id = basic_rate_id;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	
	
	
	
}
