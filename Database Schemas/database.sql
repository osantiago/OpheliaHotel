-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

-- --------------------------------------------------------

--
-- Table structure for table `basic rates`
--

CREATE TABLE IF NOT EXISTS `basic rates` (
  `basic_rate_id` int(11) NOT NULL,
  `basic_rate` decimal(10,0) NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY (`basic_rate_id`),
  UNIQUE KEY `basic_rate_id` (`basic_rate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE IF NOT EXISTS `customer` (
  `customer_id` int(11) NOT NULL,
  `customer_firstname` text NOT NULL,
  `customer_lastname` text NOT NULL,
  `customer_address` text NOT NULL,
  `customer_notes` text NOT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_id` (`customer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `logging`
--

CREATE TABLE IF NOT EXISTS `logging` (
  `logging_id` int(11) NOT NULL,
  `timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `action` text CHARACTER SET ascii NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`logging_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `reservation rates`
--

CREATE TABLE IF NOT EXISTS `reservation rates` (
  `rate_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `actual_rate` decimal(11,0) NOT NULL,
  `basic_rate_id` decimal(11,0) NOT NULL,
  `room_id` int(11) NOT NULL,
  PRIMARY KEY (`rate_id`),
  KEY `rate_id` (`rate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `reservations`
--

CREATE TABLE IF NOT EXISTS `reservations` (
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

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE IF NOT EXISTS `rooms` (
  `room_id` int(11) NOT NULL,
  `room_location` text NOT NULL,
  `room_notes` text NOT NULL,
  `max_occupants` int(11) NOT NULL,
  PRIMARY KEY (`room_id`),
  UNIQUE KEY `room_id` (`room_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `user accounts`
--

CREATE TABLE IF NOT EXISTS `user accounts` (
  `user_id` int(11) NOT NULL,
  `employee_firstname` text NOT NULL,
  `employee_lastname` text NOT NULL,
  `employee_position` text NOT NULL,
  `user_privileges` text NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Constraints for table `basic rates`
--
ALTER TABLE `basic rates`
  ADD CONSTRAINT `basic@0020rates_ibfk_1` FOREIGN KEY (`basic_rate_id`) REFERENCES `basic rates` (`basic_rate_id`);

--
-- Constraints for table `user accounts`
--
ALTER TABLE `user accounts`
  ADD CONSTRAINT `user@0020accounts_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `user accounts` (`user_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
