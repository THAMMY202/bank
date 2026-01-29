package com.thamicoding.bank.repository

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import java.util.Date
import java.util.UUID


@Entity
class TransactionDbModel(val accountIdentifier:String,
    val account_value: Double,
    val description: String ="") {

    @Id
    @GeneratedValue
    var id: UUID? = null

    val date: Date = Date()

}