-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2025 a las 22:36:34
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `protectora`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `animales`
--

CREATE TABLE `animales` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(100) DEFAULT NULL,
  `Tipo` varchar(50) DEFAULT NULL,
  `Sexo` varchar(50) DEFAULT NULL,
  `Edad` int(11) DEFAULT NULL,
  `Sociable` tinyint(1) DEFAULT NULL,
  `Apadrinado` tinyint(1) DEFAULT NULL,
  `Raza` varchar(100) DEFAULT NULL,
  `Tamaño` decimal(5,2) DEFAULT NULL,
  `PPP` tinyint(1) DEFAULT NULL,
  `Leishmania` tinyint(1) DEFAULT NULL,
  `Esterilizado` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `animales`
--

INSERT INTO `animales` (`ID`, `Nombre`, `Tipo`, `Sexo`, `Edad`, `Sociable`, `Apadrinado`, `Raza`, `Tamaño`, `PPP`, `Leishmania`, `Esterilizado`) VALUES
(1, 'Max', 'Perro', 'Macho', 3, 1, 0, 'Labrador', 25.00, 0, 0, 0),
(2, 'Luna', 'Gato', 'Hembra', 2, 1, 1, NULL, NULL, NULL, NULL, 1),
(3, 'Rocky', 'Perro', 'Macho', 5, 0, 1, 'Bulldog', 30.00, 1, 1, 0),
(4, 'Simba', 'Gato', 'Macho', 1, 1, 0, NULL, NULL, NULL, NULL, 1),
(5, 'Lila', 'Perro', 'Hembra', 2, 1, 0, 'Golden Retriever', 20.00, 0, 0, 0),
(6, 'Garfield', 'Gato', 'Macho', 4, 1, 1, NULL, NULL, NULL, NULL, 0),
(7, 'Nala', 'Gato', 'Hembra', 3, 1, 0, NULL, NULL, NULL, NULL, 0),
(8, 'Bruno', 'Perro', 'Macho', 4, 1, 0, 'Boxer', 28.00, 0, 1, 0),
(9, 'Toby', 'Perro', 'Macho', 1, 1, 1, 'Chihuahua', 3.50, 0, 0, 1),
(10, 'Bella', 'Gato', 'Hembra', 5, 1, 0, NULL, NULL, NULL, NULL, 1),
(11, 'Buddy', 'Perro', 'Macho', 7, 1, 1, 'Beagle', 15.00, 0, 0, 0),
(12, 'Oreo', 'Gato', 'Hembra', 2, 1, 0, NULL, NULL, NULL, NULL, 1),
(13, 'Lucy', 'Perro', 'Hembra', 3, 1, 0, 'Cocker Spaniel', 18.00, 0, 0, 1),
(14, 'Leo', 'Gato', 'Macho', 6, 0, 0, NULL, NULL, NULL, NULL, 0),
(15, 'Molly', 'Perro', 'Hembra', 4, 1, 1, 'Dálmata', 22.00, 0, 1, 0),
(16, 'Whiskers', 'Gato', 'Macho', 2, 1, 0, NULL, NULL, NULL, NULL, 0),
(17, 'Lucky', 'Perro', 'Macho', 8, 0, 0, 'Pastor Alemán', 30.00, 1, 0, 1),
(18, 'Sasha', 'Gato', 'Hembra', 1, 1, 0, NULL, NULL, NULL, NULL, 0),
(19, 'Rocky', 'Perro', 'Macho', 2, 1, 0, 'Pitbull', 28.00, 1, 0, 1),
(20, 'Ginger', 'Gato', 'Hembra', 7, 1, 1, NULL, NULL, NULL, NULL, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gastofecha`
--

CREATE TABLE `gastofecha` (
  `ID` int(11) NOT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  `gasto` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `gastofecha`
--

INSERT INTO `gastofecha` (`ID`, `fecha`, `gasto`) VALUES
(1, '2024-05-01', 100.5),
(2, '2024-05-03', 75.2),
(3, '2024-05-08', 120.75),
(4, '2024-05-12', 90),
(5, NULL, 1016),
(6, NULL, 1016),
(7, NULL, 1016);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `animales`
--
ALTER TABLE `animales`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `gastofecha`
--
ALTER TABLE `gastofecha`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `animales`
--
ALTER TABLE `animales`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `gastofecha`
--
ALTER TABLE `gastofecha`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
