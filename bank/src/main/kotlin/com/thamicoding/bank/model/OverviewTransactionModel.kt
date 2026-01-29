package com.thamicoding.bank.model

import com.thamicoding.bank.repository.TransactionDbModel
import java.util.Date

class OverviewTransactionModel (
    val targetAccount:String,
    val account_value:Double,
    val description: String,
    val date: Date,
    val id: String
)

fun TransactionDbModel.convertToOverviewTransactionModel()= OverviewTransactionModel(
    targetAccount = this.accountIdentifier,
    account_value = this.account_value,
    description = this.description,
    date = this.date,
    id = this.id.toString()
)