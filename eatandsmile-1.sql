-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : Dim 04 juin 2023 à 21:36
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `eatandsmile`
--

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `id_client` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `mail_user` varchar(255) NOT NULL,
  `number_user` int(13) NOT NULL,
  `adress_client` varchar(255) NOT NULL,
  `link_client` varchar(255) NOT NULL,
  `id_product` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_client`),
  KEY `id_user` (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`id_client`, `id_user`, `name`, `lastName`, `mail_user`, `number_user`, `adress_client`, `link_client`, `id_product`) VALUES
(1, 2, 'Randall', 'Fuentes', 'magna.nec@aol.edu', 56457534, 'Ap #826-9243 Eleifend. Road', 'https://nytimes.com', NULL),
(2, 18, 'Patrick', 'Mcbride', 'non.lorem@yahoo.couk', 128566731, 'Ap #230-1299 Nec Ave', 'https://wikipedia.org', NULL),
(3, 22, 'Driscoll', 'Gutierrez', 'pede.nec@protonmail.ca', 434422446, 'P.O. Box 105, 9233 Nibh. Road', 'https://guardian.co.uk', NULL),
(4, 24, 'Asher', 'Jackson', 'luctus.ut@hotmail.couk', 454816464, '838-3025 Semper St.', 'http://wikipedia.org', NULL),
(5, 34, 'Christine', 'Randolph', 'enim.etiam@protonmail.couk', 215407938, 'P.O. Box 250, 4670 Ultricies Rd', 'http://instagram.com', NULL),
(6, 37, 'Cain', 'Cooley', 'a.dui@aol.couk', 371520525, '986-9931 Nibh Avenue', 'https://facebook.com', NULL),
(7, 39, 'Amena', 'Marsh', 'lobortis.mauris.suspendisse@yahoo.ca', 610315101, '610-9051 Lobortis St.', 'https://reddit.com', NULL),
(8, 45, 'Rigel', 'Prince', 'diam@protonmail.com', 363787319, 'P.O. Box 320, 3325 Non St.', 'http://wikipedia.org', NULL),
(9, 57, 'Damian', 'Roy', 'nunc.est@hotmail.net', 951314604, 'Ap #386-5157 Mattis Road', 'https://ebay.com', NULL),
(10, 58, 'Garrett', 'Waller', 'quam@icloud.couk', 651386551, '713-8175 Vel Rd.', 'https://wikipedia.org', NULL),
(11, 61, 'Carlos', 'Atkins', 'massa.suspendisse.eleifend@hotmail.com', 243423767, 'Ap #319-9616 Orci, Av.', 'https://ebay.com', NULL),
(12, 70, 'Xyla', 'Kelley', 'eget.lacus@yahoo.ca', 825566852, 'Ap #213-1403 Quis Ave', 'https://guardian.co.uk', NULL),
(13, 73, 'Illana', 'Allen', 'vitae.posuere@protonmail.ca', 458819297, '350-4562 Cursus Rd.', 'https://ebay.com', NULL),
(14, 74, 'Hiroko', 'Vance', 'dignissim.magna@icloud.edu', 847665926, 'P.O. Box 973, 6087 Eu Av.', 'http://pinterest.com', NULL),
(15, 76, 'Alexander', 'Montgomery', 'tempus.lorem@protonmail.edu', 690360534, 'Ap #859-414 Tincidunt. Ave', 'http://instagram.com', NULL),
(16, 78, 'Ulysses', 'Holder', 'euismod.ac.fermentum@hotmail.edu', 434271574, 'Ap #846-8588 Dictum Avenue', 'https://yahoo.com', NULL),
(17, 80, 'Josiah', 'Rush', 'gravida.nunc.sed@hotmail.edu', 779588046, '636-2733 Adipiscing. Rd.', 'http://facebook.com', NULL),
(18, 86, 'Tyler', 'Rodgers', 'turpis.in.condimentum@protonmail.edu', 232941478, '337-5808 Tristique St.', 'http://google.com', NULL),
(19, 92, 'Pandora', 'Barr', 'id.blandit@yahoo.net', 611276891, 'Ap #149-2963 Purus, Rd.', 'http://ebay.com', NULL),
(20, 94, 'Zachary', 'Salas', 'donec@icloud.ca', 411474734, '832-848 In, Avenue', 'https://whatsapp.com', NULL),
(21, 95, 'Margaret', 'Clark', 'amet@aol.org', 564040157, 'P.O. Box 607, 4292 Pharetra Rd.', 'https://walmart.com', NULL),
(22, 96, 'Alyssa', 'Rush', 'neque.nullam.ut@google.org', 745206601, '6374 Risus, Ave', 'http://zoom.us', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `deliveryman`
--

DROP TABLE IF EXISTS `deliveryman`;
CREATE TABLE IF NOT EXISTS `deliveryman` (
  `id_deliveryman` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `name` longtext NOT NULL,
  `lastName` varchar(30) NOT NULL,
  `RIB` varchar(255) NOT NULL,
  PRIMARY KEY (`id_deliveryman`),
  KEY `id_user` (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `deliveryman`
--

INSERT INTO `deliveryman` (`id_deliveryman`, `id_user`, `name`, `lastName`, `RIB`) VALUES
(1, 1, 'Olga', 'Little', 'MT71LIKC36233702998641464655627'),
(2, 5, 'Olga', 'Shelton', 'GE74913785150450531648'),
(3, 6, 'Dacey', 'English', 'TN1312862375546477858952'),
(4, 7, 'Chaim', 'Pittman', 'AE365772637187017710782'),
(5, 8, 'Peter', 'Simon', 'MU6484964197883765954688810770'),
(6, 17, 'Madison', 'Rhodes', 'KZ175561613852376518'),
(7, 19, 'Myles', 'Bridges', 'HR8708851311168216356'),
(8, 21, 'Francis', 'Lindsay', 'LU518825214602626174'),
(9, 23, 'Kirk', 'Whitehead', 'MU9811846536135478168243287014'),
(10, 25, 'Chelsea', 'Larson', 'RO39CJFF1326538403482138'),
(11, 26, 'Carly', 'Barr', 'IE43QMKA72959321265852'),
(12, 27, 'Haley', 'Whitney', 'CR8861318096288583722'),
(13, 28, 'Colorado', 'Stone', 'FR2754720684275547527617753'),
(14, 29, 'Cecilia', 'Sargent', 'BG58AYZY29579312119187'),
(15, 30, 'Hadley', 'Love', 'MT04ZXDO71011822132195318432958'),
(16, 32, 'Mara', 'Peck', 'CZ8931625619186254824285'),
(17, 33, 'Grady', 'Colon', 'EE118537497347789644'),
(18, 38, 'Xaviera', 'Odom', 'GT81255575164435588184742342'),
(19, 48, 'Gage', 'Day', 'PK7712188914236131798258'),
(20, 49, 'Graiden', 'Clarke', 'GB28PNHV29826388038116'),
(21, 62, 'Carter', 'Rosa', 'AT831118954714814462'),
(22, 68, 'Sandra', 'Clemons', 'SI76805632325353212'),
(23, 75, 'Jordan', 'Dudley', 'PS070532328556667527649698474'),
(24, 81, 'Abbot', 'Powell', 'SK6062224062885272331010'),
(25, 83, 'Allistair', 'Richards', 'MD2194737355532523381997'),
(26, 87, 'Dawn', 'Hancock', 'SI02338258061917367'),
(27, 91, 'Dai', 'Young', 'MK93941616814568857'),
(28, 93, 'Sylvia', 'Osborn', 'IS792550259141845442678625');

-- --------------------------------------------------------

--
-- Structure de la table `producer`
--

DROP TABLE IF EXISTS `producer`;
CREATE TABLE IF NOT EXISTS `producer` (
  `id_produceur` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `adress_producer` varchar(255) NOT NULL,
  `link_mapproducer` varchar(255) NOT NULL,
  PRIMARY KEY (`id_produceur`),
  KEY `id_user` (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `producer`
--

INSERT INTO `producer` (`id_produceur`, `id_user`, `name`, `adress_producer`, `link_mapproducer`) VALUES
(1, 4, 'Garrison', '3545 Quisque St.', 'http://instagram.com'),
(2, 9, 'Gary', '818-8830 Habitant Road', 'http://reddit.com'),
(3, 10, 'Holly', '179-2437 Eu Rd.', 'http://guardian.co.uk'),
(4, 12, 'Andrew', '250-2493 Sapien Av.', 'http://baidu.com'),
(5, 14, 'Kirk', '788-8175 Curabitur St.', 'http://zoom.us'),
(6, 15, 'Kylee', 'P.O. Box 214, 2031 Nisl Road', 'https://google.com'),
(7, 20, 'Orson', '164-3968 Convallis Av.', 'http://zoom.us'),
(8, 31, 'Deborah', '703-8769 Pellentesque Av.', 'http://bbc.co.uk'),
(9, 36, 'Peter', '778-2316 Non, Street', 'http://yahoo.com'),
(10, 40, 'Clarke', 'Ap #819-8381 Ornare, St.', 'http://reddit.com'),
(11, 44, 'Whilemina', 'Ap #155-9641 Est. Street', 'https://google.com'),
(12, 46, 'Alexander', '465-5821 Semper Ave', 'http://twitter.com'),
(13, 50, 'Rooney', 'Ap #926-5623 A Avenue', 'http://walmart.com'),
(14, 51, 'Harlan', '515-5714 Sit St.', 'http://baidu.com'),
(15, 53, 'Beatrice', 'Ap #983-2777 Dolor, Avenue', 'http://pinterest.com'),
(16, 54, 'Amir', 'Ap #554-9728 Volutpat. Street', 'http://nytimes.com'),
(17, 55, 'Octavius', 'P.O. Box 354, 4656 Orci Rd.', 'https://naver.com'),
(18, 66, 'April', 'P.O. Box 653, 4143 In Road', 'http://instagram.com'),
(19, 67, 'Fitzgerald', '149-398 Lobortis. St.', 'http://pinterest.com'),
(20, 72, 'Jermaine', 'Ap #352-2417 Phasellus St.', 'https://whatsapp.com'),
(21, 77, 'Aiko', '857-7137 Cursus. Av.', 'https://zoom.us'),
(22, 82, 'Belle', '1453 Dui. St.', 'http://zoom.us'),
(23, 84, 'Neville', '5882 Mattis. Rd.', 'https://guardian.co.uk'),
(24, 85, 'Martha', 'P.O. Box 806, 1020 Donec St.', 'https://google.com'),
(25, 89, 'Iris', 'Ap #369-6687 Non, Av.', 'http://google.com'),
(26, 90, 'Noble', 'Ap #620-6679 Et, Ave', 'https://zoom.us'),
(27, 97, 'Katelyn', '3624 Nec Rd.', 'http://zoom.us'),
(28, 98, 'Laith', 'P.O. Box 554, 4822 Nunc Ave', 'https://wikipedia.org'),
(29, 99, 'Alden', '197-4808 Eleifend Avenue', 'https://baidu.com'),
(30, 100, 'Blossom', 'Ap #673-8305 Interdum Ave', 'https://nytimes.com');

-- --------------------------------------------------------

--
-- Structure de la table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE IF NOT EXISTS `product` (
  `id_product` int(11) NOT NULL AUTO_INCREMENT,
  `name_product` varchar(255) DEFAULT NULL,
  `id_producer` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_product`),
  KEY `id_producer` (`id_producer`)
) ENGINE=MyISAM AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `product`
--

