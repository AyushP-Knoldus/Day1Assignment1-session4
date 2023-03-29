package com.knoldus

import scala.util.{Failure, Success, Try}

/*The following program takes list of string as input and return a new string by capitalizing all the A's present in the list.
*                                                                                                             -Ayush Pathak*/
class Capitalize {
  //Method to capitalize every occurrence of 'a' in the list.
  def capitalizeCharacterA(inputList: List[String]): List[String] = {
    //Checking exception if list is empty
    val listOfString = Try(inputList)
    //Handling exception if list is empty otherwise will return new list with modifications.
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
