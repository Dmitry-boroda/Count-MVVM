package com.example.countermvvm

interface DataSource {

    fun saveInt(key: String, value: Int)

    fun getInt(key: String): Int
}