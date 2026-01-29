package com.thamicoding.bank.controller

import com.thamicoding.bank.model.OverviewTransactionModel
import com.thamicoding.bank.model.TransactionModel
import com.thamicoding.bank.model.convertToDBModel
import com.thamicoding.bank.model.convertToOverviewTransactionModel
import com.thamicoding.bank.repository.TransferRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/transfer")
class TransferController(val repository: TransferRepository) {

    @PostMapping("/new")
    fun newTransfer(@RequestBody transactionModel: TransactionModel){
        repository.save(transactionModel.convertToDBModel())
    }

    @GetMapping("/all")
    fun getAllTransfers(): List<OverviewTransactionModel>{
        return repository.findAll().map { it.convertToOverviewTransactionModel() }
    }
}