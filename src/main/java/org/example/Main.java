package org.example;

import java.util.Scanner;

public class Main {
    static class Person{
        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public long getNumberOfPhone() {
            return numberOfPhone;
        }

        public void setNumberOfPhone(long numberOfPhone) {
            this.numberOfPhone = numberOfPhone;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        String fullName;
        String dateOfBirth;
        long numberOfPhone;
        String city;
        String country;
        String address;

        Person(){
        }
        Person(String fullName,String dateOfBirth,long numberOfPhone,String city,String country,String address){
            this.fullName = fullName;
            this.dateOfBirth = dateOfBirth;
            this.numberOfPhone = numberOfPhone;
            this.city = city;
            this.country = country;
            this.address = address;
        }

        void SetInfo(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter fullName: ");
            this.fullName = scanner.nextLine();
            System.out.print("Enter Date of Birth: ");
            this.dateOfBirth = scanner.nextLine();
            System.out.print("Enter number of phone: ");
            this.numberOfPhone = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Enter city: ");
            this.city = scanner.nextLine();
            System.out.print("Enter country: ");
            this.country = scanner.nextLine();
            System.out.print("Enter address: ");
            this.address = scanner.nextLine();
        }

        void ShowInfo(){
            System.out.println("Full name: "+ this.fullName);
            System.out.println("Date of Birth: "+ this.dateOfBirth);
            System.out.println("Number Of Phone: "+ this.numberOfPhone);
            System.out.println("City: "+ this.city);
            System.out.println("Country: "+ this.country);
            System.out.println("Address: "+ this.address);
        }



    }

    static class City{
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getNameOfCounty() {
            return nameOfCounty;
        }

        public void setNameOfCounty(String nameOfCounty) {
            this.nameOfCounty = nameOfCounty;
        }

        public long getCountOfPeople() {
            return countOfPeople;
        }

        public void setCountOfPeople(long countOfPeople) {
            this.countOfPeople = countOfPeople;
        }

        public String getPostCode() {
            return postCode;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }

        public String getPhoneCode() {
            return phoneCode;
        }

        public void setPhoneCode(String phoneCode) {
            this.phoneCode = phoneCode;
        }

        public City(String name, String region, String nameOfCounty, long countOfPeople, String postCode, String phoneCode) {
            this.name = name;
            this.region = region;
            this.nameOfCounty = nameOfCounty;
            this.countOfPeople = countOfPeople;
            this.postCode = postCode;
            this.phoneCode = phoneCode;
        }

        String name;
        String region;
        String nameOfCounty;
        long countOfPeople;
        String postCode;
        String phoneCode;
        public City(){

        }
        public void SetInfo(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name of city: ");
            this.name = scanner.nextLine();
            System.out.print("Enter name of region: ");
            this.region = scanner.nextLine();
            System.out.print("Enter name of country: ");
            this.nameOfCounty = scanner.nextLine();
            System.out.print("Enter count of people: ");
            this.countOfPeople = scanner.nextLong();
            scanner.nextLine();
            System.out.print("Enter post code: ");
            this.postCode = scanner.nextLine();
            System.out.print("Enter phoneCode: ");
            this.phoneCode = scanner.nextLine();
        }

        public void GetInfo(){
            System.out.println("Name of city: " + this.name);
            System.out.println("Name of region: " + this.region);
            System.out.println("Name of country: " + this.nameOfCounty);
            System.out.println("Count of people: " + this.countOfPeople);
            System.out.println("PostCode: " + this.postCode);
            System.out.println("Phone code: " + this.phoneCode);
        }


    }

    static class Country{
        String nameOfCountry;
        String continent;
        long countOfPeople;
        String nameOfCapital;


        public String getNameOfCountry() {
            return nameOfCountry;
        }

        public void setNameOfCountry(String nameOfCountry) {
            this.nameOfCountry = nameOfCountry;
        }

