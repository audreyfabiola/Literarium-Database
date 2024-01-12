-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Jan 12, 2024 at 04:38 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Literarium_2`
--

-- --------------------------------------------------------

--
-- Table structure for table `Admin`
--

CREATE TABLE `Admin` (
  `adminId` int(11) NOT NULL,
  `adminName` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Admin`
--

INSERT INTO `Admin` (`adminId`, `adminName`, `pass`, `email`, `address`) VALUES
(1, 'audrey', 'Test1*', 'audrey@gmail.com', 'jakarta');

-- --------------------------------------------------------

--
-- Table structure for table `Author`
--

CREATE TABLE `Author` (
  `authorId` int(11) NOT NULL,
  `authorName` varchar(255) NOT NULL,
  `birthday` date NOT NULL,
  `biography` varchar(500) NOT NULL,
  `country` varchar(255) NOT NULL,
  `image` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Author`
--

INSERT INTO `Author` (`authorId`, `authorName`, `birthday`, `biography`, `country`, `image`) VALUES
(18, 'Madeline Miller', '1978-07-24', 'An American novelist celebrated for her reimaginings of classical mythology in books like \"Circe\" and \"The Song of Achilles.\"', 'US', '2'),
(19, 'Gillian Flynn', '1971-02-24', 'An American author recognized for psychological thrillers like \"Gone Girl\" and \"Sharp Objects.\"', 'US', '3'),
(20, 'Rebecca Yarros', '1981-04-14', 'An American author known for her romance novels, particularly the Flight & Glory series and the Renegades series.', 'US', '4'),
(21, 'David Levithan', '1972-09-07', 'An American author and editor famous for his young adult novels like \"Every Day\" and \"Nick & Norah\'s Infinite Playlist.\"', 'US', '5'),
(22, 'Emma Donoghue', '1969-10-24', 'An Irish-Canadian author known for \"Room,\" among other works, exploring complex human relationships and historical themes.', 'Ireland/Canada', '6'),
(23, 'E. Lockhart', '1967-09-13', 'An American author recognized for young adult novels like \"We Were Liars\" and \"Genuine Fraud.\"', 'US', '7'),
(24, 'Emily Henry', '1990-01-01', 'An American author acclaimed for her romantic comedies such as \"Beach Read\" and \"People We Meet on Vacation.\"', 'US', '8'),
(25, 'Stephen King', '1947-09-21', 'An iconic American author of horror, supernatural fiction, suspense, and fantasy, known for numerous bestsellers like \"The Shining\" and \"It.\"', 'US', '9'),
(26, 'Jane Austen', '1775-12-16', 'An English novelist celebrated for classics like \"Pride and Prejudice,\" known for her keen social commentary and wit.', 'UK', '10'),
(27, 'Louisa May Alcott', '1832-11-29', 'An American author best known for \"Little Women,\" portraying family life in the 19th century.', 'US', '11'),
(28, 'R.F. Kuang', '1996-05-29', 'A Chinese-American author acclaimed for the Poppy War trilogy, blending historical events and fantasy elements.', 'US/China', '12'),
(29, 'Andy Weir', '1972-06-16', 'An American author famed for \"The Martian,\" known for his scientifically accurate and engaging science fiction.', 'US', '13'),
(30, 'John Grisham', '1955-02-08', 'An American author renowned for legal thrillers such as \"The Firm\" and \"A Time to Kill.\"', 'US', '14'),
(31, 'Nita Prose', '1972-03-20', 'A contemporary author recognized for novels like \"The Maid,\" delving into mystery and human relationships.', 'US', '15'),
(32, 'Dan Brown', '1964-06-22', 'An American author famed for the Robert Langdon series, including \"The Da Vinci Code,\" exploring religious symbolism and history.', 'US', '16'),
(50, 'Jeffrey', '2023-12-15', 'Test1', 'Indonesia', '4');

-- --------------------------------------------------------

--
-- Table structure for table `Book`
--

CREATE TABLE `Book` (
  `bookId` int(11) NOT NULL,
  `title` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `authorId` int(11) DEFAULT NULL,
  `image` varchar(255) NOT NULL,
  `synopsis` varchar(500) NOT NULL,
  `publisherId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Book`
--

INSERT INTO `Book` (`bookId`, `title`, `price`, `quantity`, `authorId`, `image`, `synopsis`, `publisherId`) VALUES
(10139, 'The Song of Achilles', 100, 6, 18, '10011', 'Achilles, \"the best of all the Greeks,\" son of the cruel sea goddess Thetis and the legendary king Peleus, is strong, swift, and beautiful, irresistible to all who meet him. Patroclus is an awkward young prince, exiled from his homeland after an act of shocking violence. Brought together by chance, they forge an inseparable bond, despite risking the gods\' wrath.', 9),
(10140, 'Gone Girl', 50, 7, 19, '10012', 'Who are you?\r\nWhat have we done to each other?\r\n\r\nThese are the questions Nick Dunne finds himself asking on the morning of his fifth wedding anniversary when his wife Amy suddenly disappears. The police suspect Nick. Amy\'s friends reveal that she was afraid of him, that she kept secrets from him.', 8),
(10141, 'Fourth Wing', 99, 4, 20, '10013', 'Enter the brutal and elite world of a war college for dragon riders from USA Today bestselling author Rebecca Yarros\r\n\r\nTwenty-year-old Violet Sorrengail was supposed to enter the Scribe Quadrant, living a quiet life among books and history. Now, the commanding general—also known as her tough-as-talons mother—has ordered Violet to join the hundreds of candidates striving to become the elite of Navarre: dragon riders.', 10),
(10142, 'Another Day', 150, 4, 21, '10014', 'Every day is the same for Rhiannon. She has accepted her life, convinced herself that she deserves her distant, temperamental boyfriend, Justin, even established guidelines by which to live: Don’t be too needy. Avoid upsetting him. Never get your hopes up.', 11),
(10143, 'Every Day', 148, 3, 21, '10015', 'Every day a different body. Every day a different life. Every day in love with the same girl.\r\nThere’s never any warning about where it will be or who it will be. A has made peace with that, even established guidelines by which to live: Never get too attached. Avoid being noticed. Do not interfere.', 11),
(10144, 'Room', 50, 6, 22, '10016', 'To five-year-old-Jack, Room is the world....\r\n\r\nTold in the inventive, funny, and poignant voice of Jack, Room is a celebration of resilience—and a powerful story of a mother and son whose love lets them survive the impossible.', 12),
(10145, 'We Were Liars', 30, 79, 23, '10017', 'A beautiful and distinguished family.\r A private island.\r A brilliant, damaged girl; a passionate, political boy.\r A group of four friends—the Liars—whose friendship turns destructive.\r A revolution. An accident. A secret.\r Lies upon lies.\r True love.\r The truth.', 13),
(10146, 'Beach Read', 80, 7, 24, '10018', 'A romance writer who no longer believes in love and a literary writer stuck in a rut engage in a summer-long challenge that may just upend everything they believe about happily ever afters.\r\n\r\nAugustus Everett is an acclaimed author of literary fiction. January Andrews writes bestselling romance. When she pens a happily ever after, he kills off his entire cast.\r\n\r\nThey’re polar opposites.', 14),
(10147, 'Circe', 100, 8, 18, '10019', 'In the house of Helios, god of the sun and mightiest of the Titans, a daughter is born. But Circe is a strange child--neither powerful like her father nor viciously alluring like her mother. Turning to the world of mortals for companionship, she discovers that she does possess power: the power of witchcraft, which can transform rivals into monsters and menace the gods themselves.', 12),
(10148, 'Fairy Tale', 120, 5, 25, '10020', 'Legendary storyteller Stephen King goes deep into the well of his imagination in this spellbinding novel about a seventeen-year-old boy who inherits the keys to a parallel world where good and evil are at war, and the stakes could not be higher—for their world or ours.', 15),
(10149, 'Pride and Prejudice', 120, 2, 26, '10021', 'Since its immediate success in 1813, Pride and Prejudice has remained one of the most popular novels in the English language. Jane Austen called this brilliant work \"her own darling child\" and its vivacious heroine, Elizabeth Bennet, \"as delightful a creature as ever appeared in print.', 16),
(10150, 'Little Women', 148, 10, 27, '10022', 'Generations of readers young and old, male and female, have fallen in love with the March sisters of Louisa May Alcott’s most popular and enduring novel, Little Women. Here are talented tomboy and author-to-be Jo, tragically frail Beth, beautiful Meg, and romantic, spoiled Amy, united in their devotion to each other and their struggles to survive in New England during the Civil War.', 17),
(10151, 'Yellowface', 79, 11, 28, '10023', 'Authors June Hayward and Athena Liu were supposed to be twin rising stars: same year at Yale, same debut year in publishing. But Athena\'s a cross-genre literary darling, and June didn\'t even get a paperback release. Nobody wants stories about basic white girls, June thinks.', 16),
(10152, 'The Martian', 180, 5, 29, '10024', 'Six days ago, astronaut Mark Watney became one of the first people to walk on Mars.\r\n\r\nNow, he’s sure he’ll be the first person to die there.', 8),
(10153, 'The Firm', 50, 8, 30, '10025', 'Mitch McDeere is a young, intelligent and ambitious lawyer. When he gets a job with a top tax law firm in Memphis, he is delighted. But he quickly becomes suspicious after mysterious deaths, obsessive office security, and the Chicago mob figure into its operations. The situation only escalates when Mitch discovers that the firm is listening in on his phone calls and that the FBI want to speak to him. Money and power has a price — and it could be Mitch\'s life.', 19),
(10154, 'The Maid', 96, 9, 31, '10026', 'Molly Gray is not like everyone else. She struggles with social skills and misreads the intentions of others. Her gran used to interpret the world for her, codifying it into simple rules that Molly could live by.', 8);

-- --------------------------------------------------------

--
-- Table structure for table `Customer`
--

CREATE TABLE `Customer` (
  `customerId` int(11) NOT NULL,
  `customerName` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `pass` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Customer`
--

INSERT INTO `Customer` (`customerId`, `customerName`, `gender`, `pass`, `email`, `address`) VALUES
(1, 'Abi', 'Female', 'Test1*', 'test@gmail.com', 'Bintaro'),
(11110, 'Joh', 'Male', 'Hello123', 'johns0n@gmail.com', 'Singapore'),
(11111, 'Tyrone', 'Male', '1134', 'tyronee@gmail.co', 'Jakarta');

-- --------------------------------------------------------

--
-- Table structure for table `Publisher`
--

CREATE TABLE `Publisher` (
  `publisherId` int(11) NOT NULL,
  `publisherName` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Publisher`
--

INSERT INTO `Publisher` (`publisherId`, `publisherName`, `address`) VALUES
(8, 'Crown Publishing Group', 'United States (New York, New York)'),
(9, 'Bloomsbury Publishing', 'United Kingdom (London, England)'),
(10, 'Entangled Publishing', 'United States (Fort Collins, Colorado)'),
(11, 'Knopf Books for Young Readers', 'United States (New York, New York)'),
(12, 'Little, Brown and Company', 'United States (New York, New York)'),
(13, 'Delacorte Press', 'United States (New York, New York)'),
(14, 'Berkley Publishing Group', 'United States (New York, New York)'),
(15, 'Scribner', 'United States (New York, New York)'),
(16, 'Unknown (Public domain - originally published by Thomas Egerton)', 'N/A (Pride and Prejudice is in the public domain)'),
(17, 'Roberts Brothers', 'United States (Boston, Massachusetts)'),
(18, 'Harper Voyager', 'United States (New York, New York)'),
(19, 'Doubleday', 'United States (New York, New York)'),
(20, 'Ballantine Books', 'United States (New York, New York)'),
(21, 'Pocket Books', 'United States (New York, New York)'),
(22, 'Jeffreyy', 'Indonesia');

-- --------------------------------------------------------

--
-- Table structure for table `Purchase`
--

CREATE TABLE `Purchase` (
  `purchaseId` int(11) NOT NULL,
  `customerId` int(11) NOT NULL,
  `deliveryTime` date NOT NULL,
  `purchaseTime` date NOT NULL,
  `quantity` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `Purchase`
--

INSERT INTO `Purchase` (`purchaseId`, `customerId`, `deliveryTime`, `purchaseTime`, `quantity`, `total`, `image`) VALUES
(21, 1, '2024-01-15', '2024-01-12', 1, 150, '21'),
(22, 1, '2024-01-15', '2024-01-12', 1, 228, '22');

-- --------------------------------------------------------

--
-- Table structure for table `rating`
--

CREATE TABLE `rating` (
  `ratingId` int(11) NOT NULL,
  `customerId` int(11) NOT NULL,
  `bookId` int(11) NOT NULL,
  `rating` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `rating`
--

INSERT INTO `rating` (`ratingId`, `customerId`, `bookId`, `rating`) VALUES
(14, 1, 10144, 5),
(15, 1, 10143, 1),
(16, 1, 10143, 4);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Admin`
--
ALTER TABLE `Admin`
  ADD PRIMARY KEY (`adminId`);

--
-- Indexes for table `Author`
--
ALTER TABLE `Author`
  ADD PRIMARY KEY (`authorId`);

--
-- Indexes for table `Book`
--
ALTER TABLE `Book`
  ADD PRIMARY KEY (`bookId`),
  ADD KEY `authorId` (`authorId`),
  ADD KEY `publisherId` (`publisherId`);

--
-- Indexes for table `Customer`
--
ALTER TABLE `Customer`
  ADD PRIMARY KEY (`customerId`);

--
-- Indexes for table `Publisher`
--
ALTER TABLE `Publisher`
  ADD PRIMARY KEY (`publisherId`);

--
-- Indexes for table `Purchase`
--
ALTER TABLE `Purchase`
  ADD PRIMARY KEY (`purchaseId`),
  ADD KEY `customerId` (`customerId`);

--
-- Indexes for table `rating`
--
ALTER TABLE `rating`
  ADD PRIMARY KEY (`ratingId`),
  ADD KEY `customerId` (`customerId`),
  ADD KEY `bookId` (`bookId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Admin`
--
ALTER TABLE `Admin`
  MODIFY `adminId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `Author`
--
ALTER TABLE `Author`
  MODIFY `authorId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT for table `Book`
--
ALTER TABLE `Book`
  MODIFY `bookId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10162;

--
-- AUTO_INCREMENT for table `Customer`
--
ALTER TABLE `Customer`
  MODIFY `customerId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11116;

--
-- AUTO_INCREMENT for table `Publisher`
--
ALTER TABLE `Publisher`
  MODIFY `publisherId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `Purchase`
--
ALTER TABLE `Purchase`
  MODIFY `purchaseId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `rating`
--
ALTER TABLE `rating`
  MODIFY `ratingId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `Book`
--
ALTER TABLE `Book`
  ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`authorId`) REFERENCES `Author` (`authorId`),
  ADD CONSTRAINT `book_ibfk_2` FOREIGN KEY (`publisherId`) REFERENCES `Publisher` (`publisherId`),
  ADD CONSTRAINT `book_ibfk_new` FOREIGN KEY (`authorId`) REFERENCES `Author` (`authorId`) ON DELETE CASCADE;

--
-- Constraints for table `Purchase`
--
ALTER TABLE `Purchase`
  ADD CONSTRAINT `purchase_ibfk_1` FOREIGN KEY (`customerId`) REFERENCES `Customer` (`customerId`);

--
-- Constraints for table `rating`
--
ALTER TABLE `rating`
  ADD CONSTRAINT `rating_ibfk_1` FOREIGN KEY (`customerId`) REFERENCES `Customer` (`customerId`),
  ADD CONSTRAINT `rating_ibfk_2` FOREIGN KEY (`bookId`) REFERENCES `Book` (`bookId`),
  ADD CONSTRAINT `rating_ibfk_new` FOREIGN KEY (`bookId`) REFERENCES `Book` (`bookId`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
