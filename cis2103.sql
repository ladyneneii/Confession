-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Dec 13, 2022 at 09:09 AM
-- Server version: 5.7.34
-- PHP Version: 7.4.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cis2103`
--

-- --------------------------------------------------------

--
-- Table structure for table `Confession`
--

CREATE TABLE `Confession` (
  `ConfessID` int(11) NOT NULL,
  `SenderID` int(11) NOT NULL,
  `Relationship` varchar(50) NOT NULL,
  `Message` text NOT NULL,
  `RecipientLN` varchar(50) NOT NULL,
  `RecipientFN` varchar(50) NOT NULL,
  `GiftFK` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Confession`
--

INSERT INTO `Confession` (`ConfessID`, `SenderID`, `Relationship`, `Message`, `RecipientLN`, `RecipientFN`, `GiftFK`) VALUES
(15, 12, 'Boyfriend', 'HI, Charlie. Wanna hang out? hehe', 'Spring', 'Charlie', 3),
(17, 7, 'Boyfriend', 'Sure!! I\'m looking forward to it!', 'Nelson', 'Nick', 4),
(20, 14, 'Bestie', 'hii salamat mare', 'Grande', 'Ariana', 4),
(22, 22, 'Master', 'chanel number 2 youve got to come back to life!!!!!', 'Grande', 'Ariana', 4),
(23, 23, 'Sister', 'HIii this is for uuuu', 'Spring', 'Charlie', 3),
(24, 14, 'besties', 'hi sweetie here\'s ur picture frame lol', 'Grande', 'Ariana', 8),
(25, 12, 'Boyfriend', 'hiiii good morning', 'Spring', 'Charlie', 10),
(26, 7, 'Boyfriend', 'hiii good morning to u too', 'Nelson', 'Nick', 6),
(27, 14, 'sissy', 'hi mare heres a sunscreen for u', 'Grande', 'Ariana', 11),
(30, 12, 'Boyfriend', 'Hii Charlie i miss u sm', 'Spring', 'Charlie', 13),
(31, 7, 'Boyfriend', 'hii nick i miss u 2 but u need some sunscreen LOL', 'Nelson', 'Nick', 11),
(32, 12, 'Boyfriends', 'HIii! It\'s been a while. I think this dress suits u huehuee', 'Charlie', 'Spring', 12),
(33, 12, 'Boyfriend', 'helloooo hehe', 'Spring', 'Charlie', 3),
(36, 7, 'Boyfriend', 'hiiii ', 'Nelson', 'Nick', 4),
(38, 12, 'fan', 'I love your songs! I heard you love earrings.', 'Smith', 'Sam', 14),
(39, 12, 'Boyfriend', 'hiii are you busy', 'Spring', 'Charlie', 14),
(40, 7, 'Boyfriend', 'hii here\'s a nice winter coat for you', 'Nelson', 'Nick', 16),
(41, 7, 'Boyfriend', 'hello nick', 'Nelson', 'Nick', 10),
(42, 7, 'Boyfriend', 'hello here is a teddy bear for you', 'Nelson', 'Nick', 10);

-- --------------------------------------------------------

--
-- Table structure for table `Gift`
--

