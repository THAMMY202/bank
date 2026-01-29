package com.thamicoding.bank.model

import com.thamicoding.bank.repository.TransactionDbModel

class TransactionModel(val targetAccount: String, val account_value: Double, val description: String = "")

fun TransactionModel.convertToDBModel() = TransactionDbModel(
    accountIdentifier =  this.targetAccount,
    account_value = this.account_value,
    description = this.description
)