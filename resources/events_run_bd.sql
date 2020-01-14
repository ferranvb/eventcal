-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-01-2020 a las 18:13:26
-- Versión del servidor: 5.7.17
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `events_run_bd`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `events`
--

CREATE TABLE `events` (
  `id_event` int(10) NOT NULL,
  `nom` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `descripcio` varchar(300) COLLATE utf8_unicode_ci NOT NULL,
  `lloc` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `provincia` int(2) NOT NULL,
  `pais` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `data_inici` date NOT NULL,
  `data_fi` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `events`
--

INSERT INTO `events` (`id_event`, `nom`, `descripcio`, `lloc`, `provincia`, `pais`, `data_inici`, `data_fi`) VALUES
(1, 'Cursa Test', 'Cursa de prova per saber', 'Amposta', 43, 'Catalunya', '2019-11-29', '2019-11-29'),
(2, 'Andorra Ultra Trail Vallnord', 'Ultra Andorra', 'Ordino', 0, 'Andorra', '2020-07-07', '2020-07-12');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `races`
--

CREATE TABLE `races` (
  `id_race` int(10) UNSIGNED NOT NULL,
  `nom` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `distancia` decimal(6,2) NOT NULL,
  `circular` tinyint(1) NOT NULL,
  `desnivell_pos` int(11) NOT NULL,
  `desnivell_neg` int(11) NOT NULL,
  `hora_inici` time NOT NULL,
  `temps_total` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tipus` tinyint(2) UNSIGNED NOT NULL COMMENT 'relecionat en la taula ''tipus de carreres''',
  `event` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `races`
--

INSERT INTO `races` (`id_race`, `nom`, `distancia`, `circular`, `desnivell_pos`, `desnivell_neg`, `hora_inici`, `temps_total`, `tipus`, `event`) VALUES
(1, 'Euforia', '233.00', 1, 20000, 20000, '08:00:00', '165h', 1, 2),
(2, 'Ronda dels Cims', '170.00', 1, 13500, 13500, '08:00:00', '65h', 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `races_types`
--

CREATE TABLE `races_types` (
  `id_types` tinyint(2) NOT NULL,
  `descripcio` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `races_types`
--

INSERT INTO `races_types` (`id_types`, `descripcio`) VALUES
(1, 'muntanya'),
(2, 'asfalt'),
(3, 'bicicleta muntanya'),
(4, 'triatlo'),
(5, 'cursa orientació');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `events`
--
ALTER TABLE `events`
  ADD PRIMARY KEY (`id_event`);

--
-- Indices de la tabla `races`
--
ALTER TABLE `races`
  ADD PRIMARY KEY (`id_race`);

--
-- Indices de la tabla `races_types`
--
ALTER TABLE `races_types`
  ADD PRIMARY KEY (`id_types`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `events`
--
ALTER TABLE `events`
  MODIFY `id_event` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `races`
--
ALTER TABLE `races`
  MODIFY `id_race` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT de la tabla `races_types`
--
ALTER TABLE `races_types`
  MODIFY `id_types` tinyint(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
