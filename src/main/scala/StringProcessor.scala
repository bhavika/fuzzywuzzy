/**
* This class defines methods to process strings.
* Ideally, all the methods in this class use unicode
  strings for both input and output.
**/

class StringProcessor
{
      val regex = """[ ](?=[ ])|[^-_,A-Za-z0-9 ]+""".r

      def replace_non_letters_non_numbers_with_whitespaces(a_string: String): String =
      {
          return regex.replaceAllIn(a_string, " ")
      }

      def strip (str:String) =
      {
          str.stripPrefix(" ").stripSuffix(" ")
      }

      def to_lower_case(str: String) =
      {
          str.toLowerCase()
      }

      def to_upper_case(str: String) =
      {
          str.toUpperCase()
      }

}
