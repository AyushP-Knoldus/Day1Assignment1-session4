package com.knoldus

import org.scalatest.funsuite.AnyFunSuite

class CapitalizeTest extends AnyFunSuite {
  val capitalizeObject = new Capitalize
  test("capitalizeCharacterA method should return List[String] after modification if proper list is passed") {
    val unmodifiedStringList = List("My", "name", "is", "Ayush", "Pathak")
    val modifiedStringList = capitalizeObject.capitalizeCharacterA(unmodifiedStringList)
    assert(modifiedStringList == List("My", "nAme", "is", "Ayush", "PAthAk"))
  }
  test("capitalizeCharacterA method should return empty list if invalid list is passed") {
    val emptyList = List()
    val result = capitalizeObject.capitalizeCharacterA(emptyList)
    assert(result == List())
  }

}
