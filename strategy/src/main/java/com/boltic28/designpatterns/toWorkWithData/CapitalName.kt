package com.boltic28.designpatterns.toWorkWithData

class CapitalName: DataWorker {
    override fun provideName(name: String) {
        print("${name.toUpperCase()}: ")
    }
}