package jlin2.examples.localtesting
import  org.junit.Test
import org.junit.Assert.*

class EmailValidatorTest {
   // Test case to validate a correct email address format.
    @Test
    fun testValidateAddress() {
        val result = EmailValidator.isValidEmail("123@abc.com")
        assertEquals(true,result)

    }
   // Test case to validate a correct email address subdomain format.
    @Test
    fun testValidEmailSubdomainFormat(){
        var result = EmailValidator.isValidEmail("123@abc.co.ca")
        assertEquals(true,result)
    }
    // Test case to validate an incorrect email address format (missing Domain)
    @Test
    fun testInvalidEmailMissingId(){
        var result = EmailValidator.isValidEmail("123@abc")
        assertEquals(false,result)
    }
    
    // Test case to validate an incorrect email address format (double dots in domain)
    @Test
    fun testInvalidEmailDoubleDotInDomain() {
        var result = EmailValidator.isValidEmail("123@abc..com")
        assertEquals(false,result)
    }
    
    // Test case to validate an incorrect email address format (missing username)
    @Test
    fun testInvalidEmailMissingUsername() {
        var result = EmailValidator.isValidEmail("@abc.com")
        assertEquals(false,result)
    }
    
    // Test case to validate an incorrect email address format (missing domain)
    @Test
    fun testInvalidEmailMissingDomain() {
        var result = EmailValidator.isValidEmail("testing123")
        assertEquals(false,result)
    }
    
    // Test case to validate an incorrect email address format (empty string)
    @Test
    fun testInvalidEmptyEmail() {
        var result = EmailValidator.isValidEmail("")
        assertEquals(false,result)
    }
    
    // Test case to validate an incorrect email address format (null value)
    @Test
    fun testInvalidNullEmail(){
        var result = EmailValidator.isValidEmail(null)
        assertEquals(false,result)
    }
    @Test
    fun testInvalidEmailWithSpecialCharacters() {
        val result = EmailValidator.isValidEmail("123@abc!xyz.com")
        assertEquals(false, result)
    }

    @Test
    fun testInvalidEmailWithWhitespace() {
        val result = EmailValidator.isValidEmail("abc @example.com")
        assertEquals(false, result)
    }
}

