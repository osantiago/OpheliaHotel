/**
 * CREATE TABLE IF NOT EXISTS `rooms` (
  `room_id` int(11) NOT NULL,
  `room_location` text NOT NULL,
  `room_notes` text NOT NULL,
  `max_occupants` int(11) NOT NULL,
  PRIMARY KEY (`room_id`),
  UNIQUE KEY `room_id` (`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
 */
package type;

public class Room {

	int room_id;
	String room_location;
	String room_notes;
	int max_occupants;
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getRoom_location() {
		return room_location;
	}
	public void setRoom_location(String room_location) {
		this.room_location = room_location;
	}
	public String getRoom_notes() {
		return room_notes;
	}
	public void setRoom_notes(String room_notes) {
		this.room_notes = room_notes;
	}
	public int getMax_occupants() {
		return max_occupants;
	}
	public void setMax_occupants(int max_occupants) {
		this.max_occupants = max_occupants;
	}
	
	
}