CREATE TABLE `Gift` (
  `GiftID` int(11) NOT NULL,
  `GiftName` varchar(50) NOT NULL,
  `Price` float NOT NULL,
  `QuantityLeft` int(11) NOT NULL,
  `Status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Gift`
--

INSERT INTO `Gift` (`GiftID`, `GiftName`, `Price`, `QuantityLeft`, `Status`) VALUES
(3, 'Teddy Bear', 500, 5, 'SOLD'),
(4, 'bouquet of flowers', 350, 3, 'UNSOLD'),
(5, 'Chocolates', 200, 0, 'SOLD'),
(6, 'Bracelet', 150, 13, 'UNSOLD'),
(7, 'Necklace', 150, 0, 'SOLD'),
(8, 'Picture Frame', 350, 10, 'UNSOLD'),
(9, 'Puppy', 3000, 0, 'SOLD'),
(10, 'Teddy Bear', 350, 31, 'UNSOLD'),
(11, 'Sunscreen', 350, 5, 'UNSOLD'),
(12, 'Dress', 400, 2, 'UNSOLD'),
(13, 'Toblerone Chocolate', 70, 28, 'UNSOLD'),
(14, 'Earrings', 200, 5, 'UNSOLD'),
(15, 'Black Chocolate', 50, 0, 'SOLD'),
(16, 'Winter Coat', 799, 5, 'UNSOLD');

-- --------------------------------------------------------

--
-- Table structure for table `Notification`
--

CREATE TABLE `Notification` (
  `NoteID` int(11) NOT NULL,
  `GiftID` int(11) NOT NULL,
  `BuyerID` int(11) NOT NULL,
  `Operation` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Notification`
--

INSERT INTO `Notification` (`NoteID`, `GiftID`, `BuyerID`, `Operation`) VALUES
(9, 10, 12, 'INSERT'),
(11, 11, 14, 'INSERT'),
(12, 11, 11, 'INSERT'),
(14, 13, 12, 'INSERT'),
(15, 11, 7, 'INSERT'),
(16, 11, 11, 'DELETE'),
(17, 12, 12, 'INSERT'),
(18, 3, 12, 'INSERT'),
(19, 4, 7, 'INSERT'),
(21, 14, 12, 'INSERT'),
(22, 14, 12, 'INSERT'),
(23, 16, 7, 'INSERT'),
(24, 10, 7, 'INSERT'),
(25, 10, 7, 'INSERT');

-- --------------------------------------------------------

--
-- Table structure for table `Users`
--

CREATE TABLE `Users` (
  `UserID` int(11) NOT NULL,
  `FirstName` varchar(50) NOT NULL,
  `LastName` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `UserType` varchar(50) NOT NULL,
  `Privileges` varchar(50) NOT NULL,
  `State` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `Users`
--

INSERT INTO `Users` (`UserID`, `FirstName`, `LastName`, `Email`, `Password`, `UserType`, `Privileges`, `State`) VALUES
(1, 'test', 'test', 'test@gmail.com', 'test', 'test', 'Admin', 'Active'),
(7, 'Charlie', 'Spring', 'cspring@gmail.com', 'ilovenick', 'Non-Seller', 'User', 'Active'),
(8, 'Lady Nene', 'II', 'milady@gmail.com', 'slay', 'Owner', 'Admin', 'Active'),
(10, 'Ben', 'Hope', 'bhope@gmail.com', 'bhope', 'Student', 'Admin', 'Disabled'),
(11, 'Ariana', 'Grande', 'agrande@gmail.com', 'agrande', 'Non-Seller', 'User', 'Active'),
(12, 'Nick', 'Nelson', 'nnelson@gmail.com', 'ilovecharlie', 'Non-Seller', 'User', 'Active'),
(14, 'Taylor', 'Swift', 'tswift@gmail.com', 'tswift', 'Non-Seller', 'User', 'Active'),
(17, 'Billie', 'Eilish', 'beilish@gmail.com', 'beilish', 'Seller', 'User', 'Disabled'),
(19, 'Elle', 'Ardent', 'eardent@gmail.com', 'eardent', 'Seller', 'User', 'Active'),
(22, 'Chanel', 'Oberlin', 'coberlin@gmail.com', 'coberlin', 'Non-Seller', 'User', 'Disabled'),
(23, 'Tory', 'Spring', 'tspring@gmail.com', 'tspring', 'Non-Seller', 'User', 'Active'),
(25, 'Lady', 'Nene', 'ladynene@gmail.com', 'ladynene', 'Seller', 'User', 'Active'),
(28, 'Tobie', 'Donovan', 'tdonovan@gmail.com', 'tdonovan', 'Seller', 'User', 'Active'),
(29, 'Junjun', 'Salarzon', 'jsalarzon@gmail.com', 'jsalarzon', 'Seller', 'User', 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Confession`
--
ALTER TABLE `Confession`
  ADD PRIMARY KEY (`ConfessID`),
  ADD KEY `confession_ibfk_1` (`SenderID`),
  ADD KEY `confession_ibfk_2` (`GiftFK`);

--
-- Indexes for table `Gift`
--
ALTER TABLE `Gift`
  ADD PRIMARY KEY (`GiftID`);

--
-- Indexes for table `Notification`
--
ALTER TABLE `Notification`
  ADD PRIMARY KEY (`NoteID`),
  ADD KEY `notification_ibfk_1` (`GiftID`),
  ADD KEY `notification_ibfk_2` (`BuyerID`);

--
-- Indexes for table `Users`
--
ALTER TABLE `Users`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Confession`
--
ALTER TABLE `Confession`
  MODIFY `ConfessID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `Gift`
--
ALTER TABLE `Gift`
  MODIFY `GiftID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `Notification`
--
ALTER TABLE `Notification`
  MODIFY `NoteID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `Users`
--
ALTER TABLE `Users`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Confession`
--
ALTER TABLE `Confession`
  ADD CONSTRAINT `confession_ibfk_1` FOREIGN KEY (`SenderID`) REFERENCES `Users` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `confession_ibfk_2` FOREIGN KEY (`GiftFK`) REFERENCES `Gift` (`GiftID`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Notification`
--
ALTER TABLE `Notification`
  ADD CONSTRAINT `notification_ibfk_1` FOREIGN KEY (`GiftID`) REFERENCES `Gift` (`GiftID`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `notification_ibfk_2` FOREIGN KEY (`BuyerID`) REFERENCES `Users` (`UserID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
