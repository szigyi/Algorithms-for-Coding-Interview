object Permutation {

  def isPermutation(s1: String, s2: String): Boolean =
    if (s1.isEmpty) false
    else s1.toSet == s2.toSet
}
