# Day1Assignment1-session4
## Problem Statement
To write a program to capitalize all 'A's in a list:  
Sample input: List("My", "name", "is", "Michael", "Scott")  
Sample output: List("My", "nAme", 'is", "MichAel", "Scott")  
##Source Code
package com.knoldus

import scala.util.{Failure, Success, Try}

class Capitalize {  
  def capitalizeCharacterA(inputList: List[String]): List[String] = {   
    val listOfString = Try(inputList)  
    listOfString match {  
      case Failure(_) => List()  
      case Success(value) =>  
        value.map {  
          element =>  
            if (element.contains('a')) {  
              element.replace('a', 'A')  
            }  
            else {  
              element  
            }  
        }  
    }  
  }  
}  
