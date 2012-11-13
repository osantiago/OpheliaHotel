/**
 * CREATE TABLE IF NOT EXISTS `user accounts` (
  `user_id` int(11) NOT NULL,
  `employee_firstname` text NOT NULL,
  `employee_lastname` text NOT NULL,
  `employee_position` text NOT NULL,
  `user_privileges` text NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


 */

package type;

public class User {

	int user_id;
	String first_name;
	String last_name;
	String position;
	String privileges;
	
	User(int user_id, String first_name, String last_name, String position,
			String privileges) {
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.position = position;
		this.privileges = privileges;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPrivileges() {
		return privileges;
	}

	public void setPrivileges(String privileges) {
		this.privileges = privileges;
	}

}
