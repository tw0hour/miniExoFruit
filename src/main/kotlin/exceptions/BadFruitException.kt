package exceptions

import java.lang.Exception

class BadFruitException(var seriousMessage : String) : Exception(seriousMessage){
}