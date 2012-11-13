/**
 * CREATE TABLE IF NOT EXISTS `basic rates` (
  `basic_rate_id` int(11) NOT NULL,
  `basic_rate` decimal(10,0) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`basic_rate_id`),
  UNIQUE KEY `basic_rate_id` (`basic_rate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
package type;

import java.sql.Date;

public class BasicRate {

	int id;
	double basic_rate;
	Date date;
	
	BasicRate(int id, double basic_rate, Date date) {
		this.id = id;
		this.basic_rate = basic_rate;
		this.date = date;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBasic_rate() {
		return basic_rate;
	}
	public void setBasic_rate(double basic_rate) {
		this.basic_rate = basic_rate;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