        public String getContinent() {
            return continent;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        public long getCountOfPeople() {
            return countOfPeople;
        }

        public void setCountOfPeople(long countOfPeople) {
            this.countOfPeople = countOfPeople;
        }

        public int getPhoneCode() {
            return phoneCode;
        }

        public void setPhoneCode(int phoneCode) {
            this.phoneCode = phoneCode;
        }

        public String getNameOfCapital() {
            return nameOfCapital;
        }

        public void setNameOfCapital(String nameOfCapital) {
            this.nameOfCapital = nameOfCapital;
        }

        int phoneCode;

        public Country(String nameOfCountry, String continent, long countOfPeople, int phoneCode, String nameOfCapital) {
            this.nameOfCountry = nameOfCountry;
            this.continent = continent;
            this.countOfPeople = countOfPeople;
            this.phoneCode = phoneCode;
            this.nameOfCapital = nameOfCapital;
        }


        public void SetInfo(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Country: ");
            this.nameOfCountry = scanner.nextLine();
            System.out.print("Enter name of continent: ");
            this.continent = scanner.nextLine();
            System.out.print("Enter name of Capital: ");
            this.nameOfCapital = scanner.nextLine();
            System.out.print("Enter count of people: ");
            this.countOfPeople = scanner.nextLong();
            System.out.print("Enter phone code: ");
            this.phoneCode = scanner.nextInt();
        }

        public void GetInfo(){
            System.out.println("Name of country: " + this.nameOfCountry);
            System.out.println("Name of continent: " + this.continent);
            System.out.println("Name of capital: " + this.nameOfCapital);
            System.out.println("Count of people: " + this.countOfPeople);
            System.out.println("Phone code: " + this.phoneCode);
        }
        public Country(){}

    }

    static class Fraction{
        int numerator;
        int denominator;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            if(denominator == 0)
                this.denominator = 1;
            else
                this.denominator = denominator;
        }

        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            if(denominator == 0)
                this.denominator = 1;
            else
                this.denominator = denominator;
        }

        public void SetFraction(){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter numerator: ");
            this.numerator = scanner.nextInt();
            System.out.print("Enter denominator: ");
            this.denominator = scanner.nextInt();
        }

        public void GetFraction(){
            System.out.println(this.numerator + "/" + this.denominator);
        }

        public void add(Fraction other){
            if(this.denominator!=other.denominator){
                this.denominator = this.denominator*other.denominator;
                this.numerator = this.numerator*other.denominator + this.denominator*other.numerator;
            }
            else{
                this.numerator = this.numerator+ other.numerator;
            }
        }

        public void minus(Fraction other){
            if(this.denominator!=other.denominator){
                this.denominator = this.denominator*other.denominator;
                this.numerator = this.numerator*other.denominator - this.denominator*other.numerator;
            }
            else{
                this.numerator = this.numerator - other.numerator;
            }
        }

        public void mult(Fraction other){
            this.denominator = this.denominator*other.denominator;
            this.numerator = this.numerator * other.numerator;
        }

        public void div(Fraction other){
            if(this.numerator==0 || other.numerator == 0){
                System.out.println("Divide by zero");
            }
            else{
                this.numerator = this.numerator*other.denominator;
                this.denominator = this.denominator*other.numerator;
            }
        }
    }
    public static void main(String[] args) {
//        Person person = new Person();
//        person.SetInfo();
//        person.ShowInfo();

//        City city = new City();
//        city.SetInfo();
//        city.GetInfo();

//        Country country = new Country();
//        country.SetInfo();
//        country.GetInfo();

        Fraction drob1 = new Fraction(3,4);
        Fraction drob2 = new Fraction(2,11);
        drob1.GetFraction();
        drob1.add(drob2);
        drob1.GetFraction();
        drob1.minus(drob2);
        drob1.GetFraction();
        drob1.mult(drob2);
        drob1.GetFraction();
        drob1.div(drob2);
        drob1.GetFraction();

    }
}