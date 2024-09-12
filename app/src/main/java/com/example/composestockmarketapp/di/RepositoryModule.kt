package com.example.composestockmarketapp.di

import com.example.composestockmarketapp.data.csv.CSVParser
import com.example.composestockmarketapp.data.csv.CompanyListingsParser
import com.example.composestockmarketapp.data.csv.IntradayInfoParser
import com.example.composestockmarketapp.data.repository.StockRepositoryImpl
import com.example.composestockmarketapp.domain.model.CompanyListing
import com.example.composestockmarketapp.domain.model.IntradayInfo
import com.example.composestockmarketapp.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParse: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayinfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>
}