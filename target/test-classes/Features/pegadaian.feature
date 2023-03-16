Feature: Pegadaian Gadai Emas

  @Test_1
  Scenario: User success simulasi gadai emas
    Given Open website Sahabat Pegadaian
    When User click menu modal
    And User click menu "Simulasi"
    And User click menu "Simulasi Gadai"
    And User click menu "Gadai Emas"
    And User click menu " Tambah Jaminan"
    And User click dropdown "Pilih Jenis Emas"
    And User click dropdown "Perhiasan"
    And User click dropdown "Pilih Jenis Perhiasan"
    And User click dropdown "Cincin"
    And User click dropdown "Pilih Kadar"
    And User click dropdown "24 Karat"
    And User input berat "25" gram
    And User click menu "Simpan"
    Then User can see item jaminan
    And User click dropdown "Pilih Fitur Produk"
    And User click dropdown "Reguler"
    And User click dropdown "Pilih Jangka Waktu"
    And User click dropdown "120 Hari"
    And User can see total uang muka
    And User click menu "Download Simulasi"
    And User input email "ahmadsutarji15@gmail.com"
    And User click checkbox Tnc
    And User click donwload simulasi modal button
    And User success donwload simulasi
















