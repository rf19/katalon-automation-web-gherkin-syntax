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
@Menu
Feature: Menu di homepage
  sebagai user, saya ingin melihat halaman di setiap meni di homepage
  
  Background:
  	Given homepage sudah terload

  @tes
  Scenario Outline: Menu Investing
    When klik menu investing
    Then redirect ke halaman investing
    
  Scenario Outline: Menu pro tools
    When klik menu pro tools
    Then redirect ke halaman pro tools
    
  Scenario Outline: Menu academy
    When klik menu academy
    Then tab baru terbuka academy
    Then redirect ke halaman academy
    
  Scenario Outline: Menu about us
    When klik menu about us
    Then redirect ke halaman about us
    
  Scenario Outline: Menu blog
    When klik menu blog
    Then tab baru terbuka blog
    Then redirect ke halaman blog
    
  Scenario Outline: Menu help
    When klik menu help
    Then tab baru terbuka help
    Then redirect ke halaman help
    
  Scenario Outline: Menu login
    When klik menu login
    Then redirect ke halaman login
    
  Scenario Outline: Menu sign up
    When klik menu sign up
    Then redirect ke halaman sign up
  
