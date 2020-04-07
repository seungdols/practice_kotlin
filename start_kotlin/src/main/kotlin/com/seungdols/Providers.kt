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

    companion object {
        fun getProviders(): List<Provider> {
            val providers = Security.getProviders()
            val listOfProviders: List<Provider> = providers.asList()
            return listOfProviders
        }
    }
}