/**
  * Created by bhavika on 7/16/17.
  */

class Utils {

  /***
    * Check the input has length > 0
    * @param str: String
    * @return True if length > 0, else False
    */
  def validate_string(str: String) : Boolean =
  {
      return str.length() > 0
  }

//  def asciionly(str)
//  {}

  def ascii_strict(s: String): String = {
    ""
  }


  /***
      Process string by
        -- removing non-alphanumeric characters
        -- trim whitespaces
        -- force to lower case
    * @param s : original String
    * @param force_ascii: whether ascii conversion is required
    * @return String
    */
  def full_process(s: String, force_ascii: Boolean = false): String =
  {
      var string_out = ""

      if (s == None)
        {
          return ""
        }

      if (force_ascii == true) {
        string_out = ascii_strict(s)
      }

      string_out = StringProcessor.replace_non_letters_non_numbers_with_whitespaces(string_out)
      string_out = StringProcessor.to_lower_case(string_out)
      string_out = StringProcessor.strip(string_out)

      return string_out
  }

}
