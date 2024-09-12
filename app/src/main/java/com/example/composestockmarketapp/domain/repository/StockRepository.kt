package com.example.composestockmarketapp.domain.repository

import com.example.composestockmarketapp.domain.model.CompanyInfo
import com.example.composestockmarketapp.domain.model.CompanyListing
import com.example.composestockmarketapp.domain.model.IntradayInfo
import com.example.composestockmarketapp.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote:Boolean,
        query:String
    ): Flow<Resource<List<CompanyListing>>>


    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}