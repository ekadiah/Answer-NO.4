-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Mar 2021 pada 09.22
-- Versi server: 10.4.11-MariaDB
-- Versi PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `homestay`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_history_tamu`
--

CREATE TABLE `tb_history_tamu` (
  `no_tamu` varchar(20) NOT NULL,
  `nama_tamu` varchar(55) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(12) NOT NULL,
  `kode_kamar` varchar(10) NOT NULL,
  `lantai` varchar(10) NOT NULL,
  `no_kamar` varchar(10) NOT NULL,
  `tipe_kamar` varchar(10) NOT NULL,
  `harga_permalam` varchar(15) NOT NULL,
  `cek_in` varchar(30) NOT NULL,
  `cek_out` varchar(30) NOT NULL,
  `lama_menginap` varchar(20) NOT NULL,
  `total_biaya` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_history_tamu`
--

INSERT INTO `tb_history_tamu` (`no_tamu`, `nama_tamu`, `jenis_kelamin`, `alamat`, `no_tlp`, `kode_kamar`, `lantai`, `no_kamar`, `tipe_kamar`, `harga_permalam`, `cek_in`, `cek_out`, `lama_menginap`, `total_biaya`) VALUES
('1', 'Eka Diah Pramesti', 'Perempuan', 'Bekasi', '081548088667', 'A002', '1', 'A02', 'Suite', '200000', '19-3-2021', '21-3-2021', '3', '600000'),
('1920890827', 'Amran', 'Laki-laki', 'Bekasi', '09897886', 'A001', '2', 'A01', 'Deluxe', '400000', '19-03-2021', '19-03-2021', '0', '400000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_kamar`
--

CREATE TABLE `tb_kamar` (
  `kode_kamar` varchar(12) NOT NULL,
  `lantai` varchar(12) NOT NULL,
  `no_kamar` varchar(10) NOT NULL,
  `tipe_kamar` varchar(50) NOT NULL,
  `harga_permalam` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_kamar`
--

INSERT INTO `tb_kamar` (`kode_kamar`, `lantai`, `no_kamar`, `tipe_kamar`, `harga_permalam`) VALUES
('A001', '2', 'A01', 'Deluxe', '400000'),
('A002', '1', 'A02', 'Family', '800000'),
('A003', '1', 'A03', 'Family', '800000'),
('B001', '2', '2', 'Deluxe', '500000');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tb_tamu`
--

CREATE TABLE `tb_tamu` (
  `no_tamu` varchar(12) NOT NULL,
  `nama_tamu` varchar(50) NOT NULL,
  `jenis_kelamin` varchar(20) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(12) NOT NULL,
  `kode_kamar` varchar(10) NOT NULL,
  `tgl_cek_in` varchar(15) NOT NULL,
  `jam_cek_in` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tb_tamu`
--

INSERT INTO `tb_tamu` (`no_tamu`, `nama_tamu`, `jenis_kelamin`, `alamat`, `no_tlp`, `kode_kamar`, `tgl_cek_in`, `jam_cek_in`) VALUES
('1', 'Eka Diah Pramesti', 'Perempuan', 'Bekasi', '081548088667', 'A002', '19-03-2021', '12:00'),
('24356789', 'aewsrtdyf', 'Laki-laki', 'zxcgvj', '09876', 'A001', '19-03-2021', '15:20:45');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `tb_history_tamu`
--
ALTER TABLE `tb_history_tamu`
  ADD PRIMARY KEY (`no_tamu`);

--
-- Indeks untuk tabel `tb_kamar`
--
ALTER TABLE `tb_kamar`
  ADD PRIMARY KEY (`kode_kamar`);

--
-- Indeks untuk tabel `tb_tamu`
--
ALTER TABLE `tb_tamu`
  ADD PRIMARY KEY (`no_tamu`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
