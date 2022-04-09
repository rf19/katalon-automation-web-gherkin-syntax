#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@Login
Feature: Login Feature
  sebagai user, saya ingin melakukan login
  
  Background:
  	Given halaman login sudah terload

  @valid
  Scenario Outline: login positif skenario
		When isi field email <email> benar dan password <password> benar
		And klik button login
		And klik skip di pop up ganti avatar
		Then redirect ke halaman stream

		Examples: 
      | email | password |
      | cloningan.qa@gmail.com | Kh8YlhhrrZq9lDrwnpLheQ== |

  Scenario Outline: login negatif skenario
		When isi field email <email> salah dan password <password> salah
		And klik button login
		Then tampil pesan error

		Examples: 
      | email | password |
      | cloningan@gmail.com | vVxLl0IuprE= |
		