package jlin2.examples.localtesting
import  org.junit.Test
import org.junit.Assert.*

class EmailValidatorTest {

    @Test
    fun testValidateAddress() {
        val result = EmailValidator.isValidEmail("123@abc.com")
        assertEquals(true,result)

    }

    @Test
    fun testValidEmailSubdomainFormat(){
        var result = EmailValidator.isValidEmail("123@abc.co.ca")
        assertEquals(true,result)
    }

    @Test
    fun testInvalidEmailMissingId(){
        var result = EmailValidator.isValidEmail("123@abc")
        assertEquals(false,result)
    }

    @Test
    fun testInvalidEmailDoubleDotInDomain() {
        var result = EmailValidator.isValidEmail("123@abc..com")
        assertEquals(false,result)
    }

    @Test
    fun testInvalidEmailMissingUsername() {
        var result = EmailValidator.isValidEmail("@abc.com")
        assertEquals(false,result)
    }

    @Test
    fun testInvalidEmailMissingDomain() {
        var result = EmailValidator.isValidEmail("testing123")
        assertEquals(false,result)
    }

    @Test
    fun testInvalidEmptyEmail() {
        var result = EmailValidator.isValidEmail("")
        assertEquals(false,result)
    }

    @Test
    fun testInvalidNullEmail(){
        var result = EmailValidator.isValidEmail(null)
        assertEquals(false,result)
    }
}

