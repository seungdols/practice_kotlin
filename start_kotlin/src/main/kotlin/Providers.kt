import java.security.Provider
import java.security.Security

/**
 *
 * @PACKAGE
 * @AUTHOR  seungdols
 * @DATE    2020/04/07
 */

fun getProviders(): List<Provider> {
    val providers = Security.getProviders()
    val listOfProviders: List<Provider> = providers.asList()
    return listOfProviders
}