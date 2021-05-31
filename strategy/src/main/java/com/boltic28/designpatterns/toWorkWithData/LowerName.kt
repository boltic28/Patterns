package com.boltic28.designpatterns.toWorkWithData

class LowerName: DataWorker {
    override fun provideName(name: String) {
        print("${name.toLowerCase()}: ")
    }
}