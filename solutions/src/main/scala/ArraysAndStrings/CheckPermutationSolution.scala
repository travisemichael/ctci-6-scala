package ArraysAndStrings

object CheckPermutationSolution {
  def isPermutation(s1: String, s2: String): Boolean = {
    if (s1 == s2) true
    else if (s1 == null || s2 == null) false
    else s1.groupBy(char => char).mapValues(_.length) == s2.groupBy(char => char).mapValues(_.length)
  }
}
