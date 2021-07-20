import kr.co.softcampus.pkg1.TestClass2
import kr.co.softcampus.pkg1.testFunction2
import kr.co.softcampus.pkg2.*
fun main() {

    val obj1: kr.co.softcampus.pkg1.TestClass1 = kr.co.softcampus.pkg1.TestClass1()
    // val obj1 = kr.co.softcampus.pkg1.TestClass1() // 타입 생략 가능
    obj1.testMethod1()
    println(obj1.testMethod1(100))

    kr.co.softcampus.pkg1.testFunction1() // 파일 내부의 메소드는 바로 접근 가능
    println(kr.co.softcampus.pkg1.testFunction1(999))

    val obj2 = TestClass2()
    obj2.testMethod2()

    testFunction2()

    TestClass3().testMethod3()
    TestClass4().testMethod4()

    val obj3 = TestClass3()
    val obj4 = TestClass4()

    obj3.testMethod3()
    obj4.testMethod4()
}