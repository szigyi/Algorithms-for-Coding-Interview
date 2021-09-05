object IsUniqueString {

  def isUnique(s: String): Boolean = {
    if (s.isEmpty) false
    else s.toSet.size == s.length
  }
}
