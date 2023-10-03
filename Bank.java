package com.bankBazzar;
//import com.bankBazzar.Customer;

interface Bank extends Customer
{
    abstract void loan();
    abstract void visa();
    abstract void cards();
}