INSERT INTO `product` (`id_product`, `name_product`, `id_producer`) VALUES
(1, 'rutrum lorem ac', 13),
(2, 'neque vitae', 20),
(3, 'justo eu', 15),
(4, 'ligula. Aenean gravida', 1),
(5, 'mollis vitae,', 27),
(6, 'egestas ligula. Nullam', 23),
(7, 'erat volutpat. Nulla', 10),
(8, 'parturient montes,', 20),
(9, 'vitae risus.', 5),
(10, 'malesuada', 5),
(11, 'Nam nulla magna,', 9),
(12, 'a, auctor', 2),
(13, 'libero', 14),
(14, 'turpis non enim.', 27),
(15, 'euismod mauris', 1),
(16, 'augue,', 12),
(17, 'convallis dolor.', 12),
(18, 'nec, diam.', 1),
(19, 'ut, sem. Nulla', 10),
(20, 'lobortis ultrices.', 6),
(21, 'Nullam', 22),
(22, 'molestie pharetra', 22),
(23, 'mauris eu', 14),
(24, 'sit amet, consectetuer', 20),
(25, 'gravida non,', 30),
(26, 'non nisi. Aenean', 8),
(27, 'Donec non', 4),
(28, 'litora torquent per', 26),
(29, 'at, egestas', 7),
(30, 'massa. Suspendisse eleifend.', 2),
(31, 'sem molestie sodales.', 23),
(32, 'Nullam lobortis', 1),
(33, 'molestie tortor', 23),
(34, 'pellentesque eget, dictum', 18),
(35, 'mauris ut', 18),
(36, 'tempus,', 6),
(37, 'nisi. Aenean', 27),
(38, 'ornare, lectus', 13),
(39, 'dictum cursus.', 28),
(40, 'sit amet,', 16),
(41, 'consectetuer mauris id', 10),
(42, 'mi, ac mattis', 17),
(43, 'scelerisque dui. Suspendisse', 27),
(44, 'a,', 10),
(45, 'quis', 7),
(46, 'imperdiet nec, leo.', 15),
(47, 'cursus luctus, ipsum', 16),
(48, 'eu, odio. Phasellus', 24),
(49, 'Aenean eget', 24),
(50, 'pretium et,', 23),
(51, 'Suspendisse', 6),
(52, 'Aliquam vulputate', 1),
(53, 'in, cursus et,', 13),
(54, 'hendrerit. Donec', 27),
(55, 'id ante', 26),
(56, 'ut quam vel', 22),
(57, 'aliquet libero. Integer', 16),
(58, 'ut nisi', 26),
(59, 'ultricies ligula. Nullam', 21),
(60, 'sollicitudin', 5),
(61, 'vitae sodales', 20),
(62, 'quam. Pellentesque', 27),
(63, 'neque sed', 2),
(64, 'in, tempus', 25),
(65, 'Donec vitae erat', 25),
(66, 'adipiscing', 7),
(67, 'non, lacinia at,', 16),
(68, 'faucibus. Morbi', 11),
(69, 'Nunc ullamcorper,', 13),
(70, 'Curabitur ut odio', 1),
(71, 'vel', 8),
(72, 'lectus ante', 10),
(73, 'nec tempus', 3),
(74, 'Nunc ut erat.', 4),
(75, 'nonummy ut, molestie', 11),
(76, 'tincidunt.', 23),
(77, 'eu, eleifend', 15),
(78, 'egestas, urna justo', 7),
(79, 'nunc interdum', 18),
(80, 'consequat purus. Maecenas', 26),
(81, 'tristique pellentesque,', 28),
(82, 'sagittis.', 23),
(83, 'non', 4),
(84, 'nec, malesuada', 9),
(85, 'tempus, lorem fringilla', 3),
(86, 'a sollicitudin orci', 6),
(87, 'bibendum fermentum', 0),
(88, 'penatibus et magnis', 17),
(89, 'pellentesque. Sed', 8),
(90, 'lobortis quam', 2),
(91, 'odio vel', 0),
(92, 'Nunc mauris', 27),
(93, 'Phasellus at', 19),
(94, 'ac, eleifend', 19),
(95, 'non, cursus', 21),
(96, 'Sed et', 19),
(97, 'Sed id', 29),
(98, 'tortor. Nunc commodo', 22),
(99, 'risus, at', 11),
(100, 'fringilla euismod enim.', 24);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `mail_user` varchar(50) NOT NULL,
  `mdp` varchar(255) NOT NULL,
  `typeofuser` int(11) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id_user`, `mail_user`, `mdp`, `typeofuser`) VALUES
(1, 'vitae@protonmail.net', 'nunc.', 2),
(2, 'magna.nec@aol.edu', 'tristique', 1),
(3, 'cursus.non@yahoo.com', 'ultrices', 4),
(4, 'magna.a.tortor@icloud.edu', 'lorem', 3),
(5, 'iaculis@outlook.edu', 'nec,', 2),
(6, 'massa.suspendisse@hotmail.org', 'libero', 2),
(7, 'in.faucibus.orci@outlook.ca', 'scelerisque,', 2),
(8, 'amet.orci@outlook.ca', 'risus.', 2),
(9, 'pulvinar@icloud.org', 'Nullam', 3),
(10, 'pellentesque.ut@protonmail.org', 'dictum', 3),
(11, 'dictum.placerat.augue@google.com', 'tincidunt', 0),
(12, 'ullamcorper.duis@outlook.ca', 'euismod', 3),
(13, 'justo.nec@hotmail.com', 'litora', 0),
(14, 'elit.a@yahoo.net', 'lacus.', 3),
(15, 'enim.curabitur@aol.org', 'enim,', 3),
(16, 'pede@yahoo.com', 'pellentesque.', 4),
(17, 'vehicula@outlook.edu', 'vitae', 2),
(18, 'non.lorem@yahoo.couk', 'Aliquam', 1),
(19, 'molestie.dapibus@outlook.com', 'et,', 2),
(20, 'lacus.aliquam@icloud.couk', 'neque.', 3),
(21, 'ligula.donec@protonmail.net', 'libero', 2),
(22, 'pede.nec@protonmail.ca', 'vestibulum', 1),
(23, 'auctor@yahoo.ca', 'elementum', 2),
(24, 'luctus.ut@hotmail.couk', 'ante,', 1),
(25, 'nullam.ut@icloud.edu', 'pharetra.', 2),
(26, 'lectus.pede@yahoo.edu', 'euismod', 2),
(27, 'id.blandit.at@google.couk', 'libero.', 2),
(28, 'integer.mollis.integer@aol.com', 'Quisque', 2),
(29, 'pellentesque.sed@hotmail.edu', 'molestie', 2),
(30, 'eleifend@hotmail.couk', 'Nunc', 2),
(31, 'morbi.tristique@aol.org', 'elementum', 3),
(32, 'orci@protonmail.edu', 'Mauris', 2),
(33, 'fringilla@hotmail.com', 'facilisis', 2),
(34, 'enim.etiam@protonmail.couk', 'vel,', 1),
(35, 'non.nisi@google.net', 'Quisque', 0),
(36, 'ac.eleifend@protonmail.org', 'accumsan', 3),
(37, 'a.dui@aol.couk', 'non,', 1),
(38, 'non@yahoo.net', 'Donec', 2),
(39, 'lobortis.mauris.suspendisse@yahoo.ca', 'malesuada.', 1),
(40, 'malesuada.malesuada.integer@protonmail.org', 'turpis.', 3),
(41, 'ut@protonmail.edu', 'elit.', 4),
(42, 'venenatis@hotmail.edu', 'venenatis', 0),
(43, 'fringilla.est.mauris@icloud.ca', 'turpis', 0),
(44, 'nascetur.ridiculus@icloud.org', 'dolor', 3),
(45, 'diam@protonmail.com', 'Sed', 1),
(46, 'sit.amet.nulla@icloud.ca', 'nec', 3),
(47, 'amet@yahoo.ca', 'luctus,', 4),
(48, 'velit@protonmail.org', 'eu,', 2),
(49, 'phasellus.nulla.integer@hotmail.ca', 'lobortis', 2),
(50, 'libero.at.auctor@outlook.com', 'tincidunt', 3),
(51, 'quis@google.edu', 'diam', 3),
(52, 'phasellus@google.org', 'adipiscing', 4),
(53, 'ante@outlook.net', 'id', 3),
(54, 'quisque.tincidunt@protonmail.net', 'eu', 3),
(55, 'congue@google.couk', 'ultricies', 3),
(56, 'varius.nam.porttitor@icloud.couk', 'orci', 0),
(57, 'nunc.est@hotmail.net', 'nisi', 1),
(58, 'quam@icloud.couk', 'at,', 1),
(59, 'urna.justo.faucibus@protonmail.edu', 'magna.', 4),
(60, 'porttitor.interdum@icloud.ca', 'eu', 4),
(61, 'massa.suspendisse.eleifend@hotmail.com', 'commodo', 1),
(62, 'cras.interdum@hotmail.couk', 'eu,', 2),
(63, 'ornare@outlook.couk', 'Nunc', 0),
(64, 'risus@hotmail.net', 'a,', 4),
(65, 'sapien@google.couk', 'accumsan', 0),
(66, 'etiam.ligula.tortor@icloud.net', 'magnis', 3),
(67, 'fringilla.est.mauris@aol.edu', 'nascetur', 3),
(68, 'egestas@yahoo.org', 'sapien', 2),
(69, 'fermentum.arcu@icloud.org', 'enim.', 4),
(70, 'eget.lacus@yahoo.ca', 'dolor', 1),
(71, 'purus.gravida@google.com', 'lacus.', 0),
(72, 'sociis.natoque.penatibus@aol.ca', 'ullamcorper', 3),
(73, 'vitae.posuere@protonmail.ca', 'elit', 1),
(74, 'dignissim.magna@icloud.edu', 'Morbi', 1),
(75, 'volutpat@hotmail.com', 'nisi', 2),
(76, 'tempus.lorem@protonmail.edu', 'cursus', 1),
(77, 'euismod@aol.edu', 'Quisque', 3),
(78, 'euismod.ac.fermentum@hotmail.edu', 'ligula.', 1),
(79, 'a.dui@hotmail.net', 'cubilia', 0),
(80, 'gravida.nunc.sed@hotmail.edu', 'Donec', 1),
(81, 'eleifend.cras@yahoo.ca', 'Nullam', 2),
(82, 'etiam@aol.edu', 'luctus', 3),
(83, 'tempus.risus@aol.couk', 'semper', 2),
(84, 'eleifend.egestas@outlook.net', 'sit', 3),
(85, 'tempor.erat@google.ca', 'nec', 3),
(86, 'turpis.in.condimentum@protonmail.edu', 'vitae', 1),
(87, 'semper@icloud.ca', 'lacus.', 2),
(88, 'aliquam.gravida@outlook.ca', 'enim.', 4),
(89, 'neque.nullam.nisl@protonmail.net', 'feugiat.', 3),
(90, 'orci.consectetuer@yahoo.edu', 'eros.', 3),
(91, 'nec.euismod.in@icloud.couk', 'nunc', 2),
(92, 'id.blandit@yahoo.net', 'fermentum', 1),
(93, 'vel@protonmail.org', 'nibh', 2),
(94, 'donec@icloud.ca', 'nibh.', 1),
(95, 'amet@aol.org', 'neque', 1),
(96, 'neque.nullam.ut@google.org', 'nulla', 1),
(97, 'non.feugiat.nec@aol.edu', 'et', 3),
(98, 'varius.ultrices.mauris@google.org', 'amet', 3),
(99, 'natoque@aol.couk', 'neque', 3),
(100, 'elit.etiam.laoreet@protonmail.org', 'Mauris', 3);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
