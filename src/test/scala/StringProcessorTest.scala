import org.scalatest.FunSuite

/**
  * Created by bhavika on 6/25/17.
  */
class StringProcessorTest extends FunSuite {

  test("replace_non_letters")
  {
    val sp = new StringProcessor();
    assert(sp.replace_non_letters_non_numbers_with_whitespaces("bhavika $56 here whit# sp23ace") == "bhavika  56 here whit  sp23ace")
  }

  test("test_private_methods")
  {
    val sp = new StringProcessor();
    assert(sp.strip("   bhavi    ") == "bhavi")
  }

}
