import org.scalatest.diagrams.Diagrams
import org.scalatest.flatspec.AnyFlatSpecLike
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class TestHello extends AnyRef with AnyFlatSpecLike with Diagrams {

  "Hello" should "hello" in {
    Hello.hello.shouldBe("Hello")
  }

}
