/**
  * Importing a package name
  */

import java.util.regex

class AStarB {
  // Accesses java.util.regex.Pattern
  val pat = regex.Pattern.compile("a*b")
}

import bobsdelights.Fruits.{Apple, Orange}


import bobsdelights.Fruits.{Apple => McIntosh, Orange}

import java.sql.{Date => SDate}

import java.{sql => S}

import bobsdelights.Fruits.{_}

import bobsdelights.Fruits.{Apple => McIntosh, _}

import bobsdelights.Fruits.{Pear => _, _}


