package ArraysAndStrings

object IsUniqueSolution {
  def isUnique(str: String): Boolean = {
    if (str == null) true
    else !str.groupBy(c => c).exists(_._2.length > 1)
  }
}
