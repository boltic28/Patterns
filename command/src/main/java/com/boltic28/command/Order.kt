package com.boltic28.command

class Order(val data: String){
    fun open(){
        println("->> $data open")
    }

    fun save(){
        println("->> $data save")
    }

    fun print(){
        println("->> $data print")
    }
}