package com.knoldus

//Driver object to display the modified list or message if list is empty.
object Driver {
  def main(args: Array[String]): Unit = {
    val list = List("My", "name", "is", "Michael", "Scott")
    val capitalizeObject = new Capitalize
    println(capitalizeObject.capitalizeCharacterA(list))
    val emptyList = List()
    val result = capitalizeObject.capitalizeCharacterA(emptyList)
    if (result == List()) {
      println("Input list is empty")
    }
  }
}