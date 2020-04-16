package com.seungdols

import java.security.Provider
import java.security.Security

/**
 *
 * @PACKAGE com.seungdols
 * @AUTHOR  seungdols
 * @DATE    2020/04/07
 */
class Providers {
    fun getProviders(): List<Provider> {
        val providers = Security.getProviders()
        val listOfProviders: List<Provider> = providers.asList()
        return listOfProviders
    }

    fun getAllProvidersEx(filter: String): List<ProviderDetails> {

        return Security.getProviders().flatMap{ provider ->
            provider.entries.filter { it -> it.key.toString().contains(filter, true) }
                .map { ProviderDetails(provider.name, it.key.toString()) }
        }
    }
    fun getAllProviders(filter: String): List<ProviderDetails> {
        val providers = Security.getProviders()
        var listOfProviders: List<ProviderDetails> = mutableListOf<ProviderDetails>()

        providers.forEach { provider ->
            val providerDetails = provider.entries.filter { it -> it.key.toString().contains(filter, true) }
                .map { ProviderDetails(provider.name, it.key.toString()) }
            listOfProviders += providerDetails
        }
        return listOfProviders
    }

    companion object {
        fun getProviders(): List<Provider> {
            val providers = Security.getProviders()
            val listOfProviders: List<Provider> = providers.asList()
            return listOfProviders
        }
    }
}

data class ProviderDetails(val providerName: String, val name: String)
