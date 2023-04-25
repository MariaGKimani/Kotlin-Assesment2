fun main() {
   println( random("KotlinFundamentals"))

    password1("Mgmkim.05kim")
    password1("cat")
//   multiples()

   var  currentAccount = CurrentAccount(1111222200,"MariaKImni",200000.0)
        currentAccount.deposit(200000.0)
        currentAccount.withdraw(2000.0)
         currentAccount.details()
    println(currentAccount)
}


//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun random(str:String): Triple<Char.Companion, Char.Companion, Int.Companion> {
    var firstChar = str.first()
    var lastChar = str.last()
    var length = str.length
    return  Triple(Char,Char,Int)

}




//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false

fun password1(password2:String){
   if(password2.length in 9..15){
       println("valid password")
   }else if(password2.any { it.isDigit() }){
       println("valid password")
   }else if(password2 !="password1"){
       println("valid password")
   }else{
       println("Invalid")
   }
}




//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiples() {
    for (x in 1..1000) {
        if (x % 6 == 0 && x % 8 == 0) {
            println("Bingo!")
        } else if (x % 8== 0) {
            println("mutiple of 8")
        } else if (x % 6 == 0) {
            println("multiple of 6")
        }
    }
}


//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
// deposit(amount: Double) - Increments the balance by the amount
//deposited
// withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”
open  class CurrentAccount(val accountNumber: Int, val accountName: String, var balance: Double) {

    fun deposit(cash: Double) {
        balance += cash
    }

     open fun withdraw(cash: Double) {
        balance -= cash
    }

    fun details() {
        println("AccountNumber  $accountNumber with balance $balance is operated by $accountName")
    }
}


//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal (6pts)

class SavingsAccount( accountNumber: Int, accountName: String, balance: Double) :CurrentAccount(accountNumber,accountName,balance){
         var withdrawals = 0

            override fun withdraw(money: Double) {
                if (withdrawals > 4) {
                    println("Go ahead")
                }
                super.withdraw(money)
                withdrawals++
            }
        }





















//fun main() {
//    val input = "example string"
//    val (firstChar, lastChar, length, startsWithVowel) = analyzeString(input)
//    println("First character: $firstChar")
//    println("Last character: $lastChar")
//    println("Length: $length")
//    println("Starts with vowel? $startsWithVowel")
//}
//
//fun analyzeString(input: String): Triple<Char, Char, Int> {
//    val firstChar = input.first()
//    val lastChar = input.last()
//    val length = input.length
//    val startsWithVowel = listOf('a', 'e', 'i', 'o', 'u').contains(firstChar.toLowerCase())
//
//    return Triple(firstChar, lastChar, length, startsWithVowel)
//}